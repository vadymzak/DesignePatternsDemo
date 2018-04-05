CREATE DATABASE IF NOT EXISTS lesson;

USE lesson;

CREATE TABLE IF NOT EXISTS country (
  id INT AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(30)
);

CREATE TABLE IF NOT EXISTS city (
  id INT AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(30),
  country_id INT,
  CONSTRAINT foregin_key_country_id FOREIGN KEY (country_id) REFERENCES country(id)
    ON UPDATE CASCADE
    ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS user (
  id INT AUTO_INCREMENT PRIMARY KEY,
  firstname VARCHAR(30),
  lastname VARCHAR(30),
  login VARCHAR(30),
  password VARCHAR(30),
  city_id INT,
  CONSTRAINT foregin_key_city_id  FOREIGN KEY (city_id) REFERENCES city(id)
    ON UPDATE CASCADE
    ON DELETE CASCADE
);

CREATE TABLE role (
  id INT AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(30),
  description VARCHAR(30)
);

CREATE TABLE user_role (
  user_id INT,
  role_id INT,
  CONSTRAINT foregin_key_user_id FOREIGN KEY (user_id) REFERENCES user(id),
  CONSTRAINT foregin_key_role_id FOREIGN KEY (role_id) REFERENCES role(id)
    ON UPDATE CASCADE
    ON DELETE CASCADE
);

CREATE TABLE product_category (
  id INT AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(30)
);

CREATE TABLE product (
  id INT AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(30),
  description VARCHAR(50),
  count INT,
  price INT,
  product_category_id INT,
  CONSTRAINT foregin_key_product_category_id FOREIGN KEY (product_category_id) REFERENCES product_category(id)
    ON UPDATE CASCADE
    ON DELETE CASCADE
);

CREATE TABLE orders(
  id         INT AUTO_INCREMENT PRIMARY KEY,
  user_id    INT,
  product_id INT,
  date       DATE,
  CONSTRAINT f_key_user_id FOREIGN KEY (user_id) REFERENCES user (id),
  CONSTRAINT f_key_product_id FOREIGN KEY (product_id) REFERENCES product (id)
    ON UPDATE CASCADE
    ON DELETE CASCADE
);