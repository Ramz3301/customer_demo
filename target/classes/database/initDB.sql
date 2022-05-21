DROP TABLE customers;

CREATE TABLE IF NOT EXISTS customers
(
    id         BIGSERIAL PRIMARY KEY,
    first_name VARCHAR(50)  NOT NULL,
    last_name  VARCHAR(50)  NOT NULL,
    address    VARCHAR(100) NOT NULL,
    budget     DECIMAL      NOT NULL
);