CREATE SCHEMA `mindty` ;

USE mysql;

CREATE USER 'mindty_user'@'localhost' IDENTIFIED BY 'M123';
GRANT ALL PRIVILEGES ON mindty.* TO 'mindty_user'@'localhost';
FLUSH PRIVILEGES;