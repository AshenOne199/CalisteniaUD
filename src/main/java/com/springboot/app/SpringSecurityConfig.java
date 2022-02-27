package com.springboot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.springboot.app.auth.handler.LoginSuccessHandler;
import com.springboot.app.services.DetallesClientesServiceImpl;
//Valida a que vistas se tiene acceso como usuario no registrado y en caso de entrar a una vista no valida lo redirige al login
@EnableGlobalMethodSecurity(securedEnabled = true)
@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
     
	@Autowired
	private LoginSuccessHandler loginSuccessHandler;
	
    @Bean
    public UserDetailsService userDetailsService() {
        return new DetallesClientesServiceImpl();
    }
     
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
     
    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService());
        authProvider.setPasswordEncoder(passwordEncoder());
         
        return authProvider;
    }
 
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider());
        
        
    }
 
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	
    	String[] staticResources  =  {
                "/css/**",
                "/images/**",
                "/fonts/**",
                "/scripts/**",
            };
    	
        http.authorizeRequests()
        .antMatchers("/formExamen").authenticated()
        .antMatchers(staticResources).permitAll()
        .anyRequest().permitAll()
        .and()
        .formLogin()
	        .successHandler(loginSuccessHandler)
	    	.loginPage("/login")
            .usernameParameter("email")
            .permitAll()
        .and()
        .logout().logoutSuccessUrl("/").permitAll();
    }

}
