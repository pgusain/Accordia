-- schema.sql
-- Tables for TenantDbo, UserDbo, CustomerDbo, WorkItemDbo

CREATE TABLE IF NOT EXISTS tenants (
    id bigserial PRIMARY KEY,
    code varchar(128),
    description text,
    is_active boolean NOT NULL DEFAULT true,
    created_by varchar(255),
    updated_by varchar(255),
    created_at timestamptz NOT NULL DEFAULT now(),
    updated_at timestamptz NOT NULL DEFAULT now()
);

CREATE INDEX IF NOT EXISTS idx_tenants_code ON tenants(code);
CREATE INDEX IF NOT EXISTS idx_tenants_is_active ON tenants(is_active);

CREATE TABLE IF NOT EXISTS users (
    id bigserial PRIMARY KEY,
    tenant_id varchar(128),           -- UserDbo.tenantId is String
    username varchar(150),
    email varchar(255),
    password_hash bytea,              -- maps Java char[] to bytea
    is_active boolean NOT NULL DEFAULT true,
    created_by varchar(255),
    updated_by varchar(255),
    created_at timestamptz NOT NULL DEFAULT now(),
    updated_at timestamptz NOT NULL DEFAULT now()
);

CREATE INDEX IF NOT EXISTS idx_users_tenant_id ON users(tenant_id);
CREATE INDEX IF NOT EXISTS idx_users_username ON users(username);
CREATE INDEX IF NOT EXISTS idx_users_email ON users(email);

CREATE TABLE IF NOT EXISTS customers (
    id bigserial PRIMARY KEY,
    tenant_id varchar(128),           -- CustomerDbo.tenantId is String
    is_active boolean NOT NULL DEFAULT true,
    created_by varchar(255),
    updated_by varchar(255),
    created_at timestamptz NOT NULL DEFAULT now(),
    updated_at timestamptz NOT NULL DEFAULT now()
);

CREATE INDEX IF NOT EXISTS idx_customers_tenant_id ON customers(tenant_id);
CREATE INDEX IF NOT EXISTS idx_customers_is_active ON customers(is_active);

CREATE TABLE IF NOT EXISTS work_items (
    id bigserial PRIMARY KEY,
    tenant_id bigint,                -- WorkItemDbo.tenantId is Long
    customer_id bigint,              -- WorkItemDbo.customerId is Long
    work_flow_id bigint,
    work_item_type varchar(128),
    description text,
    status varchar(64),
    created_by varchar(255),
    updated_by varchar(255),
    created_at timestamptz NOT NULL DEFAULT now(),
    updated_at timestamptz NOT NULL DEFAULT now()
);

CREATE INDEX IF NOT EXISTS idx_work_items_tenant_id ON work_items(tenant_id);
CREATE INDEX IF NOT EXISTS idx_work_items_customer_id ON work_items(customer_id);
CREATE INDEX IF NOT EXISTS idx_work_items_status ON work_items(status);
