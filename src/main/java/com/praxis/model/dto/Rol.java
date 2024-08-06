package com.praxis.model.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Rol {
	
	private Integer idRol;
	private Integer idUsuario;
	
	public Rol(Integer idRol, Integer idUsuario) {
		this.idRol = idRol;
		this.idUsuario = idUsuario;
	}

	public Integer getIdRol() {
		return idRol;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	@Override
	public String toString() {
		return "Rol [idRol=" + idRol + ", idUsuario=" + idUsuario + "]";
	}

	
	
}
