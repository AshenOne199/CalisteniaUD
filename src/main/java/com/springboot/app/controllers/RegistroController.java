package com.springboot.app.controllers;
//Controlador que maneja el registro de un cliente
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springboot.app.models.dao.IClienteDao;
import com.springboot.app.models.entity.Cliente;

@Controller
@SessionAttributes("cliente")
public class RegistroController {

	@Autowired
	private IClienteDao clienteDao;
	
	//Ir a vista formRegistro y enviar los campos del cliente para registrarlo
	@GetMapping("/formRegistro")
	public String irRegistro(Model model){
		Cliente cliente = new Cliente();
		model.addAttribute("cliente", cliente);
		model.addAttribute("titulo", "Formulario de registro");
		return "formRegistro";
	}
	
	//Recibir peticiones post de la vista formRegistro, validar y guardar en DB respuestas.
		@PostMapping("/formRegistro")
		public String guardarRegsitro(@Valid Cliente cliente, BindingResult result, Model model, RedirectAttributes flash, SessionStatus status) {
			
			if (result.hasErrors()) {
				model.addAttribute("titulo", "Formulario de registro");
				return "formRegistro";
			}
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		    String encodedPassword = passwordEncoder.encode(cliente.getPassword());
		    cliente.setPassword(encodedPassword);
			
			clienteDao.save(cliente);
			status.setComplete();
			flash.addFlashAttribute("success", "Cliente registrado con exito!");
			return "redirect:login";
		}
}
