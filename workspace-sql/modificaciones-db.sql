--- MODIFICACIONES A LA BASE DE DATOS PARA EL MODELO SIMPLIFICADO DE "Alumno inscriptos en varios cursos de una carrera" ----

DROP SEQUENCE profesor_id_seq cascade;
drop table curso_anterior;
drop table profesor_curso;
drop table profesor;

-- Crear tabla de profesores con datos.

create sequence profesor_id_seq;

CREATE TABLE profesor
(
    identificador integer NOT NULL DEFAULT nextval('profesor_id_seq'::regclass),
    idpersona integer NOT NULL,
    legajo integer NOT NULL,
    CONSTRAINT profesor_pkey PRIMARY KEY (identificador),
    CONSTRAINT profesor_idpersona_key UNIQUE (idpersona),
    CONSTRAINT profesor_idpersona_fkey FOREIGN KEY (idpersona)
        REFERENCES persona (identificador) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

INSERT INTO persona (tipodoc, documento, nombre, apellido, fechanac) VALUES ('DNI', 26080745, 'Diego', 'Bottallo', '1976-06-28');
INSERT INTO persona (tipodoc, documento, nombre, apellido, fechanac) VALUES ('DNI', 24772690, 'Pablo', 'Ramis', '1974-08-27');
INSERT INTO persona (tipodoc, documento, nombre, apellido, fechanac) VALUES ('DNI', 23967445, 'Guido', 'Macchi', '1973-04-10');

insert into profesor (idpersona, legajo) values (7, 11111);
insert into profesor (idpersona, legajo) values (8, 22222);
insert into profesor (idpersona, legajo) values (9, 33333);

-- Crear tabla que relacione profesores con cursos

CREATE TABLE profesor_curso
(
    idprofesor integer NOT NULL,
    idcurso integer NOT NULL,
    fechaalta date NOT NULL,
    CONSTRAINT inscripciones_curso_idprofesor_fkey FOREIGN KEY (idprofesor)
        REFERENCES profesor (identificador) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT inscripciones_curso_idcurso_fkey FOREIGN KEY (idcurso)
        REFERENCES curso (identificador) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

insert into profesor_curso values (1, 1, CURRENT_DATE);
insert into profesor_curso values (1, 2, CURRENT_DATE);
insert into profesor_curso values (2, 3, CURRENT_DATE);
insert into profesor_curso values (2, 4, CURRENT_DATE);
insert into profesor_curso values (3, 5, CURRENT_DATE);
insert into profesor_curso values (3, 6, CURRENT_DATE);

-- Crea tabla para cursos anteriores

CREATE TABLE curso_anterior
(
    idalumno integer NOT NULL,
    idcurso integer NOT NULL,
	nota FLOAT,
	estadocurso character varying(20) COLLATE pg_catalog."default",
    fechafinalizacion date NOT NULL,
    CONSTRAINT curso_anterior_idalumno_fkey FOREIGN KEY (idalumno)
        REFERENCES alumno (identificador) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT curso_anterior_idcurso_fkey FOREIGN KEY (idcurso)
        REFERENCES curso (identificador) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

INSERT INTO curso_anterior VALUES
(1,4,8,'Terminado','2006-01-01');
INSERT INTO curso_anterior VALUES
(2,2,7,'Terminado','2004-01-01');
INSERT INTO curso_anterior VALUES
(3,2,6,'Terminado','2010-01-01');
INSERT INTO curso_anterior VALUES
(3,4,10,'Terminado','2010-01-01');
INSERT INTO curso_anterior VALUES
(4,2,9,'Terminado','2010-01-01');
INSERT INTO curso_anterior VALUES
(5,1,9,'Terminado','2010-01-01');
INSERT INTO curso_anterior VALUES
(5,2,6,'Terminado','2011-01-01');