/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.38
 * Generated at: 2019-02-28 23:08:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import service.*;
import model.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("service");
    _jspx_imports_packages.add("model");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/homeCss.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-1.8.3.js\"></script>\r\n");
      out.write("<script src=\"http://code.jquery.com/ui/1.9.2/jquery-ui.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<title>Alumnos</title>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$(\"#insertForm\").show();\r\n");
      out.write("\t\t$(\"#showRecord\").show();\r\n");
      out.write("\t\t$(\"#enrollForm\").hide();\r\n");
      out.write("\t\t$(\"#insertButton\").click(function() {\r\n");
      out.write("\t\t\t$(\"#insertForm\").show();\r\n");
      out.write("\t\t\t$(\"#showRecord\").hide();\r\n");
      out.write("\t\t\t$(\"#enrollForm\").hide();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$(\"#showButton\").click(function() {\r\n");
      out.write("\t\t\t$(\"#insertForm\").hide();\r\n");
      out.write("\t\t\t$(\"#showRecord\").show();\r\n");
      out.write("\t\t\t$(\"#enrollForm\").hide();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tif('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${button}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("' == \"enrollButton\"){\r\n");
      out.write("\t\t\t$(\"#insertForm\").hide();\r\n");
      out.write("\t\t\t$(\"#showRecord\").hide();\r\n");
      out.write("\t\t\t$(\"#enrollForm\").show();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction setSelectedIndex(s, v)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tfor ( var i = 0; i < s.options.length; i++ ) {\r\n");
      out.write("\t\t        if ( s.options[i].text == v ) {\r\n");
      out.write("\t\t            s.options[i].selected = true;\r\n");
      out.write("\t\t            return;\r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tvar _tipoDoc = \"");
      out.print(request.getAttribute("tipoDoc"));
      out.write("\";\r\n");
      out.write("\t\tsetSelectedIndex(document.getElementById(\"tipoDoc\"), _tipoDoc);\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$( function() {\r\n");
      out.write("\t    $(\"#datepicker\").datepicker({ dateFormat: 'dd/mm/yy' });\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tfunction isNumberKey(evt)\r\n");
      out.write("    {\r\n");
      out.write("       var charCode = (evt.which) ? evt.which : event.keyCode\r\n");
      out.write("       if (charCode > 31 && (charCode < 48 || charCode > 57))\r\n");
      out.write("          return false;\r\n");
      out.write("\r\n");
      out.write("       return true;\r\n");
      out.write("    }\r\n");
      out.write("\t\r\n");
      out.write("\tfunction isLetterKey(evt)\r\n");
      out.write("    {\r\n");
      out.write("       var charCode = (evt.which) ? evt.which : event.keyCode\r\n");
      out.write("       if (!((charCode <= 90 && charCode >= 65) || (charCode == 32) || (charCode <= 122 && charCode >= 97)))\r\n");
      out.write("          return false;\r\n");
      out.write("\r\n");
      out.write("       return true;\r\n");
      out.write("    }\r\n");
      out.write("\t\r\n");
      out.write("\tfunction isAlphaKey(evt)\r\n");
      out.write("    {\r\n");
      out.write("       var charCode = (evt.which) ? evt.which : event.keyCode\r\n");
      out.write("       if (!((charCode <= 90 && charCode >= 48) || (charCode == 32) || (charCode <= 122 && charCode >= 97)))\r\n");
      out.write("          return false;\r\n");
      out.write("\r\n");
      out.write("       return true;\r\n");
      out.write("    }\r\n");
      out.write("\t\r\n");
      out.write("\tfunction validation() {\r\n");
      out.write("\t\tvar tipoDoc = document.forms[\"insertForm\"][\"tipoDoc\"].value;\r\n");
      out.write("\t\tif (tipoDoc == null || tipoDoc == \"\") {\r\n");
      out.write("\t\t\talert(\"El tipo de documento no puede estar vacio!\");\r\n");
      out.write("\t\t    return false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar doc = document.forms[\"insertForm\"][\"documento\"].value;\r\n");
      out.write("\t\tif (doc == null || doc == \"\") {\r\n");
      out.write("\t\t\talert(\"El documento no puede estar vacio!\");\r\n");
      out.write("\t\t    return false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar nom = document.forms[\"insertForm\"][\"nombre\"].value;\r\n");
      out.write("\t\tif (nom == null || nom == \"\") {\r\n");
      out.write("\t\t\talert(\"El nombre no puede estar vacio!\");\r\n");
      out.write("\t\t    return false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar apellido = document.forms[\"insertForm\"][\"apellido\"].value;\r\n");
      out.write("\t\tif (apellido == null || apellido == \"\") {\r\n");
      out.write("\t\t\talert(\"El apellido no puede estar vacio!\");\r\n");
      out.write("\t\t    return false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar legajo = document.forms[\"insertForm\"][\"legajo\"].value;\r\n");
      out.write("\t\tif (legajo == null || legajo == \"\") {\r\n");
      out.write("\t\t\talert(\"El legajo no puede estar vacio!\");\r\n");
      out.write("\t\t    return false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction validateMateria() {\r\n");
      out.write("\t\tvar materia = document.forms[\"enrollForm\"][\"materia\"].value;\r\n");
      out.write("\t\tif (materia == null || materia == \"\") {\r\n");
      out.write("\t\t\talert(\"La materia no puede estar vacia!\");\r\n");
      out.write("\t\t    return false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h1>Facultad</h1>\r\n");
      out.write("\r\n");
      out.write("\t<input type=\"submit\" value=\"Add Record\" id=\"insertButton\">\r\n");
      out.write("\t<input type=\"submit\" value=\"Show Record\" id=\"showButton\">\r\n");
      out.write("\r\n");
      out.write("<form id=\"insertForm\" name=\"insertForm\" action=\"Main\" method=\"post\" class=\"insertForm\" onsubmit=\"return validation()\">\r\n");
      out.write("<pre>\r\n");
      out.write("<table>\r\n");
      out.write("<tr><td>Tipo de Documento: </td><td><select id=\"tipoDoc\" name=\"tipoDoc\">\r\n");
      out.write("\t<option value=\"\">--Seleccione--</option>\r\n");
      out.write("\t<option value=\"DNI\">DNI</option>\r\n");
      out.write("\t<option value=\"LibretaCivica\">Libreta Civica</option>\r\n");
      out.write("</select></td></tr>\r\n");
      out.write("\r\n");
      out.write("<tr><td>Número de Documento: </td><td><input type=\"text\" name=\"documento\" onkeypress=\"return isNumberKey(event)\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${alumno.persona.nroDoc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" ></td></tr>\r\n");
      out.write("\r\n");
      out.write("<tr><td>Nombre: </td><td><input type=\"text\" name=\"nombre\" onkeypress=\"return isLetterKey(event)\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${alumno.persona.nombre}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></td></tr>\r\n");
      out.write("\r\n");
      out.write("<tr><td>Apellido: </td><td><input type=\"text\" name=\"apellido\" onkeypress=\"return isLetterKey(event)\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${alumno.persona.apellido}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></td></tr>\r\n");
      out.write("\r\n");
      out.write("<tr><td>Dirección: </td><td><input type=\"text\" name=\"direccion\" onkeypress=\"return isAlphaKey(event)\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${alumno.persona.direccion}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></td></tr>\r\n");
      out.write("\r\n");
      out.write("<tr><td>Fecha de Nacimiento: </td><td><input type=\"text\" name = \"fechaNacimiento\" id = \"datepicker\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fechaNacimiento}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" /></td></tr>\r\n");
      out.write("\r\n");
      out.write("<tr><td>Legajo: </td><td><input type=\"text\" name=\"legajo\" onkeypress=\"return isNumberKey(event)\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${alumno.legajo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" ></td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("<input type=\"submit\" value=\"Update\">&nbsp;&nbsp;<a href=\"index.jsp\">Cancel</a>\r\n");
      out.write("<input type=\"text\" name=\"form\" value=\"formAlumno\" hidden=\"true\" >\r\n");
      out.write("<input type=\"text\" name=\"identificador\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${identificador}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" hidden=\"true\">\r\n");
      out.write("</pre>\r\n");
      out.write("</form>\r\n");
      out.write("\t\r\n");
      out.write("<form id=\"enrollForm\" action=\"Main\" method=\"post\" class=\"enrollForm\" onsubmit=\"return validateMateria()\">\r\n");
      out.write("<pre>\r\n");
      out.write("<table>\r\n");
      out.write("<tr><td>Tipo de Documento: </td><td><label>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${alumno.persona.tipoDoc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</label></td></tr>\r\n");
      out.write("\r\n");
      out.write("<tr><td>Número de Documento: </td><td><label>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${alumno.persona.nroDoc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</label></td></tr>\r\n");
      out.write("\r\n");
      out.write("<tr><td>Nombre: </td><td><label>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${alumno.persona.nombre}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</label></td></tr>\r\n");
      out.write("\r\n");
      out.write("<tr><td>Apellido: </td><td><label>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${alumno.persona.apellido}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</label></td></tr>\r\n");
      out.write("\r\n");
      out.write("<tr><td>Legajo: </td><td><label>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${alumno.legajo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</label></td></tr>\r\n");
      out.write("\r\n");
      out.write("<tr><td>Materias: </td><td><select name=\"materia\">\r\n");
      out.write("\t<option value=\"\">--Seleccione--</option>\r\n");
      out.write("\t");

			DataBaseOperations dbo = new DataBaseOperations();
			ArrayList<Curso> cu = new ArrayList<Curso>();
			cu = dbo.cursoLista(1);

			for (Curso c : cu) {
	
      out.write("<option value=\"");
 out.print(c.getIdentificador()); 
      out.write('"');
      out.write('>');
 out.print(c.getNombre()); 
      out.write("</option>\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("</select></td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("<input type=\"submit\" value=\"Enroll\">&nbsp;&nbsp;<a href=\"index.jsp\">Cancel</a>\r\n");
      out.write("<input type=\"text\" name=\"form\" value=\"formMateria\" hidden=\"true\" >\r\n");
      out.write("<input type=\"text\" name=\"identificador\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${identificador}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" hidden=\"true\" >\r\n");
      out.write("</pre>\r\n");
      out.write("</form>\r\n");
      out.write("<div id=\"showRecord\" class=\"showForm\">\r\n");
      out.write("\t<table>\r\n");
      out.write("\t\t<tr><td width=\"10%\">Tipo Doc</td><td width=\"10%\">Documento</td><td width=\"10%\">Nombre</td><td width=\"10%\">Apellido</td><td width=\"15%\">Fecha Nacimiento</td><td width=\"15\">Dirección</td><td width=\"10%\">Legajo</td><td width=\"10%\">Editar</td><td width=\"10%\">Inscribir</td></tr>\r\n");
      out.write("\t\t");

			DataBaseOperations dao = new DataBaseOperations();
			ArrayList<Alumno> al = new ArrayList<Alumno>();
			al = dao.showData();

			for (int i = 0; i < al.size(); i++) {
		
      out.write("\r\n");
      out.write("\t\t ");
java.text.DateFormat df = new java.text.SimpleDateFormat("dd/MM/yyyy"); 
      out.write("\r\n");
      out.write("\t\t<tr><td>");
 out.println(al.get(i).getPersona().getTipoDoc()); 
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
 out.println(al.get(i).getPersona().getNroDoc()); 
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
 out.println(al.get(i).getPersona().getNombre()); 
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
 out.println(al.get(i).getPersona().getApellido()); 
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
 out.println(df.format(al.get(i).getPersona().getFechaNacimiento())); 
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
 out.println(al.get(i).getPersona().getDireccion()); 
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
 out.println(al.get(i).getLegajo()); 
      out.write("</td>\r\n");
      out.write("\t\t\t<td><a href=\"Main?action=edit&id=");
 out.print(al.get(i).getIdentificador()); 
      out.write("\">Editar</a></td>\r\n");
      out.write("\t\t\t<td><a href=\"Main?action=enroll&id=");
 out.print(al.get(i).getIdentificador()); 
      out.write("\">Inscribirse</a></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");

			}
		
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
