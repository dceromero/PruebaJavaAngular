package com.pruebajava.backend.apirest.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "v_usuarios")
public class v_usuarios implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long idUsuario;
	private String name_rol;	
	private String nombre;
	private char activo;
	

	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getName_rol() {
		return name_rol;
	}
	public void setName_rol(String name_rol) {
		this.name_rol = name_rol;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public char getActivo() {
		return activo;
	}
	public void setActivo(char activo) {
		this.activo = activo;
	}

	
}
