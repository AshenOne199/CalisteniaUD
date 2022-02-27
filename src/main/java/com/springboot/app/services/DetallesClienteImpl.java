package com.springboot.app.services;
import java.util.Collection;
//Clase que implementa la interfaz IClienteService y sobreescribe los metodos para consultas en MYSQL

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import com.springboot.app.models.entity.Cliente;

public class DetallesClienteImpl implements UserDetails {

	private static final long serialVersionUID = 1L;
	
	private Cliente cliente;
	
	public DetallesClienteImpl(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public String getPassword() {
		return cliente.getPassword();
	}

	@Override
	public String getUsername() {
		return cliente.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	
}
