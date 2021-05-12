package com.pruebajava.backend.apirest.Services;

import java.util.List;

import com.pruebajava.backend.apirest.Entity.Usuarios;

import com.pruebajava.backend.apirest.Entity.v_usuarios;

public interface IUsuariosServices {

	public Usuarios findById(Long id);
	
	public Usuarios save(Usuarios usuario);
	
	public void Delete(Long id);
	
	public List<v_usuarios> findAll();

	public v_usuarios findByIdVUsuarios(Long id);
	
	public List<v_usuarios> findByNameVUsuarios(String nombre);
}
