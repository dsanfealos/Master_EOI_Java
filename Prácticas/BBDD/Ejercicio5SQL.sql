/*Ejercicio 5*/
CREATE DATABASE IF NOT EXISTS ejercicios DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci;
USE ejercicios;

/*Comentarios. Creamos tabla*/
CREATE TABLE usuarios (
  id INT AUTO_INCREMENT,
  usuario VARCHAR(20),
  nombre VARCHAR(20),
  sexo VARCHAR(1),
  nivel TINYINT,
  email VARCHAR(50),
  telefono VARCHAR(20),
  marca VARCHAR(20),
  compañia VARCHAR(20),
  saldo FLOAT,
  activo BOOLEAN,
  PRIMARY KEY (id));	/*Se puede escribir así o todo junto arriba*/

INSERT INTO usuarios(usuario,nombre,sexo,nivel,email,telefono) VALUES("BRE2271","BRENDA","M",2,"brenda@gmail.com","914567892")