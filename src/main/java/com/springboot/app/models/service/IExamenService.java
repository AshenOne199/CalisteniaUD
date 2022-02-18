package com.springboot.app.models.service;

import java.util.ArrayList;
//Clase contrato para las operaciones en la tabla examenes
import com.springboot.app.models.entity.Examen;
import com.springboot.app.models.entity.Ejercicio;

public interface IExamenService {
	public ArrayList<Ejercicio> crearExamen();

}
