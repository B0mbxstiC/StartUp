package com.praxis.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.praxis.model.dto.Usuario;
import com.praxis.utilidades.Conexion;

public class UsuarioDao {

	//CRUD	
	
	
	//Listar todos los usuarios
	public List<Usuario> findAll(){
		List<Usuario> usuarios = new ArrayList<Usuario>();
		ResultSet resultado = null;
		String query = "SELECT * FROM usuarios";
		
		try {
			Connection conexion = Conexion.getConexion();
			Statement statement = conexion.createStatement();
			resultado = statement.executeQuery(query);
			while (resultado.next()) {
				Usuario usuario = new Usuario(
						resultado.getInt(1),
						resultado.getString(2),
						resultado.getString(3),
						resultado.getString(5),
						resultado.getString(6),
						resultado.getString(7)
						);
				usuarios.add(usuario);
				System.out.println(usuario);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al obtener los datos de proveedores: " + e);
		}
		return usuarios;
	}

	
	
	//Buscar usuario por Correo 
	
	public Usuario findByCorreo(String correo) {
		ResultSet resultado = null;
		String query = "SELECT id, nombre, correo, nick, password, peso FROM usuarios WHERE correo = '" + correo + "'";
		Connection conexion = null;
		Usuario usuario = null;
		Statement statement = null;
		
		try {
			conexion = Conexion.getConexion();
			if (conexion == null || conexion.isClosed()) {
				System.out.println("Conexión no establecida o cerrada");
				return null;
			}
			
			statement = conexion.createStatement();
			resultado = statement.executeQuery(query);
			
			while(resultado.next()) {
				usuario = new Usuario(
						resultado.getInt(1),
						resultado.getString(2),
						resultado.getString(3),
						resultado.getString(4),
						resultado.getString(5),
						resultado.getString(6));
			}
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Error al establecer conexión con la base de datos: " + e.getMessage());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al obtener los datos del proveedor: " + e);
		} finally {
			try {
				if(resultado != null) resultado.close();
				if (statement != null) statement.close();
				if (conexion != null) conexion.close();
			} catch(SQLException e) {
				System.out.println("Error al cerrar la conexion con la base de datos: " + e.getMessage());
			}
		}
 		return usuario;		
	}
	
	//Find Id by correo
	
	public Usuario findIdByCorreo(String correo) {
		ResultSet resultado = null;
		String query = "SELECT id FROM usuarios WHERE correo = '" + correo + "'";
		Connection conexion = null;
		Usuario usuario = null;
		Statement statement = null;
		
		try {
			conexion = Conexion.getConexion();
			if (conexion == null || conexion.isClosed()) {
				System.out.println("Conexión no establecida o cerrada");
				return null;
			}
			
			statement = conexion.createStatement();
			resultado = statement.executeQuery(query);
			
			if (resultado.next()) {
				usuario = new Usuario(resultado.getInt(1),
						null,
						null,
						null,
						null,
						null);
			}			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Error al establecer conexión con la base de datos: " + e.getMessage());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al obtener los datos del proveedor: " + e);
		} finally {
			try {
				if(resultado != null) resultado.close();
				if (statement != null) statement.close();
				if (conexion != null) conexion.close();
			} catch(SQLException e) {
				System.out.println("Error al cerrar la conexion con la base de datos: " + e.getMessage());
			}
		}
 		return usuario;		
	}
	
	
	
	
	//Crear usuario
	
	public Integer create(Usuario usuario) {
		Integer resultado = 0;
		List<Usuario> usuarios = new ArrayList<Usuario>();
		String query = "INSERT INTO usuarios (nombre, password, correo, nick, peso) VALUES (?, ?, ?, ?, ?)";
		
		try(Connection conexion = Conexion.getConexion();) {
			
			PreparedStatement statement = conexion.prepareStatement(query);
			statement.setString(1, usuario.getNombre());
			statement.setString(2, usuario.getPassword());
			statement.setString(3, usuario.getCorreo());
			statement.setString(4, usuario.getNick());
			statement.setString(5, usuario.getPeso());
			
			resultado = statement.executeUpdate();		
			
			
			if (resultado == 1) {
				System.out.println("Inserción completa");				
			} else {
				System.out.println("Inserción fallida");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Problema al acceder a la información de la base de datos: " + e.getMessage());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error desconocido: " + e);
		}
		usuarios.add(usuario);
 		return resultado;
	}
	
	
}
