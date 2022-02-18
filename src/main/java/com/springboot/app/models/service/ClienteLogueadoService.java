package com.springboot.app.models.service;

import com.springboot.app.models.entity.Cliente;

public class ClienteLogueadoService {

	private Cliente cliente;
    private static ClienteLogueadoService servicio;    

    private ClienteLogueadoService() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public static ClienteLogueadoService getService() {
        if (servicio == null) {
            servicio = new ClienteLogueadoService();
        }
        return servicio;
    }
	
}
