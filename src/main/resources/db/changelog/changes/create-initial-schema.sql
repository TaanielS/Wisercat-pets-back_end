--changeset admin:1
CREATE TABLE pet (
  code LONG PRIMARY KEY NOT NULL,
  name VARCHAR(50) NOT NULL,
  type VARCHAR(50) NOT NULL,
  fur_color VARCHAR(50) NOT NULL,
  country VARCHAR(50) NOT NULL,
  CONSTRAINT chk_type CHECK (type in ('Cat', 'Dog', 'Horse', 'Rabbit', 'Parrot')),
  CONSTRAINT chk_furcolor CHECK (fur_color in ('Black', 'White', 'Brown', 'Yellow', 'Blue')),
  CONSTRAINT chk_country CHECK (country in ('Estonia', 'Latvia', 'Lithuania', 'Finland', 'Sweden', 'Norway'))
);

CREATE TABLE options (
  id INTEGER PRIMARY KEY,
  type VARCHAR(50),
  fur_color VARCHAR(50),
  country VARCHAR(50)
);