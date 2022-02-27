package com.springboot.app.logic.rutinaFactory.rutina;

import com.springboot.app.logic.rutinaFactory.RutinaEspecifica;
import com.springboot.app.logic.rutinaFactory.RutinaFactory;

public class RutinaDiaria implements RutinaFactory{

    @Override
    public RutinaEspecifica crearRutinaEspecifica(int nivel) {
        switch (nivel) {
            case 0:
                return new RutinaDiariaNivel0();
            case 1:
                return new RutinaDiariaNivel1();
            case 2:
                return new RutinaDiariaNivel2();
            case 3:
                return new RutinaDiariaNivel3();
            case 4:
                return new RutinaDiariaNivel4();
            case 5:
                return new RutinaDiariaNivel5();
            case 6:
                return new RutinaDiariaNivel6();
            case 7:
                return new RutinaDiariaNivel7();
            case 8:
                return new RutinaDiariaNivel8();
            default:
                System.out.println("ATENCIÓN: Dato ingresado invalido");
                return null;
        }
    }
    
}
