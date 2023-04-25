--changeset admin:1
CREATE TABLE pet (
  code LONG PRIMARY KEY,
  name VARCHAR(50),
  type VARCHAR(50),
  fur_color VARCHAR(50),
  country VARCHAR(50)
);