package com.pruebajava.backend.apirest.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebajava.backend.apirest.Services.IRolesServices;
import com.pruebajava.backend.apirest.Entity.Roles;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/ApiRol")
public class RolesRestController {

	@Autowired
	private IRolesServices rolServices; 
	
	@GetMapping("/findall")
	public List<Roles> findAll(){
		return rolServices.findAll();
	}
}
