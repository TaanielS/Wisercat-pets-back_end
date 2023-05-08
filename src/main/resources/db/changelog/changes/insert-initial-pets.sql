--liquibase formatted SQL
--changeset admin:2
INSERT INTO pet ("CODE", "NAME", "TYPE", "FUR_COLOR", "COUNTRY") VALUES (202211151535, 'Mustikas', 'Cat', 'Black', 'Estonia');
INSERT INTO pet ("CODE", "NAME", "TYPE", "FUR_COLOR", "COUNTRY") VALUES (202211151536, 'Roy', 'Dog', 'Brown', 'Latvia');
INSERT INTO pet ("CODE", "NAME", "TYPE", "FUR_COLOR", "COUNTRY") VALUES (202211151537, 'Charles', 'Horse', 'White', 'Norway');

INSERT INTO options ("ID", "TYPE", "FUR_COLOR", "COUNTRY") VALUES (1, 'Cat;Dog;Horse;Rabbit;Parrot', 'Black;White;Brown;Yellow;Blue', 'Estonia;Latvia;Lithuania;Finland;Sweden;Norway');

INSERT INTO users ("ID", "USERNAME", "PASSWORD", "ROLES") VALUES (1, 'John', '12345', '0');
INSERT INTO users ("ID", "USERNAME", "PASSWORD", "ROLES") VALUES (2, 'CatLover29', 'mjau', '1');
INSERT INTO users ("ID", "USERNAME", "PASSWORD", "ROLES") VALUES (3, 'Test', 'test', '2');