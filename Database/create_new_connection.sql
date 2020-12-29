CREATE USER 'oodpetfinder'@'localhost' IDENTIFIED BY 'oodpetfinder';

GRANT ALL PRIVILEGES ON * . * TO 'oodpetfinder'@'localhost';

ALTER USER 'oodpetfinder'@'localhost' IDENTIFIED WITH mysql_native_password BY 'oodpetfinder';