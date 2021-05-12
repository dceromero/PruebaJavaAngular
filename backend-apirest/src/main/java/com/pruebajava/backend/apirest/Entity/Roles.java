package com.pruebajava.backend.apirest.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class Roles implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long idRol;
	
	private String nameRol;
	
	
	public Long getIdRol() {
		return idRol;
	}
	public void setIdRol(Long idRol) {
		this.idRol = idRol;
	}
	public String getNameRol() {
		return nameRol;
	}
	public void setNameRol(String nameRol) {
		this.nameRol = nameRol;
	}
	
	
}
