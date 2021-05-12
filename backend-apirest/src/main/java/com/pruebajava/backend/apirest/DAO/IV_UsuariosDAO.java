package com.pruebajava.backend.apirest.DAO;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.pruebajava.backend.apirest.Entity.v_usuarios;
public interface IV_UsuariosDAO extends CrudRepository<v_usuarios, Long> {

	@Query("select u from v_usuarios u where u.nombre like %:nombre% order by u.nombre")
	public List<v_usuarios> buscarPorNombre(@Param("nombre") String nombre);
	
}
