create database `demo` character set utf8mb4;

use demo;

# ======================================================

DROP TABLE IF EXISTS `user`;

CREATE TABLE user(
  id INT PRIMARY KEY,
  username VARCHAR(20),
  password VARCHAR(20),
  status CHAR(3)
);

INSERT INTO `user` (id, username, `password`, `status`) values (1, 'test', 'password', 'on');
# ======================================================

