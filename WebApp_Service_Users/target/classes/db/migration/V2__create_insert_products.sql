CREATE TABLE products (
    product_id SERIAL PRIMARY KEY,
    product_name VARCHAR(255),
    price DOUBLE PRECISION,
    in_stock INT
);

INSERT INTO products (product_name, price, in_stock) VALUES
('Smartphone', 599.99, 50),
('Laptop', 1299.99, 20),
('Smartwatch', 199.99, 100),
('Tablet', 399.99, 30),
('Headphones', 99.99, 150),
('Keyboard', 49.99, 200),
('Mouse', 29.99, 300),
('Monitor', 179.99, 40),
('Charger', 19.99, 500),
('Camera', 499.99, 10);
