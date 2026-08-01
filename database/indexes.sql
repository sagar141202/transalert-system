-- Transactions

CREATE INDEX idx_transaction_account
    ON transactions(account_number);

CREATE INDEX idx_transaction_time
    ON transactions(transaction_time);

-- Alerts

CREATE INDEX idx_alert_status
    ON alerts(status);

CREATE INDEX idx_alert_created
    ON alerts(created_at);

-- Rules

CREATE INDEX idx_rule_enabled
    ON rules(enabled);