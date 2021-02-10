INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('andres','$2a$10$igc42YO997mNMWh0gsRaAe3Ik8bnAMp5PjXFgqXq5Dp6IMMcRAqEG',true, 'Andres', 'Guzman','profesor@bolsadeideas.com');

INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('admin','$2a$10$VeRpmzagYN2fOpcHul9hROzl5vVgDnVwCeYDotoBFTIyzCXgBtZVi',true, 'John', 'Doe','jhon.doe@bolsadeideas.com');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1, 1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 2);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 1);
