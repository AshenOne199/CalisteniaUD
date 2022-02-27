package com.springboot.app.logic.rutinaFactory.examen;

import java.util.ArrayList;

import com.springboot.app.logic.rutinaFactory.RutinaEspecifica;
import com.springboot.app.models.entity.Ejercicio;

public class ExamenNivel1 implements RutinaEspecifica {

    private ArrayList<Ejercicio> rutina;

    public ExamenNivel1() {
        rutina = new ArrayList<>();
    }

    @Override
    public ArrayList<Ejercicio> getRutina() {
        armarRutina();
        return rutina;
    }

    @Override
    public void armarRutina() {
        Ejercicio ejercicio = new Ejercicio();
        ejercicio.setModalidad("Pecho");
        ejercicio.setNombre("Flexiones de pecho apertura normal con rodillas apoyadas");
        ejercicio.setDescripcion("Flexiones apoyando sus rodillas en el piso, colocar sus manos a una apertura igual al ancho de los hombros, \n"
                + "contraer el core y realizar el movimiento de manera controlada.");
        ejercicio.setVideo("flexiones_con_rodillas.mp4");
        ejercicio.setRepeticiones("8");
        ejercicio.setSeries(3);
        rutina.add(ejercicio);

        Ejercicio ejercicio1 = new Ejercicio();
        ejercicio1.setModalidad("Pecho");
        ejercicio1.setNombre("Isométrico Flexiones de pecho");
        ejercicio1.setDescripcion("Mantener la posición baja de flexión de pecho durante 20 segundos.");
        ejercicio1.setVideo("isometrico_flexiones_principiante.mp4");
        ejercicio1.setRepeticiones("25 seg");
        ejercicio1.setSeries(4);
        rutina.add(ejercicio1);

        Ejercicio ejercicio2 = new Ejercicio();
        ejercicio2.setModalidad("Espalda");
        ejercicio2.setNombre("Dominadas supinas");
        ejercicio2.setDescripcion("En una barra de dominadas, quedate colgando en agarre supino \n"
                + "y flexiona los brazos hasta que la barbilla supere la altura de la barra.");
        ejercicio2.setVideo("dominadas_supinas.mp4");
        ejercicio2.setRepeticiones("4");
        ejercicio2.setSeries(3);
        rutina.add(ejercicio2);

        Ejercicio ejercicio3 = new Ejercicio();
        ejercicio3.setModalidad("Espalda");
        ejercicio3.setNombre("Australian pull ups");
        ejercicio3.setDescripcion("En una barra baja, colocale por debajo para hacer un movimiento de remo con agarre prono.");
        ejercicio3.setVideo("australian_pull_ups.mp4");
        ejercicio3.setRepeticiones("10");
        ejercicio3.setSeries(3);
        rutina.add(ejercicio3);

        Ejercicio ejercicio4 = new Ejercicio();
        ejercicio4.setModalidad("Biceps");
        ejercicio4.setNombre("Dominadas supinas cortas");
        ejercicio4.setDescripcion("Salta hsta colocarte con la barbilla por encima de la barra en agarre supino e intenta bajar un poco y\n"
                + "volver a subir, realizando repeticiones cortas de hasta unnos 45°.");
        ejercicio4.setVideo("dominadas_supinas_cortas.mp4");
        ejercicio4.setRepeticiones("6");
        ejercicio4.setSeries(3);
        rutina.add(ejercicio4);

        Ejercicio ejercicio5 = new Ejercicio();
        ejercicio5.setModalidad("Triceps");
        ejercicio5.setNombre("Fondos en banco");
        ejercicio5.setDescripcion("Con un banco que tenga una altura entre tus rodillas y tu cadera, colócate de espaldas\n"
                + "con las manos en el borde y realiza fondos, hasta llegar o superar ligeramente los 90°.");
        ejercicio5.setVideo("fondos_banco.mp4");
        ejercicio5.setRepeticiones("10");
        ejercicio5.setSeries(4);
        rutina.add(ejercicio5);

        Ejercicio ejercicio6 = new Ejercicio();
        ejercicio6.setModalidad("Hombro");
        ejercicio6.setNombre("Pino asistido contra la pared");
        ejercicio6.setDescripcion("Coloca las manos en el suelo e impulsa las piernas para quedarte en la posicion de pino contra la pared.");
        ejercicio6.setVideo("pino_asistido.mp4");
        ejercicio6.setRepeticiones("6");
        ejercicio6.setSeries(3);
        rutina.add(ejercicio6);
    }

}
