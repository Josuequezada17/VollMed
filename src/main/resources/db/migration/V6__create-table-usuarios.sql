CREATE TABLE usuarios
(
    id_usuario  BIGINT PRIMARY KEY AUTO_INCREMENT,
    login       VARCHAR(255),
    clave       VARCHAR(255),
    id_paciente BIGINT,                                 -- Se asume que id_paciente es una referencia externa a la tabla paciente
    FOREIGN KEY (id_paciente) REFERENCES paciente (id), -- Se debe especificar la clave foránea a la tabla paciente
    UNIQUE (login)                                      -- Se asume que el login debe ser único
);