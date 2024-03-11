ALTER TABLE usuarios DROP COLUMN tipoDeUsuario;
ALTER TABLE usuarios ADD tipo_de_usuario varchar(100) not null;