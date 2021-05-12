package com.pruebajava.backend.apirest.DAO;

import org.springframework.data.repository.CrudRepository;
import com.pruebajava.backend.apirest.Entity.Usuarios;


public interface IUsuariosDAO extends CrudRepository<Usuarios,Long> {
}
