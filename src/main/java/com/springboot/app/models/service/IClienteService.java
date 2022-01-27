package com.springboot.app.models.service;
//Clase contrato para las operaciones en la tabla clientes
import java.util.List;


import com.springboot.app.models.entity.Cliente;

public interface IClienteService {

	public List<Cliente> findAll();
	
	public void save(Cliente cliente);

	public Cliente findOne(Long id);

	public void delete(Long id);
	
}
