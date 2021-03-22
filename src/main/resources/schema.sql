DROP TABLE IF EXISTS public.users_table;
CREATE TABLE users_table (id SERIAL PRIMARY KEY, username VARCHAR(255), password VARCHAR(4096), active BOOLEAN);
INSERT INTO users_table (username, password, active) values ('user1', '1234', true);
INSERT INTO users_table (username, password, active) values ('user2', '1234', false);
INSERT INTO users_table (username, password, active) values ('user3', '1234', true);
INSERT INTO users_table (username, password, active) values ('user4', '1234', false);
INSERT INTO users_table (username, password, active) values ('user5', '1234', true);
INSERT INTO users_table (username, password, active) values ('user6', '1234', false);
INSERT INTO users_table (username, password, active) values ('user7', '1234', false);