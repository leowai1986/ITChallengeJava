--Respuestas

--- EJERCICIO 1:
select p.tipodoc, p.documento, p.nombre, p.apellido, a.legajo 
from persona as p
left join alumno as a on a.idpersona = p.identificador;

--- EJERCICIO 2:
SELECT a.legajo, p.nombre, p.apellido, c.nombre, ic.fechainscripcion
FROM alumno as a
left join persona as p on p.identificador = a.idpersona
left join inscripciones_carrera as ic on ic.idalumno = a.identificador
inner join carrera as c on c.identificador = ic.idcarrera
order by a.legajo desc;

--- EJERCICIO 3:
SELECT ca.nombre as "Nombre Carrera", c.nombre as "Nombre Curso", count(c) as "Cantidad Inscriptos", c.cupomaximo
FROM curso as c
left join inscripciones_curso as ic on c.identificador = ic.idcurso
left join carrera as ca on ca.identificador = c.idcarrera
group by ca.nombre, c.nombre, c.cupomaximo;
		
--- EJERCICIO 4:
SELECT ca.nombre as "Nombre Carrera", c.nombre as "Nombre Curso", count(c) as "Cantidad Inscriptos", c.cupomaximo
FROM curso as c
left join inscripciones_curso as ic on c.identificador = ic.idcurso
left join carrera as ca on ca.identificador = c.idcarrera
group by ca.nombre, c.nombre, c.cupomaximo
having count(c) > c.cupomaximo;

--- EJERCICIO 5:
update curso as c
set cupomaximo = 10
where c.anio = 2018 and c.cupomaximo < 5;

--- EJERCICIO 6:
select * from inscripciones_curso ic
inner join inscripciones_carrera ia on ia.idalumno = ic.idalumno
where ic.fechainscripcion < ia.fechainscripcion;

update inscripciones_curso
set fechainscripcion = CURRENT_DATE
where idalumno = 2 and idcurso = 3;

--- EJERCICIO 7:
DROP SEQUENCE alumno_id_seq cascade;
DROP SEQUENCE persona_id_seq cascade;
CREATE SEQUENCE alumno_id_seq START 6;
CREATE SEQUENCE persona_id_seq START 6;

alter table alumno
alter column identificador set default nextval('alumno_id_seq');

alter table persona
alter column identificador set default nextval('persona_id_seq');

insert into persona (tipodoc, documento, nombre, apellido, fechanac) values('DNI', 32289808, 'Leandro', 'Wainer', '1986-08-26');
insert into alumno (idpersona, legajo) values(currval('persona_id_seq'), 1813);

--- EJERCICIO 8:
alter table persona add direccion varchar(200);