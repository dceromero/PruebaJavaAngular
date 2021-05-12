create database prueba_java;

use prueba_java;

create table roles(
id_rol int not null,
name_rol varchar(30) not null,
constraint pkRolesId primary key(id_rol) 
)ENGINE=InnoDB;

insert into roles values(1,'ADMINISTRADOR'),(2,'AUDITOR'),(3,'AUXILIAR');

create table usuarios(
id_usuario int not null auto_increment,
constraint pkUsuariosId primary key (id_usuario),
id_rol int not null,
constraint fkUsuarioIDRol foreign key(id_rol) references roles(id_rol),
nombre varchar(100) not null,
activo char not null
)ENGINE=InnoDB;

create view v_usuarios as
select u.id_usuario, r.name_rol ,u.nombre, u.activo
from Usuarios as u
inner join roles as r on r.id_rol = u.id_rol;