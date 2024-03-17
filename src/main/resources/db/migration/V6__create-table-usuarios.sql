CREATE TABLE usuarios
(
    id          BIGINT PRIMARY KEY AUTO_INCREMENT,
    login       VARCHAR(255) UNIQUE NOT NULL,
    clave       VARCHAR(255)        NOT NULL,
    id_paciente BIGINT,
    FOREIGN KEY (id_paciente) REFERENCES pacientes (id),

    id_role     BIGINT,
    FOREIGN KEY (id_role) REFERENCES roles (id),
    UNIQUE (login)
);