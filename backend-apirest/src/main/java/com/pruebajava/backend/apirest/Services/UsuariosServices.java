package com.pruebajava.backend.apirest.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pruebajava.backend.apirest.DAO.IUsuariosDAO;
import com.pruebajava.backend.apirest.DAO.IV_UsuariosDAO;
import com.pruebajava.backend.apirest.Entity.Usuarios;
import com.pruebajava.backend.apirest.Entity.v_usuarios;

@Service
public class UsuariosServices implements IUsuariosServices {

	@Autowired
	private IUsuariosDAO userDao;
	
	@Autowired
	private IV_UsuariosDAO vuserDao;
	
	@Override
	public Usuarios findById(Long id) {		
		return userDao.findById(id).orElse(null);
	}

	@Override
	public Usuarios save(Usuarios usuario) {
		// TODO Auto-generated method stub
		return userDao.save(usuario);
	}

	@Override
	public void Delete(Long id) {
		// TODO Auto-generated method stub
		userDao.deleteById(id);
	}

	@Override
	public List<v_usuarios> findAll() {
		// TODO Auto-generated method stub
		return (List<v_usuarios>)vuserDao.findAll();
	}

	@Override
	public v_usuarios findByIdVUsuarios(Long id) {
		// TODO Auto-generated method stub
		return vuserDao.findById(id).orElse(null);
	}
	@Override
	@Transactional
	public List<v_usuarios> findByNameVUsuarios(String nombre) {
		// TODO Auto-generated method stub
		return vuserDao.buscarPorNombre(nombre);
	}
	
	
	
	


}
