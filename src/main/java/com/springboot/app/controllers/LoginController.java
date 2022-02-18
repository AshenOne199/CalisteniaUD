package com.springboot.app.controllers;
//Controlador del login, valida errores en la vista y el estado de la sesion
import java.security.Principal;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springboot.app.models.entity.Cliente;
import com.springboot.app.models.service.LogueoClienteService;

@Controller
public class LoginController {

	@Autowired
	LogueoClienteService logueoClienteService;
	
	@GetMapping("/login")
	public String login(@RequestParam(value = "error", required = false)String error, 
			@RequestParam(value = "logout", required = false)String logout, Model model, Principal principal, RedirectAttributes flash) {
		
		model.addAttribute("titulo", "Inicio de Sesión");
		
		if(principal != null) {
			flash.addFlashAttribute("info", "Ya ha iniciado sesión");
			
			return "redirect:/";
		}
		
		if(error != null) {
			model.addAttribute("error", "Error en el login: Nombre de usuario o contraseña incorrecta, por favor vuelva a intentarlo");
		}
		
		if(logout != null) {
			model.addAttribute("success", "Se ha cerrado sesión con exito");
		}
		
		return "login";
	}
	
	@PostMapping("/loguear")
	public String loguear(@Valid Cliente cliente, Model model) {
		if (logueoClienteService.loguearCliente(cliente)) {
			//Habilitar botones de rutina y examen
			return "index";
		} else {
			return "login";
		}
		
	}
	
}
