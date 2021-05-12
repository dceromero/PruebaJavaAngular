package com.pruebajava.backend.apirest.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebajava.backend.apirest.Services.IUsuariosServices;
import com.pruebajava.backend.apirest.Entity.Usuarios;
import com.pruebajava.backend.apirest.Entity.v_usuarios;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/ApiUser")
public class UsuariosRestController {
	@Autowired
	private IUsuariosServices userServices;
	
	
	@GetMapping("/findall")
	public List<v_usuarios> findAll(){
		return userServices.findAll();
	}
	
	
	@GetMapping("/findById/{id}")
	public v_usuarios findById(@PathVariable Long id){
		return userServices.findByIdVUsuarios(id);
	}	
	

	@GetMapping("/findByName/{name}")
	public List<v_usuarios> findByName(@PathVariable String name){
		return userServices.findByNameVUsuarios(name);
	}	
	
	@GetMapping("/delete/{id}")
	public List<v_usuarios> delete(@PathVariable Long id){
		userServices.Delete(id);
		return userServices.findAll();
	}
	
	@PostMapping("save")
	public v_usuarios save(@RequestBody Usuarios user) {
		Usuarios userNew= userServices.save(user);
		return userServices.findByIdVUsuarios(userNew.getIdUsuario());
	}
	
	@PutMapping("/update/{id}")
	public v_usuarios update(@RequestBody Usuarios user, @PathVariable Long id) {
		Usuarios userModify = userServices.findById(id);
		userModify.setNombre(user.getNombre());
		userModify.setIdRol(user.getIdRol());
		userModify.setActivo(user.getActivo());
		userServices.save(userModify);
		return userServices.findByIdVUsuarios(id);
	}
	

}
