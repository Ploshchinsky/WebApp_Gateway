CREATE TABLE orders (
                        order_id SERIAL PRIMARY KEY,
                        user_id INT REFERENCES users(user_id),
                        product_id INT REFERENCES products(product_id),
                        amount INT
);

INSERT INTO orders (user_id, product_id, amount) VALUES
                                                     (1, 1, 2),
                                                     (2, 2, 1),
                                                     (3, 3, 3),
                                                     (4, 4, 1),
                                                     (5, 5, 5),
                                                     (6, 6, 1),
                                                     (7, 7, 4),
                                                     (8, 8, 1),
                                                     (9, 9, 2),
                                                     (10, 10, 1);
