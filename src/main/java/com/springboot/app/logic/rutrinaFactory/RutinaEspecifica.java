package com.springboot.app.logic.rutrinaFactory;

import java.util.ArrayList;

import com.springboot.app.models.entity.Ejercicio;

public interface RutinaEspecifica {
    public ArrayList<Ejercicio> getRutina();
    public void armarRutina();
}
