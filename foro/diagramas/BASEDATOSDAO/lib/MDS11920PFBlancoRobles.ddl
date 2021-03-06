CREATE TABLE Notificacion (IdNotificacion int(10) NOT NULL AUTO_INCREMENT, UsuariosIdUsuario int(10) NOT NULL, Titulo varchar(255), IdUsuarioPropietario int(10) NOT NULL, DescripcionCampo varchar(255), PRIMARY KEY (IdNotificacion)) ENGINE=InnoDB;
CREATE TABLE Mensaje (IdMensaje int(10) NOT NULL AUTO_INCREMENT, TemaIdTema int(10) NOT NULL, UsuariosIdUsuario int(10) NOT NULL, Contenido varchar(255), Subtitulo varchar(255), NumMg int(10) NOT NULL, FechaCreacion bigint(20) NOT NULL, NumTotalMensajes int(10) NOT NULL, IdTemaPropietario int(10) NOT NULL, Titulo varchar(255), IdPropietario int(10) NOT NULL, IdMedia int(10) NOT NULL, Publico tinyint(1) NOT NULL, Eliminado tinyint(1) NOT NULL, PRIMARY KEY (IdMensaje)) ENGINE=InnoDB;
CREATE TABLE Moderador (IdMod int(10) NOT NULL, UsuariosIdUsuario int(10) NOT NULL, PRIMARY KEY (UsuariosIdUsuario)) ENGINE=InnoDB;
CREATE TABLE Seccion (IdSeccion int(10) NOT NULL AUTO_INCREMENT, UsuariosIdUsuario int(10) NOT NULL, ImagenSeccion varchar(255), Creador varchar(255), Titulo varchar(255), Descripcion varchar(255), Fecha bigint(20) NOT NULL, IdPropietarioSeccion int(10) NOT NULL, Publico tinyint(1) NOT NULL, Privado tinyint(1) NOT NULL, Oculto tinyint(1) NOT NULL, Eliminado tinyint(1) NOT NULL, PRIMARY KEY (IdSeccion)) ENGINE=InnoDB;
CREATE TABLE Tema (IdTema int(10) NOT NULL AUTO_INCREMENT, SeccionIdSeccion int(10) NOT NULL, UsuariosIdUsuario int(10) NOT NULL, Titulo varchar(255), Fecha bigint(20) NOT NULL, Descripcion varchar(255), IdTemaPropietario int(10) NOT NULL, Publico tinyint(1) NOT NULL, Privado tinyint(1) NOT NULL, Oculto tinyint(1) NOT NULL, Eliminado tinyint(1) NOT NULL, PRIMARY KEY (IdTema)) ENGINE=InnoDB;
CREATE TABLE Usuarios (IdUsuario int(10) NOT NULL AUTO_INCREMENT, Email varchar(255), Descripcion varchar(255), NombreUsuario varchar(255), Nombre varchar(255), Contraseña varchar(255), FotoPerfil varchar(255), Amonestado tinyint(1) NOT NULL, Sancionado tinyint(1) NOT NULL, Publico tinyint(1) NOT NULL, Oculto tinyint(1) NOT NULL, PRIMARY KEY (IdUsuario)) ENGINE=InnoDB;
CREATE TABLE Anuncio (IdAnuncio int(10) NOT NULL AUTO_INCREMENT, Imagen varchar(255), Publicado tinyint(1) NOT NULL, PRIMARY KEY (IdAnuncio)) ENGINE=InnoDB;
CREATE TABLE Ticket (IdTicket int(10) NOT NULL AUTO_INCREMENT, UsuariosIdUsuario int(10) NOT NULL, Texto varchar(255), IdUsuarioPropietarioTicket int(10), Abierto tinyint(1) NOT NULL, Cerrado tinyint(1) NOT NULL, PRIMARY KEY (IdTicket)) ENGINE=InnoDB;
CREATE TABLE imagenes (mediaIdMedia int(10) NOT NULL, MensajeIdMensaje int(10) NOT NULL, PRIMARY KEY (mediaIdMedia)) ENGINE=InnoDB;
CREATE TABLE media (IdMedia int(10) NOT NULL AUTO_INCREMENT, Url varchar(255), PRIMARY KEY (IdMedia)) ENGINE=InnoDB;
CREATE TABLE Administrador (UsuariosIdUsuario int(10) NOT NULL, PRIMARY KEY (UsuariosIdUsuario)) ENGINE=InnoDB;
CREATE TABLE videos (mediaIdMedia int(10) NOT NULL, MensajeIdMensaje int(10) NOT NULL, PRIMARY KEY (mediaIdMedia)) ENGINE=InnoDB;
CREATE TABLE Usuarios_Usuarios (UsuariosIdUsuario int(10) NOT NULL, UsuariosIdUsuario2 int(10) NOT NULL, PRIMARY KEY (UsuariosIdUsuario, UsuariosIdUsuario2)) ENGINE=InnoDB;
ALTER TABLE Moderador ADD CONSTRAINT FKModerador408542 FOREIGN KEY (UsuariosIdUsuario) REFERENCES Usuarios (IdUsuario);
ALTER TABLE imagenes ADD CONSTRAINT FKimagenes101868 FOREIGN KEY (mediaIdMedia) REFERENCES media (IdMedia);
ALTER TABLE Administrador ADD CONSTRAINT FKAdministra940674 FOREIGN KEY (UsuariosIdUsuario) REFERENCES Usuarios (IdUsuario);
ALTER TABLE videos ADD CONSTRAINT FKvideos192906 FOREIGN KEY (mediaIdMedia) REFERENCES media (IdMedia);
ALTER TABLE Tema ADD CONSTRAINT FKTema54155 FOREIGN KEY (UsuariosIdUsuario) REFERENCES Usuarios (IdUsuario);
ALTER TABLE Mensaje ADD CONSTRAINT FKMensaje665283 FOREIGN KEY (UsuariosIdUsuario) REFERENCES Usuarios (IdUsuario);
ALTER TABLE Notificacion ADD CONSTRAINT FKNotificaci390464 FOREIGN KEY (UsuariosIdUsuario) REFERENCES Usuarios (IdUsuario);
ALTER TABLE imagenes ADD CONSTRAINT FKimagenes489188 FOREIGN KEY (MensajeIdMensaje) REFERENCES Mensaje (IdMensaje);
ALTER TABLE videos ADD CONSTRAINT FKvideos580226 FOREIGN KEY (MensajeIdMensaje) REFERENCES Mensaje (IdMensaje);
ALTER TABLE Tema ADD CONSTRAINT FKTema655261 FOREIGN KEY (SeccionIdSeccion) REFERENCES Seccion (IdSeccion);
ALTER TABLE Usuarios_Usuarios ADD CONSTRAINT amigos FOREIGN KEY (UsuariosIdUsuario) REFERENCES Usuarios (IdUsuario);
ALTER TABLE Usuarios_Usuarios ADD CONSTRAINT amigos2 FOREIGN KEY (UsuariosIdUsuario2) REFERENCES Usuarios (IdUsuario);
ALTER TABLE Seccion ADD CONSTRAINT FKSeccion237009 FOREIGN KEY (UsuariosIdUsuario) REFERENCES Usuarios (IdUsuario);
ALTER TABLE Mensaje ADD CONSTRAINT FKMensaje869428 FOREIGN KEY (TemaIdTema) REFERENCES Tema (IdTema);
ALTER TABLE Ticket ADD CONSTRAINT FKTicket219138 FOREIGN KEY (UsuariosIdUsuario) REFERENCES Usuarios (IdUsuario);
