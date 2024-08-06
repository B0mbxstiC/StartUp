package com.praxis.model.dto;

import java.sql.ResultSet;

public class Usuario {
	private Integer id;
	private String nombre;
	private String correo;
	private String nick;
	private String password;
	private String peso;
	
	
	public Usuario(Integer id, String nombre, String correo, String nick, String password, String peso) {
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
		this.nick = nick;
		this.password = password;
		this.peso = peso;
	}

	public Integer getId() {		
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getNick() {
		return nick;
	}


	public void setNick(String nick) {
		this.nick = nick;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPeso() {
		return peso;
	}


	public void setPeso(String peso) {
		this.peso = peso;
	}



	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", correo=" + correo + ", nick=" + nick + ", password="
				+ password + ", peso=" + peso + "]";
	}
	
	
	
	
}
