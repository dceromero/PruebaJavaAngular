package com.pruebajava.backend.apirest.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebajava.backend.apirest.DAO.IRolesDAO;
import com.pruebajava.backend.apirest.Entity.Roles;

@Service
public class RolesServices implements IRolesServices {

	@Autowired
	private IRolesDAO roles;
	
	public List<Roles> findAll() {
		// TODO Auto-generated method stub
		List<Roles> resultRoles = (List<Roles>) roles.findAll();
		return resultRoles;
	}

}
