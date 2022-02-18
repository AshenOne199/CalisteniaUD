package com.springboot.app.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.models.dao.IClienteDao;
import com.springboot.app.models.entity.Cliente;

@Service
public class LogueoClienteService {

	private ClienteLogueadoService clienteLogueadoService;
	
	@Autowired
	IClienteDao clienteDao;
	
	public boolean loguearCliente(Cliente cliente) {
		clienteLogueadoService = ClienteLogueadoService.getService();		
		Cliente cliente2 = clienteDao.findByEmail(cliente.getEmail());
		clienteLogueadoService.setCliente(cliente);		
		if (cliente2 == null || cliente.getPassword() != cliente2.getPassword()) {
			return false;
		}
		return true;
	}
	
	
	
	
}
