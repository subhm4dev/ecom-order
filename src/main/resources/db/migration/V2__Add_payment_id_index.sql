-- Add index on payment_id for efficient order lookup by payment ID
-- Used for idempotency checks in checkout service
CREATE INDEX IF NOT EXISTS idx_order_payment_id ON orders(payment_id);

-- Add composite index for efficient lookup by payment_id, user_id, and tenant_id
-- This optimizes the findByPaymentIdAndUserIdAndTenantId query
CREATE INDEX IF NOT EXISTS idx_order_payment_user_tenant ON orders(payment_id, user_id, tenant_id);

