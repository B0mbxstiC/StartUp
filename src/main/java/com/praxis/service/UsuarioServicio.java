package com.praxis.service;

import java.util.List;

import com.praxis.model.dao.DireccionDao;
import com.praxis.model.dao.RolDao;
import com.praxis.model.dao.UsuarioDao;
import com.praxis.model.dto.Direccion;
import com.praxis.model.dto.Rol;
import com.praxis.model.dto.Usuario;

public class UsuarioServicio {

	UsuarioDao usuarioDao = new UsuarioDao();
	DireccionDao direccionDao = new DireccionDao();
	RolDao rolDao = new RolDao();
	
	public Integer login(String correo, String clave) {
		Usuario usuario = usuarioDao.findByCorreo(correo);
		if (usuario != null && usuario.getPassword().equals(clave)) {
			Rol rol = rolDao.findByIdUsuario(usuario.getId());
			if (rol.getIdRol() == 1) {
				return 1;
			} else {
				return 2;
			}
		} else {
			return 0;
		}
	}
	
	public Usuario registro(Usuario usuario, Direccion direccion, Rol rol) {
		Integer usuarioInsertado = usuarioDao.create(usuario);
		Integer direccionInsertada = direccionDao.create(direccion);
		Integer rolInsertado = rolDao.create(rol);
		String mensaje = String.format("%d %d %d", usuarioInsertado, direccionInsertada, rolInsertado);
		System.out.println(mensaje);		
		return usuario;
	}
	
	public List<Usuario> listarUsuarios(){
		return usuarioDao.findAll();
	}
	
	public Usuario buscarPorCorreo(String correo){
		return usuarioDao.findByCorreo(correo);
	}
	
	
}
