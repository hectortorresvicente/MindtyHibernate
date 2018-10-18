package com.mindty.controler;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.SerializationFeature;

import com.mindty.modelos.Curso;
import com.mindty.modelos.Modulo;
import com.mindty.modelos.Usuario;

@WebServlet("/profesor")

public class ProfesorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* Se inicia sesión */
		HttpSession session = request.getSession();
		/* Se obtiene el usuario de la sesión */
		String user = (String) request.getSession().getAttribute("usuario");
		
		/* Se obtiene la info del profesor con la función idUsuario */
		int nid = 0;// BBDD.getInstance().idUsuario(user);
		
		/* Se crea una lista de los cursos asignados al profesor con la función ConsultarCursos y se le añade al request como listaCursos*/
		List<Curso> listaCursos =null;// BBDD.getInstance().ConsultaCursos(nid);
		request.setAttribute("listaCursos", listaCursos);
		 /* REVISAR!!!!!!!!!!!!! */
		if (session.getAttribute("usuario") != null) {
			/* Si el usuario es profesor se le genera la vista descrita en profesor.jsp */
			Usuario elUser = null;// BBDD.getUsuarioByUsuario((String) session.getAttribute("usuario"));
			request.setAttribute("usuario", elUser);
			request.getRequestDispatcher("profesor.jsp").forward(request, response);
		} else {
			/* Si el usuario no existe se llama al servlet login */
			//response.sendRedirect("login");
			Usuario elUser = null;
			request.setAttribute("usuario", elUser);
			request.getRequestDispatcher("profesor.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// NO FUNCIONA función: Generar la lista de los cursos que tiene asignado el profesor
		/*List<Modulo> listaModulos = new ArrayList<>();
		if ((request.getParameter("code_modulo") != null) && (request.getParameter("nombre_modulo") != null)) {
			String strMaterias = "Arquitectura de las apps\n" + "Gestion de software\n" + "Fundamentos UX\n";
			Modulo nuevoModulo = new Modulo(request.getParameter("code_modulo"), request.getParameter("nombre_modulo"), strMaterias);
			listaModulos.add(nuevoModulo);
			String strCurso = BBDD.getInstance().IdCurso(request.getParameter("Cursos"));
			System.out.println(request.getParameter("code_modulo"));
			System.out.println(request.getParameter("nombre_modulo"));
			boolean nSalida = BBDD.getInstance().CrearModulo(strCurso, listaModulos);
		} else {
			System.out.println("No Entro");
		}
		System.out.println("Hola3"); */
		doGet(request, response);
	}
}
