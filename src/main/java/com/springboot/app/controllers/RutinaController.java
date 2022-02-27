package com.springboot.app.controllers;

import java.security.Principal;
import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springboot.app.logic.rutinaFactory.RutinaEspecifica;
import com.springboot.app.logic.rutinaFactory.RutinaFactory;
import com.springboot.app.logic.rutinaFactory.examen.RutinaExamen;
import com.springboot.app.logic.rutinaFactory.rutina.RutinaDiaria;
import com.springboot.app.models.entity.Cliente;
import com.springboot.app.models.entity.Ejercicio;
import com.springboot.app.repository.IClienteDao;

@Controller
@SessionAttributes("cliente")
public class RutinaController {
	
	@Autowired
	private IClienteDao clienteDao;

	@GetMapping("/mostrarExamen")
	public String verExamen(Model model, Cliente cliente, Principal principal, RedirectAttributes flash) {
		
		model.addAttribute("titulo", "Examen de clasificación");
		
		RutinaFactory rutinaExamen = new RutinaExamen(); 
		cliente = clienteDao.findByEmail(principal.getName());
		
		if(cliente.getNivel() == 8) {
			RutinaEspecifica rutinaEspecifica = rutinaExamen.crearRutinaEspecifica(cliente.getNivel());
			ArrayList<Ejercicio> rutinaFinal = rutinaEspecifica.getRutina();
			flash.addFlashAttribute("info", "Felicidades ya ha completado todos los examenes de calistenia");
			model.addAttribute("rutinaFinal", rutinaFinal);
		}else {
			RutinaEspecifica rutinaEspecifica = rutinaExamen.crearRutinaEspecifica(cliente.getNivel()+1);
			ArrayList<Ejercicio> rutinaFinal = rutinaEspecifica.getRutina();
			model.addAttribute("rutinaFinal", rutinaFinal);
		}
		
		model.addAttribute("cliente", cliente);
		
		return "mostrarExamen";
	}
	
	@PostMapping("/formRutinaExamenSiguiente")
	public String subirNivel(@Valid Cliente cliente, SessionStatus status, RedirectAttributes flash) {

			cliente.setNivel(cliente.getNivel() + 1);
			clienteDao.save(cliente);
			status.setComplete();
		
		return "redirect:index";
	}
	
	@PostMapping("/formRutinaExamenSeleccionar")
	public String seleccionarNivel(@Valid Cliente cliente, SessionStatus status) {

		return "redirect:mostrarRutina";
	}
	
	@GetMapping("/mostrarRutina")
	public String verRutina(Model model, Cliente cliente, Principal principal) {
		model.addAttribute("titulo", "Rutina");
		
		RutinaFactory rutinaExamen = new RutinaDiaria(); 
		cliente = clienteDao.findByEmail(principal.getName());
		RutinaEspecifica rutinaEspecifica = rutinaExamen.crearRutinaEspecifica(cliente.getNivel());
		
		ArrayList<Ejercicio> rutinaFinal = rutinaEspecifica.getRutina();
		
		model.addAttribute("rutinaFinal", rutinaFinal);
		return "mostrarRutina";
	}
	
}
