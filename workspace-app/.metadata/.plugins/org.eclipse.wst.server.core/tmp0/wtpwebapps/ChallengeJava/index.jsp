<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="service.*"%>
<%@ page import="model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link type="text/css" rel="stylesheet" href="css/homeCss.css">
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="http://code.jquery.com/jquery-1.8.3.js"></script>
<script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>

<title>Alumnos</title>
<script>
	$(document).ready(function() {
		$("#insertForm").show();
		$("#showRecord").show();
		$("#enrollForm").hide();
		$("#insertButton").click(function() {
			$("#insertForm").show();
			$("#showRecord").hide();
			$("#enrollForm").hide();
		});
		$("#showButton").click(function() {
			$("#insertForm").hide();
			$("#showRecord").show();
			$("#enrollForm").hide();
		});
		if('${button}' == "enrollButton"){
			$("#insertForm").hide();
			$("#showRecord").hide();
			$("#enrollForm").show();
		}
		
		function setSelectedIndex(s, v)
		{
			for ( var i = 0; i < s.options.length; i++ ) {
		        if ( s.options[i].text == v ) {
		            s.options[i].selected = true;
		            return;
		        }
		    }
		}

		var _tipoDoc = "<%=request.getAttribute("tipoDoc")%>";
		setSelectedIndex(document.getElementById("tipoDoc"), _tipoDoc);
	});
	
	$( function() {
	    $("#datepicker").datepicker({ dateFormat: 'dd/mm/yy' });
	});
	
	function isNumberKey(evt)
    {
       var charCode = (evt.which) ? evt.which : event.keyCode
       if (charCode > 31 && (charCode < 48 || charCode > 57))
          return false;

       return true;
    }
	
	function isLetterKey(evt)
    {
       var charCode = (evt.which) ? evt.which : event.keyCode
       if (!((charCode <= 90 && charCode >= 65) || (charCode == 32) || (charCode <= 122 && charCode >= 97)))
          return false;

       return true;
    }
	
	function isAlphaKey(evt)
    {
       var charCode = (evt.which) ? evt.which : event.keyCode
       if (!((charCode <= 90 && charCode >= 48) || (charCode == 32) || (charCode <= 122 && charCode >= 97)))
          return false;

       return true;
    }
	
	function validation() {
		var tipoDoc = document.forms["insertForm"]["tipoDoc"].value;
		if (tipoDoc == null || tipoDoc == "") {
			alert("El tipo de documento no puede estar vacio!");
		    return false;
		}
		var doc = document.forms["insertForm"]["documento"].value;
		if (doc == null || doc == "") {
			alert("El documento no puede estar vacio!");
		    return false;
		}
		var nom = document.forms["insertForm"]["nombre"].value;
		if (nom == null || nom == "") {
			alert("El nombre no puede estar vacio!");
		    return false;
		}
		var apellido = document.forms["insertForm"]["apellido"].value;
		if (apellido == null || apellido == "") {
			alert("El apellido no puede estar vacio!");
		    return false;
		}
		var legajo = document.forms["insertForm"]["legajo"].value;
		if (legajo == null || legajo == "") {
			alert("El legajo no puede estar vacio!");
		    return false;
		}
	}
	
	function validateMateria() {
		var materia = document.forms["enrollForm"]["materia"].value;
		if (materia == null || materia == "") {
			alert("La materia no puede estar vacia!");
		    return false;
		}
	}
</script>

</head>
<body>
	<h1>Facultad</h1>

	<input type="submit" value="Add Record" id="insertButton">
	<input type="submit" value="Show Record" id="showButton">

<form id="insertForm" name="insertForm" action="Main" method="post" class="insertForm" onsubmit="return validation()">
<pre>
<table>
<tr><td>Tipo de Documento: </td><td><select id="tipoDoc" name="tipoDoc">
	<option value="">--Seleccione--</option>
	<option value="DNI">DNI</option>
	<option value="LibretaCivica">Libreta Civica</option>
</select></td></tr>

<tr><td>N�mero de Documento: </td><td><input type="text" name="documento" onkeypress="return isNumberKey(event)" value="${alumno.persona.nroDoc}" ></td></tr>

<tr><td>Nombre: </td><td><input type="text" name="nombre" onkeypress="return isLetterKey(event)" value="${alumno.persona.nombre}"></td></tr>

<tr><td>Apellido: </td><td><input type="text" name="apellido" onkeypress="return isLetterKey(event)" value="${alumno.persona.apellido}"></td></tr>

<tr><td>Direcci�n: </td><td><input type="text" name="direccion" onkeypress="return isAlphaKey(event)" value="${alumno.persona.direccion}"></td></tr>

<tr><td>Fecha de Nacimiento: </td><td><input type="text" name = "fechaNacimiento" id = "datepicker" value="${fechaNacimiento}" /></td></tr>

<tr><td>Legajo: </td><td><input type="text" name="legajo" onkeypress="return isNumberKey(event)" value="${alumno.legajo}" ></td></tr>
</table>
<input type="submit" value="Update">&nbsp;&nbsp;<a href="index.jsp">Cancel</a>
<input type="text" name="form" value="formAlumno" hidden="true" >
<input type="text" name="identificador" value="${identificador}" hidden="true">
</pre>
</form>
	
<form id="enrollForm" action="Main" method="post" class="enrollForm" onsubmit="return validateMateria()">
<pre>
<table>
<tr><td>Tipo de Documento: </td><td><label>${alumno.persona.tipoDoc}</label></td></tr>

<tr><td>N�mero de Documento: </td><td><label>${alumno.persona.nroDoc}</label></td></tr>

<tr><td>Nombre: </td><td><label>${alumno.persona.nombre}</label></td></tr>

<tr><td>Apellido: </td><td><label>${alumno.persona.apellido}</label></td></tr>

<tr><td>Legajo: </td><td><label>${alumno.legajo}</label></td></tr>

<tr><td>Materias: </td><td><select name="materia">
	<option value="">--Seleccione--</option>
	<%
			DataBaseOperations dbo = new DataBaseOperations();
			ArrayList<Curso> cu = new ArrayList<Curso>();
			cu = dbo.cursoLista(1);

			for (Curso c : cu) {
	%><option value="<% out.print(c.getIdentificador()); %>"><% out.print(c.getNombre()); %></option>
	<% } %>
</select></td></tr>
</table>
<input type="submit" value="Enroll">&nbsp;&nbsp;<a href="index.jsp">Cancel</a>
<input type="text" name="form" value="formMateria" hidden="true" >
<input type="text" name="identificador" value="${identificador}" hidden="true" >
</pre>
</form>
<div id="showRecord" class="showForm">
	<table>
		<tr><td width="10%">Tipo Doc</td><td width="10%">Documento</td><td width="10%">Nombre</td><td width="10%">Apellido</td><td width="15%">Fecha Nacimiento</td><td width="15">Direcci�n</td><td width="10%">Legajo</td><td width="10%">Editar</td><td width="10%">Inscribir</td></tr>
		<%
			DataBaseOperations dao = new DataBaseOperations();
			ArrayList<Alumno> al = new ArrayList<Alumno>();
			al = dao.showData();

			for (int i = 0; i < al.size(); i++) {
		%>
		 <%java.text.DateFormat df = new java.text.SimpleDateFormat("dd/MM/yyyy"); %>
		<tr><td><% out.println(al.get(i).getPersona().getTipoDoc()); %></td>
			<td><% out.println(al.get(i).getPersona().getNroDoc()); %></td>
			<td><% out.println(al.get(i).getPersona().getNombre()); %></td>
			<td><% out.println(al.get(i).getPersona().getApellido()); %></td>
			<td><% out.println(df.format(al.get(i).getPersona().getFechaNacimiento())); %></td>
			<td><% out.println(al.get(i).getPersona().getDireccion()); %></td>
			<td><% out.println(al.get(i).getLegajo()); %></td>
			<td><a href="Main?action=edit&id=<% out.print(al.get(i).getIdentificador()); %>">Editar</a></td>
			<td><a href="Main?action=enroll&id=<% out.print(al.get(i).getIdentificador()); %>">Inscribirse</a></td>
		</tr>
		<%
			}
		%>
	</table>
</div>
</body>
</html>