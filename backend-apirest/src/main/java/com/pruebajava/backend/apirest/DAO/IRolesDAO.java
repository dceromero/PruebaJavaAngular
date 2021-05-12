package com.pruebajava.backend.apirest.DAO;


import org.springframework.data.repository.CrudRepository;
import com.pruebajava.backend.apirest.Entity.Roles;

public interface IRolesDAO extends CrudRepository<Roles,Long>{

}
