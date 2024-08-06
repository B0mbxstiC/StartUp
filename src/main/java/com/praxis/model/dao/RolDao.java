package com.praxis.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.praxis.model.dto.Direccion;
import com.praxis.model.dto.Rol;
import com.praxis.model.dto.Usuario;
import com.praxis.utilidades.Conexion;

public class RolDao {
	
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	
	//Crear nuevo rol; asociarlo con cuenta de usuario
	
		public Integer create(Rol rol) {
			
			Integer resultado = 0;
			String query = "INSERT INTO roles_usuario (id, id_usuario) VALUES (?, ?)";
			
			try(Connection conexion = Conexion.getConexion();) {
				
				PreparedStatement statement = conexion.prepareStatement(query);
				statement.setInt(1, rol.getIdRol());
				statement.setInt(2, rol.getIdUsuario());
				
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
	 		return resultado;
		}
	
	
	
	
		// Método para encontrar un rol por su ID
		 public Rol findByIdUsuario(Integer idUsuario) {		
			 ResultSet resultado = null;			
			 String query = "SELECT * FROM roles_usuario WHERE id_usuario = " + idUsuario; 			 
			 Connection conexion = null;
			 Rol rol = null;
			 Statement statement = null;
			
			 try {
				// Obtiene la conexión a la base de datos
				 conexion = Conexion.getConexion();
				
				// Verifica si la conexión es nula o está cerrada
				 if (conexion == null || conexion.isClosed()) {
					 System.out.println("Conexión no establecida o cerrada");
					 return null;
				 }				

				 statement = conexion.createStatement();				
				 resultado = statement.executeQuery(query);
				
				 if (resultado.next()) {
					 rol = new Rol(
						 resultado.getInt(1),
						 resultado.getInt(2));
				 }
				
			 } catch (SQLException e) {
				 System.out.println("Error al establecer conexión con la base de datos: " + e.getMessage());
			 } catch (Exception e) {
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
			 return rol;
		}
		
	
	
	
	
	
}
