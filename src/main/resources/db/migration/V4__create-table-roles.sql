CREATE TABLE roles
(
    id_role BIGINT PRIMARY KEY AUTO_INCREMENT,
    nombre  VARCHAR(255) UNIQUE -- Se asume que el nombre del rol debe ser único
);