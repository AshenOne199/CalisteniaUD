package com.springboot.app.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.springboot.app.models.entity.Cliente;
//Interfaz que hereda la clase para hacer consultas y paginacion a la base de datos de la entidad Cliente
public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long>{


}
