package com.springboot.app.models.service;
//Clase que implementa la interfaz IExamenService y sobreescribe los metodos para consultas en MYSQL
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.app.models.dao.IExamenDao;
import com.springboot.app.models.entity.Examen;

@Service
public class ExamenServiceImpl implements IExamenService {

	@Autowired
	private IExamenDao examenDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Examen> findAll() {
		return (List<Examen>) examenDao.findAll();
	}

	@Override
	@Transactional
	public void save(Examen examen) {
		examenDao.save(examen);
	}

	@Override
	@Transactional(readOnly = true)
	public Examen findOne(Long id) {
		return examenDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		examenDao.deleteById(id);

	}

}
