package com.springboot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.springboot.app.auth.handler.LoginSuccessHandler;
//Valida a que vistas se tiene acceso como usuario no registrado y en caso de entrar a una vista no valida lo redirige al login
@EnableGlobalMethodSecurity(securedEnabled = true)
@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private LoginSuccessHandler successHandler;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/", "/index", "/css/**", "/images/**", "/formRegistro").permitAll()
		//.antMatchers("/formExamen/**").hasAnyRole("USER")
		.anyRequest().authenticated()
		.and()
		.formLogin()
		.successHandler(successHandler)
		.loginPage("/login")
		.permitAll()
		.and()
		.logout().permitAll();


	}

	@Autowired
	public void configurerGlobal(AuthenticationManagerBuilder builder) throws Exception {

		  PasswordEncoder encoder = this.passwordEncoder; UserBuilder users =
		  User.builder().passwordEncoder(encoder::encode);
		  
		  builder.inMemoryAuthentication()
		  .withUser(users.username("admin").password("123").roles("ADMIN", "USER"))
		  .withUser(users.username("andres").password("123").roles("USER"));
		 
	}

}
