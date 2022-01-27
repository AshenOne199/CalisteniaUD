package com.springboot.app.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.springboot.app.models.entity.Examen;
//Interfaz que hereda la clase para hacer consultas y paginacion a la base de datos de la entidad Examen
public interface IExamenDao extends PagingAndSortingRepository<Examen, Long>{

}
