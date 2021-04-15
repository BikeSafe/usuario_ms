INSERT INTO usuarios (enabled, username, password) VALUES (1,'admin','$2a$10$mRkuzH4VNg23vuYO3E.1juNrsRs7gAR0ayObnkJFxgSUsczYYymYq');
INSERT INTO usuarios (enabled, username, password) VALUES (1,'admin2','$2a$10$EgLHOK2maXzr7RupiJe52ucWV0D5bHj.p.sIp0N5VPCORsvS2BeCm');
INSERT INTO datos (nombre_dato, apellido_dato, cedula_dato, email_dato, telefono_dato, usuario_id) VALUES ('Camilo','Perez',1018483570,'daniel@gmail.com',3194438083,1);
INSERT INTO datos (nombre_dato, apellido_dato, cedula_dato, email_dato, telefono_dato, usuario_id) VALUES ('Sara','Aponte',101848849,'sofia@gmail.com',3194438483,2);
INSERT INTO seguidores (seguidor, seguido) VALUES (1,2);
INSERT INTO seguidores (seguidor, seguido) VALUES (2,1);
