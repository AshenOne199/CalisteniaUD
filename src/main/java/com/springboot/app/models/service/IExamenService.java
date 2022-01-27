package com.springboot.app.models.service;
//Clase contrato para las operaciones en la tabla examenes
import java.util.List;

import com.springboot.app.models.entity.Examen;

public interface IExamenService {

	public List<Examen> findAll();
	
	public void save(Examen examen);

	public Examen findOne(Long id);

	public void delete(Long id);
	
}
