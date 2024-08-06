package com.praxis.controller;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.praxis.model.dao.UsuarioDao;
import com.praxis.model.dto.Usuario;
import com.praxis.service.UsuarioServicio;

/**
 * Servlet implementation class LogInServlet
 */
@WebServlet("/LogInServlet")
public class LogInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UsuarioServicio usuarioServicio = new UsuarioServicio();
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogInServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String correo = request.getParameter("txtCorreo"); 
		String contrasenia = request.getParameter("txtContrasenia");			
		Integer validacion = usuarioServicio.login(correo, contrasenia);
		System.out.println(validacion);
		
		if (validacion == 0) {
			//Mensaje de error porque no tiene acceso
			String mensaje = "El usuario o la contraseña no coinciden con nuestros registros";
			request.setAttribute("mensaje", mensaje);
			request.getRequestDispatcher("logIn.jsp").forward(request, response);
		} else if (validacion == 1) {
			Usuario usuario = usuarioServicio.buscarPorCorreo(correo);
			request.setAttribute("usuario", usuario);
			request.getRequestDispatcher("homeUser.jsp").forward(request, response);
		} else if (validacion == 2) {
			List<Usuario> usuarios = usuarioServicio.listarUsuarios();
			request.setAttribute("usuarios", usuarios);
			request.getRequestDispatcher("homeAdmin.jsp").forward(request, response);
		}
			
}
			
		
}
