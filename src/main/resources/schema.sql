DROP TABLE IF EXISTS users_table;
CREATE TABLE users_table (id SERIAL PRIMARY KEY, username VARCHAR(255), password VARCHAR(4096), active BOOLEAN);