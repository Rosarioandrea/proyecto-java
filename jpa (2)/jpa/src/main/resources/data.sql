INSERT INTO clientes (nombre, email) VALUES
('Juan Pérez', 'juan.perez@example.com'),
('María López', 'maria.lopez@example.com'),
('Carlos García', 'carlos.garcia@example.com'),
('Laura Martínez', 'laura.martinez@example.com'),
('Pedro Fernández', 'pedro.fernandez@example.com');

INSERT INTO libros (titulo, autor, precio) VALUES
('Cien años de soledad', 'Gabriel García Márquez', 25.00),
('Don Quijote de la Mancha', 'Miguel de Cervantes', 20.00),
('La sombra del viento', 'Carlos Ruiz Zafón', 15.00),
('El amor en los tiempos del cólera', 'Gabriel García Márquez', 18.00),
('1984', 'George Orwell', 10.00);


INSERT INTO ventas (cliente_id, producto_id, cantidad, fecha) VALUES
(1, 1, 1, '2024-01-15'),
(2, 2, 2, '2024-01-16'),
(3, 3, 1, '2024-01-17'),
(4, 4, 1, '2024-01-18'),
(5, 5, 3, '2024-01-19'),
(1, 2, 1, '2024-01-20'),
(2, 3, 2, '2024-01-21');