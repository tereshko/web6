drop table IF EXISTS customer_product CASCADE;
drop table IF EXISTS product CASCADE;
drop table IF EXISTS customer CASCADE;


create TABLE product (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(200) NULL,
  price INT NULL,
  PRIMARY KEY (`id`));

insert into product (name, price) values
('milk', 10),
('water', 11),
('meat', 15),
('ice', 1),
('tv', 4),
('snack', 2),
('hotdog', 56),
('chease creme', 4),
('sea food', 55),
('pizza', 7),
('apple', 4),
('garlick', 10),
('rice', 5);



create TABLE customer (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(200) NULL,
  PRIMARY KEY (`id`));

insert into customer (name) values
('Anton'),
('Sergey'),
('Slava'),
('Dima'),
('Pavel');



create TABLE customer_product (
  customer_id INT NOT NULL,
  product_id INT NOT NULL,
  FOREIGN KEY(customer_id) REFERENCES customer (id),
  FOREIGN KEY(product_id) REFERENCES product (id));

insert into customer_product (customer_id, product_id) values
(1,2),
(1,4),
(1,1),
(2,3),
(3,2),
(4,3),
(5,3),
(1,5),
(2,5),
(3,5),
(4,5),
(5,5);