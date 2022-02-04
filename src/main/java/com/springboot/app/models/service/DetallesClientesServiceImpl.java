package com.springboot.app.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.springboot.app.models.dao.IClienteDao;
import com.springboot.app.models.entity.Cliente;

public class DetallesClientesServiceImpl implements UserDetailsService {

	@Autowired
    private IClienteDao clienteDao;
     
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Cliente cliente = clienteDao.findByEmail(username);
        if (cliente == null) {
            throw new UsernameNotFoundException("Cliente no encontrado");
        }
        return new DetallesClienteImpl(cliente);
    }
    
    

}
