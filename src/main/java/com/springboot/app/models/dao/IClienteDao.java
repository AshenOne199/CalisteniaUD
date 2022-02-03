package com.springboot.app.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.app.models.entity.Cliente;
//Interfaz que hereda la clase para hacer consultas y paginacion a la base de datos de la entidad Cliente
@Repository
public interface IClienteDao extends JpaRepository<Cliente, Long>{
	@Query("SELECT c FROM Cliente c WHERE c.email = ?1")
	Cliente findByEmail(String email);
}
