package com.praxis.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.praxis.model.dto.Direccion;
import com.praxis.model.dto.Usuario;
import com.praxis.utilidades.Conexion;

public class DireccionDao {
		
	//Crear direccion
	
	public Integer create(Direccion	direccion) {
		Integer resultado = 0;
		String query = "INSERT INTO direcciones (nombre, numeracion, usuario_id) VALUES (?, ?, ?)";
		
		try(Connection conexion = Conexion.getConexion();) {
			
			PreparedStatement statement = conexion.prepareStatement(query);
			statement.setString(1, direccion.getNombreCiudad());
			statement.setString(2, direccion.getNumeracion());
			statement.setInt(3, direccion.getUsuarioId());
			
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
	
	
	
	
	// Método para encontrar una dirección por su ID
	// public Direccion findById(Integer id) {
		
		// Inicializa un ResultSet para almacenar los resultados de la consulta
		// ResultSet resultado = null;
		
		// Consulta SQL para seleccionar la dirección por ID
		// String query = "SELECT * FROM direcciones WHERE id = " + id;
		
		// Inicializa las variables para la conexión, el objeto Direccion y el Statement
		// Connection conexion = null;
		// Direccion direccion = null;
		// Statement statement = null;
		
		// try {
			// Obtiene la conexión a la base de datos
			// conexion = Conexion.getConexion();
			
			// Verifica si la conexión es nula o está cerrada
			// if (conexion == null || conexion.isClosed()) {
				// System.out.println("Conexión no establecida o cerrada");
				// return null;
			// }
			
			// Crea un Statement para ejecutar la consulta
			// statement = conexion.createStatement();
			
			// Ejecuta la consulta y almacena el resultado en el ResultSet
			// resultado = statement.executeQuery(query);
			
			// Si hay un resultado, crea un nuevo objeto Direccion con los datos obtenidos
			// if (resultado.next()) {
				// direccion = new Direccion(
					// resultado.getInt(1),
					// resultado.getInt(4),
					// resultado.getString(2),
					// resultado.getString(3)
				// );
			// }
			
		// } catch (SQLException e) {
			// Maneja la excepción de SQL
			// System.out.println("Error al establecer conexión con la base de datos: " + e.getMessage());
		// } catch (Exception e) {
			// Maneja cualquier otra excepción
			// System.out.println("Error al obtener los datos del proveedor: " + e);
		// } finally {
			// Intenta cerrar el ResultSet, el Statement y la conexión
			// try {
				// if(resultado != null) resultado.close();
				// if (statement != null) statement.close();
				// if (conexion != null) conexion.close();
			// } catch(SQLException e) {
				// Maneja la excepción al cerrar los recursos
				// System.out.println("Error al cerrar la conexion con la base de datos: " + e.getMessage());
			// }
		// }
		
		// Imprime el objeto Direccion obtenido
		// System.out.println(direccion);
		
		// Retorna el objeto Direccion
		// return direccion;
		
	// }

	
	
}
