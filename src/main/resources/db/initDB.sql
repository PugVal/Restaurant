DROP TABLE IF EXISTS user_roles;
DROP TABLE IF EXISTS meals;
DROP TABLE IF EXISTS restaurants;
DROP TABLE IF EXISTS users;

CREATE TABLE users
(
  id               SERIAL PRIMARY KEY,
  name             VARCHAR                 NOT NULL,
  email            VARCHAR                 NOT NULL,
  password         VARCHAR                 NOT NULL,
  votingDateTime   TIMESTAMP DEFAULT now() NOT NULL,
  VOTES_PER_DAY     INTEGER DEFAULT 1    NOT NULL
);
CREATE UNIQUE INDEX users_unique_email_idx ON users (email);

CREATE TABLE user_roles
(
  user_id INTEGER NOT NULL,
  role    VARCHAR,
  CONSTRAINT user_roles_idx UNIQUE (user_id, role),
  FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE
);

CREATE TABLE restaurants (
  id                 SERIAL PRIMARY KEY,
  user_id INTEGER NOT NULL,
  name               TEXT      NOT NULL,
  FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE
);

CREATE TABLE meals (
  id                 SERIAL PRIMARY KEY,
  name               TEXT      NOT NULL,
  price              INT       NOT NULL,
  restaurant_id       INT       NOT NULL,
  FOREIGN KEY (restaurant_id) REFERENCES restaurants (id) ON DELETE CASCADE
);



