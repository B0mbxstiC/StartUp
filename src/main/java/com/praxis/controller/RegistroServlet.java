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

import com.praxis.model.dao.DireccionDao;
import com.praxis.model.dao.UsuarioDao;
import com.praxis.model.dto.Direccion;
import com.praxis.model.dto.Rol;
import com.praxis.model.dto.Usuario;
import com.praxis.service.UsuarioServicio;

/**
 * Servlet implementation class Registro
 */
@WebServlet("/Registro")
public class RegistroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UsuarioServicio usuarioServicio = new UsuarioServicio();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroServlet() {
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
		String nombre = request.getParameter("txtNombre");
		String correo = request.getParameter("txtCorreo");
		String nick = request.getParameter("txtNick");
		String contrasenia = request.getParameter("txtContrasenia");
		String contraseniaDos = request.getParameter("txtContraseniaDos");
		String peso = request.getParameter("txtPeso");
		String direccion = request.getParameter("txtDireccion");
		String numeracion = request.getParameter("txtNumeracion");
		String numeroRol = request.getParameter("txtRol");
		UsuarioDao usuarioDao = new UsuarioDao();
		
		 if (contrasenia == null || contraseniaDos == null || !contrasenia.equals(contraseniaDos)) {
		        request.setAttribute("error", "Las contraseñas no coinciden");		        				request.getRequestDispatcher("index.jsp").forward(request, response);
		        return;
		    }				 
		Usuario usuarioNuevo = new Usuario(null, nombre, correo, nick, contrasenia, peso);
			//Se crea el nuevo usuario para agregarlo a la base de datos y obtener su ID Serial			
		usuarioDao.create(usuarioNuevo);
		//Adquirir la ID según base de datos (ID Serial)
		Usuario usuarioNuevoId = usuarioDao.findIdByCorreo(correo);			
		//Verificando si el usuarioNuevoId no es nulo y retornando el ID como entero
		Integer idUsuarioNuevo = (usuarioNuevoId != null) ? usuarioNuevoId.getId() : 0;					
		Direccion direccionNueva = new Direccion(null, nombre, numeracion, idUsuarioNuevo);
		Rol rolNuevo = new Rol(Integer.parseInt(numeroRol), idUsuarioNuevo);
		Usuario usuarioInsertado = usuarioServicio.registro(null, direccionNueva, rolNuevo);
		
		response.sendRedirect("index.jsp");
			
	}	

}
