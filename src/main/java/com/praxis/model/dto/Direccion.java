package com.praxis.model.dto;

import java.util.Date;

public class Direccion{
	
	private Integer idDireccion;
	private String nombreCiudad;
	private String numeracion;
	private Integer usuarioId;	
	
	
	public Direccion(Integer idDireccion, String nombreCiudad, String numeracion, Integer usuarioId) {
		this.idDireccion = idDireccion;
		this.nombreCiudad = nombreCiudad;
		this.numeracion = numeracion;
		this.usuarioId = usuarioId;
	}
	
	public Integer getIdDireccion() {
		return idDireccion;
	}
	public void setIdDireccion(Integer idDireccion) {
		this.idDireccion = idDireccion;
	}
	public String getNombreCiudad() {
		return nombreCiudad;
	}
	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}
	public String getNumeracion() {
		return numeracion;
	}
	public void setNumeracion(String numeracion) {
		this.numeracion = numeracion;
	}
	public Integer getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}

	@Override
	public String toString() {
		return "Direccion [idDireccion=" + idDireccion + ", nombreCiudad=" + nombreCiudad + ", numeracion=" + numeracion
				+ ", usuarioId=" + usuarioId + "]";
	}
	
	
	
	
	
}
