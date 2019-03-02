# ITChallengeJava
Alumno inscriptos en varios cursos de una carrera

El aplicativo fue creado con la versión de Eclipse IDE for Java and Report Developers (eclipse-reporting-2018-12-R-win32-x86_64): 
https://www.eclipse.org/downloads/packages/release/2018-12/r/eclipse-ide-java-and-report-developers

Al ser un aplicativo web utilice el apache-tomcat-8.5.38: https://tomcat.apache.org/download-80.cgi

Para crear los reportes y poder correrlos como Java Application me baje el birt-runtime-4.8.0-20180626:
https://www.eclipse.org/downloads/download.php?file=/birt/downloads/drops/R-R1-4.8.0-201806261756/birt-runtime-4.8.0-20180626.zip
Por favor descomprimir los archivos del zip en "C:\birt" sino el executeReport.java dara error.

Para poder tener la base de datos en orden para usar tanto el aplicativo web como los reportes favor de correr los sql en el siguiente orden:
inicializacion-db.sql
respuestas-db.sql (Sólo se necesitan los scripts del ejercicio 7 y 8)
modificaciones-db.sql
Dará error con los drops, por eso borrar antes de correrlos.

Si sale todo como se espera el aplicativo web se puede correr dandole click derecho a index.jsp -> Run As -> Run On Server.
Recordar que hay que tener instalado el TomCat 8.5.38 y verificar que la configuración este correcta en el Eclipse.

Para correr los reportes como mencione antes está el executeReport.java en /src/reporte/executeReport.java. 
Con un click derecho en el archivo -> Run As -> Java Application debería funcionar correctamente. 
Los reportes se guardan en C:\Temp (En el caso de no tener la carpeta, favor de crearla). Se guardan en formato HTML.
En el caso de querer ver el estado de un alumno diferente puede modificar el parámetro en la línea 41 del código.
En el caso de querer ver como está conformado un curso diferente puede modificar el parámetro en la línea 85 del código.

Si es necesaría mi asistencia para lograr correr el aplicativo web o los reportes me pueden contactar vía mail o por celular.
