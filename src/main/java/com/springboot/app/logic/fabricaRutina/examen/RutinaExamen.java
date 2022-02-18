package com.springboot.app.logic.fabricaRutina.examen;

import com.springboot.app.logic.fabricaRutina.*;



public class RutinaExamen implements RutinaFactory {

    @Override
    public RutinaEspecifica crearRutinaEspecifica(int nivel) {
        switch (nivel) {
            case 1:
                return new ExamenNivel1();
            case 2:
                return new ExamenNivel2();
            case 3:
                return new ExamenNivel3();
            case 4:
                return new ExamenNivel4();
            case 5:
                return new ExamenNivel5();
            case 6:
                return new ExamenNivel6();
            case 7:
                return new ExamenNivel7();
            case 8:
                return new ExamenNivel8();
            default:
                System.out.println("ATENCIÓN: Dato ingresado invalido");
                return null;
        }
    }
    
}
