ALTER TABLE usuarios
    ADD id_paciente BIGINT,
ADD FOREIGN KEY (id_paciente) REFERENCES pacientes(id);