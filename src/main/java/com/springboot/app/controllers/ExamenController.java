package com.springboot.app.controllers;
//Todas las peticiones que impliquen usar la entidad Examen se encuentran aqui
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springboot.app.models.entity.Examen;
import com.springboot.app.models.service.IExamenService;

@Secured("ROLE_USER")
@Controller
@SessionAttributes("examen")
public class ExamenController {

	@Autowired
	private IExamenService examenService;
	
	//Mapeo vista principal: index
	@GetMapping({"/", "", "/index"})
	public String index(Model model) {
		model.addAttribute("titulo", "Bienvendo a Calistenia UD");
		return "index";
	}
	
	//Ir a vista formExamen y enviar los campos del examen
	@GetMapping("/formExamen")
	public String irExamen(Model model) {
		Examen examen = new Examen();
		model.addAttribute("examen", examen);
		model.addAttribute("titulo", "Examen de clasificación");
		return "formExamen";
	}
	
	//Recibir peticiones post de la vista formExamen, validar y guardar en DB respuestas.
	@PostMapping("/formExamen")
	public String guardarExamen(@Valid Examen examen, BindingResult result, Model model, RedirectAttributes flash, SessionStatus status) {
		
		if (result.hasErrors()) {
			model.addAttribute("titulo", "Examen de clasificación");
			return "formExamen";
		}
		
		examenService.save(examen);
		status.setComplete();
		flash.addFlashAttribute("success", "Examen respondido con exito!");
		return "redirect:index";
	}
	
	
}
