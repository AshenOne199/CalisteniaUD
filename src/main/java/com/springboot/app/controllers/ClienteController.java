package com.springboot.app.controllers;

//Controlador que maneja el registro de un cliente
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springboot.app.models.entity.Cliente;
import com.springboot.app.repository.IClienteDao;
import com.springboot.app.services.IClienteService;

@Controller
@SessionAttributes("cliente")
public class ClienteController {

	@Autowired
	private IClienteDao clienteDao;
	
	@Autowired
	private IClienteService clienteService;

	// Mapeo vista principal: index
	@GetMapping({ "/", "", "/index" })
	public String index(Model model) {
		model.addAttribute("titulo", "Bienvendo a Calistenia UD");
		
		return "index";
	}

	// Ir a vista formRegistro y enviar los campos del cliente para registrarlo
	@GetMapping("/formRegistro")
	public String irRegistro(Model model) {
		Cliente cliente = new Cliente();
		model.addAttribute("cliente", cliente);
		model.addAttribute("titulo", "Formulario de registro");
		return "formRegistro";
	}

	// Recibir peticiones post de la vista formRegistro, validar y guardar en DB
	// respuestas.
	@PostMapping("/formRegistro")
	public String guardarRegsitro(@Valid Cliente cliente, BindingResult result, Model model, RedirectAttributes flash,
			SessionStatus status) {

		if (result.hasErrors()) {
			model.addAttribute("titulo", "Formulario de registro");
			return "formRegistro";
		}

		if (clienteDao.findByEmail(cliente.getEmail()) != null) {
			model.addAttribute("titulo", "Formulario de registro");
			model.addAttribute("error", "Este correo ya existe en la DB");
			return "formRegistro";
		}
		
		clienteService.codificar(cliente);
		clienteService.save(cliente);
		status.setComplete();
		
		flash.addFlashAttribute("success", "Cliente registrado con exito!");
		return "redirect:login";
	}
}
