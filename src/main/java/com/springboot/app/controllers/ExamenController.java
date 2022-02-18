package com.springboot.app.controllers;
//Todas las peticiones que impliquen usar la entidad Examen se encuentran aqui
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.springboot.app.models.entity.Cliente;
import com.springboot.app.models.entity.Examen;
import com.springboot.app.models.service.ClienteLogueadoService;
import com.springboot.app.models.service.ClienteServiceImpl;
import com.springboot.app.models.service.IExamenService;

@Controller
@SessionAttributes("examen")
public class ExamenController {

	@Autowired
	private IExamenService examenService;
	
	@Autowired
	private ClienteServiceImpl clienteService;
	
	//Ir a vista formExamen y enviar los campos del examen
	@GetMapping("/formExamen/{clienteId}")
	public String irExamen(@PathVariable(value = "clienteId")Long clienteId, Model model, RedirectAttributes flash) {
		
		ClienteLogueadoService clienteLogueadoService;
		clienteLogueadoService = ClienteLogueadoService.getService();
		Cliente cliente = clienteLogueadoService.getCliente();
		if(cliente == null) {
			flash.addFlashAttribute("error", "El cliente no existe");
			return "redirect:/index";
		}
		
		
		
		Examen examen = new Examen();
		examen.setCliente(cliente);
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
		status.setComplete();
		flash.addFlashAttribute("success", "Examen respondido con exito!");
		return "redirect:index";
	}
	
	
}
