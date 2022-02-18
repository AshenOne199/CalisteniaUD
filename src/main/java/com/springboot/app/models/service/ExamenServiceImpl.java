package com.springboot.app.models.service;
import java.util.ArrayList;
//Clase que implementa la interfaz IExamenService y sobreescribe los metodos para consultas en MYSQL
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.app.logic.fabricaRutina.*;
import com.springboot.app.logic.fabricaRutina.examen.RutinaExamen;
import com.springboot.app.models.entity.Ejercicio;

@Service
public class ExamenServiceImpl implements IExamenService {

	private ClienteLogueadoService clienteLogueadoService;
	private RutinaFactory rutinaFactory;
	private RutinaEspecifica rutinaEspecifica;
	
	
	@Override
	public ArrayList<Ejercicio> crearExamen() {
		clienteLogueadoService = ClienteLogueadoService.getService();
		rutinaFactory = new RutinaExamen();
		rutinaEspecifica = rutinaFactory.crearRutinaEspecifica(Integer.parseInt(clienteLogueadoService.getCliente().getNivel()+""));
		return rutinaEspecifica.getRutina();
	}	

}
