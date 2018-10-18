package com.mindty.controler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.mindty.modelos.Curso;
import com.mindty.modelos.Modulo;
import com.mindty.modelos.Usuario;

@WebServlet("/coordinador")
public class CoordinadorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* Se inicia sesión */
		request.getRequestDispatcher("coordinador.jsp").forward(request, response);
//		HttpSession session = request.getSession();
//		
//		/* Instanciamos la lista de profes */ 
//		List<Usuario> profes =null; //BBDD.getInstance().getProfes();
//		/* Se añade la lista de profes al request */
//		request.setAttribute("profes", profes);
//		 /* REVISAR!!!!!!!!!!!!! */
//		if (session.getAttribute("usuario") != null) {
//			/* Si el usuario es coordinar se le genera la vista descrita en coordinador.jsp */
//			Usuario elUser = null;// BBDD.getUsuarioByUsuario((String) session.getAttribute("usuario"));
//			request.setAttribute("usuario", elUser);
//			
//		} else {
//			/* Si el usuario no existe se llama al servlet login */
//			response.sendRedirect("login");
//		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* Se crea un nuevo curso según los datos que se recogen de los campos del formulario descrito en coorindador.jsp y se añade a la base de datos */
		Curso nuevoCurso = null;//new Curso(request.getParameter("codigoCurso"),request.getParameter("nombreCurso"),Integer.parseInt(request.getParameter("profes")),Integer.parseInt(request.getParameter("modulos")),Integer.parseInt(request.getParameter("horas")));
		//BBDD.getInstance().newCurso(nuevoCurso);
		/* Se regresa de nuevo a la página haciendo un nuevo doGet */
		doGet(request, response);
	}
}