package service;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Alumno;
import model.Persona;
import model.TipoDoc;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Main")
public class main extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public main() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward="";
        String action = request.getParameter("action");
        DataBaseOperations dao = new DataBaseOperations();
 
        if (action.equalsIgnoreCase("edit")){
            forward = "index.jsp";
            String id = request.getParameter("id");
            Alumno alumno = dao.editAlumno(id);
            Persona persona = alumno.getPersona();
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String fechaNac = formatter.format(persona.getFechaNacimiento());
            request.setAttribute("tipoDoc", persona.getTipoDoc());
            request.setAttribute("alumno", alumno);
            request.setAttribute("identificador", id);
            request.setAttribute("fechaNacimiento", fechaNac);
        }
        
        if (action.equalsIgnoreCase("enroll")){
            forward = "index.jsp";
            String id = request.getParameter("id");
            Alumno alumno = dao.editAlumno(id);
            request.setAttribute("alumno", alumno);
            request.setAttribute("identificador", id);
            request.setAttribute("button", "enrollButton");
        }
 
        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DataBaseOperations dao = new DataBaseOperations();
		PrintWriter out = response.getWriter();
		if(request.getParameter("form").contentEquals("formAlumno")) {
			if (request.getParameter("tipoDoc") == null || request.getParameter("tipoDoc").toString() == "") {
				out.println("El tipo de documento no puede estar vacio!");
				return;
			}
			if (request.getParameter("documento") == null || request.getParameter("documento").toString() == "") {
				out.println("El documento no puede estar vacio!");
				return;
			}
			if (request.getParameter("nombre") == null || request.getParameter("nombre") == "") {
				out.println("El nombre no puede estar vacio!");
				return;
			}
			if (request.getParameter("apellido") == null || request.getParameter("apellido") == "") {
				out.println("El apellido no puede estar vacio!");
				return;
			}
			if (request.getParameter("legajo") == null || request.getParameter("legajo") == "") {
				out.println("El legajo no puede estar vacio!");
				return;
			}
			
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			TipoDoc tipoDoc = TipoDoc.valueOf(request.getParameter("tipoDoc"));
			int doc = Integer.parseInt(request.getParameter("documento"));
			String nombre = request.getParameter("nombre");
			String apellido = request.getParameter("apellido");
			String direccion = request.getParameter("direccion");
			Date fechaNac = new Date();
			try {
				fechaNac = format.parse(request.getParameter("fechaNacimiento"));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			int legajo = Integer.parseInt(request.getParameter("legajo"));
			int id = 0; 
			if(request.getParameter("identificador") != "") {
				id = Integer.parseInt(request.getParameter("identificador"));
			}
			String s1 = dao.checkData(tipoDoc, doc, nombre, apellido, direccion, fechaNac, legajo, id);
			if(s1.equals("success")){
				out.println("Alumno dado de alta!");
				response.sendRedirect("index.jsp");
			}else{
				out.println(s1);
			}
		} else if(request.getParameter("form").contentEquals("formMateria")) {
			if (request.getParameter("materia") == null || request.getParameter("materia") == "") {
				out.println("La materia no puede estar vacia!");
			    return;
			}
			int idAlumno = Integer.parseInt(request.getParameter("identificador"));
			int idCurso = Integer.parseInt(request.getParameter("materia"));
			Date fechaInsc = new Date();
			String s1 = dao.insertCurso(idAlumno, idCurso, fechaInsc);
			if(s1.equals("success")){
				out.println("Se inscribio al alumno en el curso!");
				response.sendRedirect("index.jsp");
			}else{
				out.println(s1);
			}
		}
	}
}