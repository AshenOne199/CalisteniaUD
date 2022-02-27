package com.springboot.app.logic.rutinaFactory.examen;

import java.util.ArrayList;

import com.springboot.app.logic.rutinaFactory.RutinaEspecifica;
import com.springboot.app.models.entity.Ejercicio;

public class ExamenNivel3 implements RutinaEspecifica {

    private ArrayList<Ejercicio> rutina;

    public ExamenNivel3() {
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
        ejercicio.setNombre("Flexiones de pecho");
        ejercicio.setDescripcion("Manos en el suelo, apertura un poco más amplia que los hombros, espalda recta y realizar el movimiento controlado");
        ejercicio.setVideo("flexiones.mp4");
        ejercicio.setRepeticiones("4");
        ejercicio.setSeries(4);
        rutina.add(ejercicio);

        Ejercicio ejercicio1 = new Ejercicio();
        ejercicio1.setModalidad("Pecho");
        ejercicio1.setNombre("Fondos");
        ejercicio1.setDescripcion("Colocate en las paralelas con los codos bloqueados y realiza una flexión de brazos hasta completar un ángulo de 90°");
        ejercicio1.setVideo("fondos.mp4");
        ejercicio1.setRepeticiones("4");
        ejercicio1.setSeries(4);
        rutina.add(ejercicio1);

        Ejercicio ejercicio2 = new Ejercicio();
        ejercicio2.setModalidad("Espalda");
        ejercicio2.setNombre("Dominadas pronas");
        ejercicio2.setDescripcion("En una barra de dominadas, quédate colgando en agarre prono y flexiona los brazos hasta que la barbilla supere la altura de la barra.");
        ejercicio2.setVideo("dominadas.mp4");
        ejercicio2.setRepeticiones("4");
        ejercicio2.setSeries(4);
        rutina.add(ejercicio2);

        Ejercicio ejercicio3 = new Ejercicio();
        ejercicio3.setModalidad("Espalda");
        ejercicio3.setNombre("Dominadas supinas");
        ejercicio3.setDescripcion("En una barra de dominadas, quédate colgando en agarre supino y flexiona los brazos hasta que la barbilla supere la altura de la barra.");
        ejercicio3.setVideo("dominadas_supinas.mp4");
        ejercicio3.setRepeticiones("10");
        ejercicio3.setSeries(4);
        rutina.add(ejercicio3);

        Ejercicio ejercicio4 = new Ejercicio();
        ejercicio4.setModalidad("Pierna");
        ejercicio4.setNombre("Sentadilla");
        ejercicio4.setDescripcion("Colocar las piernas con una apertura un poco mayor que la de los hombros, puntas de los pies ligeramente hacia afuera, flexionar rodillas para bajar hasta los 90º y volver a subir, mantener la espalda recta.");
        ejercicio4.setVideo("sentadilla.mp4");
        ejercicio4.setRepeticiones("12");
        ejercicio4.setSeries(4);
        rutina.add(ejercicio4);

        Ejercicio ejercicio5 = new Ejercicio();
        ejercicio5.setModalidad("Biceps");
        ejercicio5.setNombre("Australian chin ups");
        ejercicio5.setDescripcion("En una barra baja, colocale por debajo para hacer un movimiento de remo con agarre supino, llevando la barra a la frente.");
        ejercicio5.setVideo("autralian_chin_ups.mp4");
        ejercicio5.setRepeticiones("4");
        ejercicio5.setSeries(4);
        rutina.add(ejercicio5);

        Ejercicio ejercicio6 = new Ejercicio();
        ejercicio6.setModalidad("Triceps");
        ejercicio6.setNombre("Extensión de triceps");
        ejercicio6.setDescripcion("en posición de flexiones, flexionar el brazo hasta que el antebrazo toque por completo el piso y volver a subir.");
        ejercicio6.setVideo("extension_triceps.mp4");
        ejercicio6.setRepeticiones("4");
        ejercicio6.setSeries(4);
        rutina.add(ejercicio6);

        Ejercicio ejercicio7 = new Ejercicio();
        ejercicio7.setModalidad("Hombro");
        ejercicio7.setNombre("Flexiones a pino asistidas");
        ejercicio7.setDescripcion("Haz pino contra la pared y flexiona los brazos hasta que tu frente roce el suelo, vuelve a subir hasta estirar los brazos por completo.");
        ejercicio7.setVideo("flexiones_pino_asistidas.mp4");
        ejercicio7.setRepeticiones("3");
        ejercicio7.setSeries(4);
        rutina.add(ejercicio7);

        Ejercicio ejercicio8 = new Ejercicio();
        ejercicio8.setModalidad("Hombro");
        ejercicio8.setNombre("Tucked planche push ups");
        ejercicio8.setDescripcion("Colocate en posicion de tucked planche y haz repeticiones flexionando los brazos e intentando no tocar el suelo con los pies.");
        ejercicio8.setVideo("tuck_planch_push_ups.mp4");
        ejercicio8.setRepeticiones("3");
        ejercicio8.setSeries(4);
        rutina.add(ejercicio8);
    }

}
