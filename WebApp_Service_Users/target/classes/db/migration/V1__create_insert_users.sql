CREATE TABLE users (
    user_id SERIAL PRIMARY KEY,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    age INT,
    gender CHAR(1) CHECK (gender IN ('M', 'F'))
);

INSERT INTO users (first_name, last_name, age, gender) VALUES
('John', 'Doe', 30, 'M'),
('Jane', 'Smith', 28, 'F'),
('Tom', 'Johnson', 34, 'M'),
('Emily', 'Williams', 22, 'F'),
('Michael', 'Brown', 40, 'M'),
('Anna', 'Davis', 25, 'F'),
('Robert', 'Garcia', 36, 'M'),
('Laura', 'Martinez', 29, 'F'),
('James', 'Miller', 31, 'M'),
('Sarah', 'Taylor', 27, 'F');
