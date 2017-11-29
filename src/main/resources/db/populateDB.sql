DELETE FROM user_roles;
DELETE FROM meals;
DELETE FROM restaurants;
DELETE FROM users;

INSERT INTO users (name, email, password) VALUES
  ('Admin', 'admin@gmail.com', 'admin'),
  ('User', 'user@yandex.ru', 'password');

INSERT INTO user_roles (role, user_id) VALUES
  ('ROLE_ADMIN', 1),
  ('ROLE_USER', 2);

INSERT INTO restaurants (user_id, name) VALUES
  (1, 'Mc Donald'),
  (2, 'Tempo');

INSERT INTO  meals (name, price, restaurant_id) VALUES
  ('tobacco chicken', 2, 1),
  ('vegetable salad', 1, 1),
  ('coca-cola', 1, 1),
  ('mushroom pizza', 3, 2),
  ('ice cream', 2, 2),
  ('tea', 1, 2);

