package com.springboot.app.logic.rutrinaFactory.rutina;

import java.util.ArrayList;
import java.util.Date;

import com.springboot.app.logic.rutrinaFactory.RutinaEspecifica;
import com.springboot.app.models.entity.Ejercicio;

public class RutinaDiariaNivel0 implements RutinaEspecifica {

    private ArrayList<Ejercicio> rutina;
    private ArrayList<Ejercicio> ejercicios;
    private ArrayList<Ejercicio> ejerciciosPecho;
    private ArrayList<Ejercicio> ejerciciosEspalda;
    private ArrayList<Ejercicio> ejerciciosPierna;
    private ArrayList<Ejercicio> ejerciciosBiceps;
    private ArrayList<Ejercicio> ejerciciosTriceps;
    private ArrayList<Ejercicio> ejerciciosHombros;
    private ArrayList<Ejercicio> ejerciciosCore;
    private Date fecha;

    public RutinaDiariaNivel0() {
        ejercicios = new ArrayList<>();
        ejerciciosPecho = new ArrayList<>();
        ejerciciosEspalda = new ArrayList<>();
        ejerciciosPierna = new ArrayList<>();
        ejerciciosBiceps = new ArrayList<>();
        ejerciciosTriceps = new ArrayList<>();
        ejerciciosHombros = new ArrayList<>();
        ejerciciosCore = new ArrayList<>();
        rutina = new ArrayList<>();
        fecha = new Date();
    }
    
    @Override
    public ArrayList<Ejercicio> getRutina() {
        ejercicios.clear();        
        rutina.clear();
        limpiarListas();
        
        armarListaEjercicios();
        dividirListas();
        armarRutina();
        
        limpiarListas(); 
        reorganizarRutina();        
        return rutina;
    }

    @SuppressWarnings("deprecation")
	@Override
    public void armarRutina() {
        switch (fecha.getDay()) {
            case 1:
            case 5:
                for (Ejercicio ej : ejerciciosPecho) {
                    rutina.add(ej);
                }
                for (Ejercicio ej : ejerciciosPecho) {
                    rutina.add(ej);
                }
                break;
            case 2:
            case 6:
                for (Ejercicio ej : ejerciciosEspalda) {
                    rutina.add(ej);
                }
                for (Ejercicio ej : ejerciciosBiceps) {
                    rutina.add(ej);
                }
                break;
            case 3:
            case 0:
                for (Ejercicio ej : ejerciciosHombros) {
                    rutina.add(ej);
                }
                break;
            default:
                for (Ejercicio ej : ejerciciosCore) {
                    rutina.add(ej);
                }
                break;
        }
    }
            
    public void armarListaEjercicios() {
        Ejercicio ejercicio1 = new Ejercicio();
        ejercicio1.setModalidad("Pecho");
        ejercicio1.setNombre("Flexiones de pecho apertura normal con rodillas apoyadas");
        ejercicio1.setDescripcion("Flexiones apoyando sus rodillas en el piso, colocar sus manos a una apertura igual al ancho de los hombros, contraer el core y realizar el movimiento de manera controlada.");
        ejercicio1.setVideo("flexiones_con_rodillas.mp4");
        ejercicio1.setRepeticiones("4 repeticiones");
        ejercicio1.setSeries(2);
        ejercicios.add(ejercicio1);

        Ejercicio ejercicio2 = new Ejercicio();
        ejercicio2.setModalidad("Pecho");
        ejercicio2.setNombre("Flexiones de pecho inclinadas");
        ejercicio2.setDescripcion("Flexiones apoyando las manos a una altura superior a los pies, utiliza un banco o una barra, a mayor altura de las manos más fáciles son");
        ejercicio2.setVideo("flexiones_inclinadas.mp4");
        ejercicio2.setRepeticiones("4 repeticiones");
        ejercicio2.setSeries(2);
        ejercicios.add(ejercicio2);

        Ejercicio ejercicio3 = new Ejercicio();
        ejercicio3.setModalidad("Pecho");
        ejercicio3.setNombre("Isométrico Flexiones de pecho");
        ejercicio3.setDescripcion("Mantener la posición baja de flexión de pecho durante 20 segundos. ");
        ejercicio3.setVideo("isometrico_flexiones_principiante.mp4");
        ejercicio3.setRepeticiones("10 segundos");
        ejercicio3.setSeries(2);
        ejercicios.add(ejercicio3);

        Ejercicio ejercicio4 = new Ejercicio();
        ejercicio4.setModalidad("Pecho");
        ejercicio4.setNombre("Fondos de pecho cortos");
        ejercicio4.setDescripcion("En unas paralelas, realiza fondos de rango corto, de 45°, intenta no encogerte de hombros ni balancearte.");
        ejercicio4.setVideo("fondos_cortos.mp4");
        ejercicio4.setRepeticiones("4 repeticones");
        ejercicio4.setSeries(2);
        ejercicios.add(ejercicio4);

        Ejercicio ejercicio5 = new Ejercicio();
        ejercicio5.setModalidad("Pecho");
        ejercicio5.setNombre("Isométrico Fondos");
        ejercicio5.setDescripcion("Colócate en las paralelas realiza un fondo hasta bajar los 90° y mantente en esa posición.");
        ejercicio5.setVideo("isometrico_fondo.mp4");
        ejercicio5.setRepeticiones("10 segundos");
        ejercicio5.setSeries(2);
        ejercicios.add(ejercicio5);

        Ejercicio ejercicio6 = new Ejercicio();
        ejercicio6.setModalidad("Espalda");
        ejercicio6.setNombre("Dead hang");
        ejercicio6.setDescripcion("En una barra de dominadas, quédate colgado en agarre prono y aguanta esa posición un tiempo determinado.");
        ejercicio6.setVideo("dead_hang.mp4");
        ejercicio6.setRepeticiones("10 segundos");
        ejercicio6.setSeries(2);
        ejercicios.add(ejercicio6);

        Ejercicio ejercicio7 = new Ejercicio();
        ejercicio7.setModalidad("Espalda");
        ejercicio7.setNombre("Dominadas supinas");
        ejercicio7.setDescripcion("En una barra de dominadas, quédate colgando en agarre supino y flexiona los brazos hasta que la barbilla supere la altura de la barra.");
        ejercicio7.setVideo("dominadas_supinas.mp4");
        ejercicio7.setRepeticiones("3 repeticiones");
        ejercicio7.setSeries(2);
        ejercicios.add(ejercicio7);

        Ejercicio ejercicio8 = new Ejercicio();
        ejercicio8.setModalidad("Espalda");
        ejercicio8.setNombre("Dominadas pronas negativas");
        ejercicio8.setDescripcion("Salta hasta colocarte con la barbilla por encima de la barra con agarre prono y luego baja lentamente hasta bloquear los codos, controla la bajada lo máximo posible. ");
        ejercicio8.setVideo("dominadas_negativas.mp4");
        ejercicio8.setRepeticiones("3 repeticiones");
        ejercicio8.setSeries(2);
        ejercicios.add(ejercicio8);

        Ejercicio ejercicio9 = new Ejercicio();
        ejercicio9.setModalidad("Espalda");
        ejercicio9.setNombre("Australian pull ups");
        ejercicio9.setDescripcion("En una barra baja, colócale por debajo para hacer un movimiento de remo con agarre prono.");
        ejercicio9.setVideo("australian_pull_ups.mp4");
        ejercicio9.setRepeticiones("6 repeticiones");
        ejercicio9.setSeries(2);
        ejercicios.add(ejercicio9);

        Ejercicio ejercicio10 = new Ejercicio();
        ejercicio10.setModalidad("Espalda");
        ejercicio10.setNombre("Isométrico dominadas pronas");
        ejercicio10.setDescripcion("Salta hasta colocarte con la barbilla por encima de la barra con agarre prono y mantén esa posición durante un tiempo determinado.");
        ejercicio10.setVideo("isometrico_dominadas.mp4");
        ejercicio10.setRepeticiones("10 segundos");
        ejercicio10.setSeries(2);
        ejercicios.add(ejercicio10);

        Ejercicio ejercicio11 = new Ejercicio();
        ejercicio11.setModalidad("Biceps");
        ejercicio11.setNombre("Dominadas supinas cortas");
        ejercicio11.setDescripcion("Salta hasta colocarte con la barbilla por encima de la barra en agarre supino e intenta bajar un poco y volver a subir, realizando repeticiones cortas de hasta unos 45°. ");
        ejercicio11.setVideo("dominadas_supinas_cortas.mp4");
        ejercicio11.setRepeticiones("4 repeticiones");
        ejercicio11.setSeries(2);
        ejercicios.add(ejercicio11);

        Ejercicio ejercicio12 = new Ejercicio();
        ejercicio12.setModalidad("Triceps");
        ejercicio12.setNombre("Fondos en banco");
        ejercicio12.setDescripcion("Con un banco que tenga una altura entre tus rodillas y tu cadera, colócate de espaldas con las manos en el borde y realiza fondos, hasta llegar o superar ligeramente los 90°. ");
        ejercicio12.setVideo("fondos_banco.mp4");
        ejercicio12.setRepeticiones("6 repeticiones");
        ejercicio12.setSeries(2);
        ejercicios.add(ejercicio12);

        Ejercicio ejercicio13 = new Ejercicio();
        ejercicio13.setModalidad("Hombros");
        ejercicio13.setNombre("Pino asistido contra la pared");
        ejercicio13.setDescripcion("Coloca las manos en el suelo e impulsa las piernas para quedarte en la posición de pino contra la pared.");
        ejercicio13.setVideo("pino_asistido.mp4");
        ejercicio13.setRepeticiones("3 repeticiones");
        ejercicio13.setSeries(2);
        ejercicios.add(ejercicio13);

        Ejercicio ejercicio14 = new Ejercicio();
        ejercicio14.setModalidad("Hombros");
        ejercicio14.setNombre("Flexiones en pica");
        ejercicio14.setDescripcion("Coloca las manos en el suelo cerca a tus pies y realiza flexiones en esta posición");
        ejercicio14.setVideo("flexiones_pica.mp4");
        ejercicio14.setRepeticiones("4 repeticiones");
        ejercicio14.setSeries(2);
        ejercicios.add(ejercicio14);

        Ejercicio ejercicio15 = new Ejercicio();
        ejercicio15.setModalidad("Hombros");
        ejercicio15.setNombre("Isométrico flexiones desendentes");
        ejercicio15.setDescripcion("Coloca tus pies a una altura superior a tus manos y aguanta en esta posición por un tiempo determinado.");
        ejercicio15.setVideo("isometrico_flexiones_desendente.mp4");
        ejercicio15.setRepeticiones("10 segundos");
        ejercicio15.setSeries(2);
        ejercicios.add(ejercicio15);

        Ejercicio ejercicio16 = new Ejercicio();
        ejercicio16.setModalidad("Core");
        ejercicio16.setNombre("Knee raises en barra");
        ejercicio16.setDescripcion("Colócate colgado de la barra y lleva las rodillas al pecho, sin flexionar los brazos, para poder hacer repeticiones de forma correcta, debes realizar el movimiento lento y controlado.");
        ejercicio16.setVideo("knee_raises.mp4");
        ejercicio16.setRepeticiones("6 repeticiones");
        ejercicio16.setSeries(2);
        ejercicios.add(ejercicio16);

        Ejercicio ejercicio17 = new Ejercicio();
        ejercicio17.setModalidad("Core");
        ejercicio17.setNombre("L-Sit Raises en fondos");
        ejercicio17.setDescripcion("Colócate en posición de fondos y levanta las piernas rectas hasta formar un ángulo de 90° con tu cuerpo, evita usar balanceo o inercia.");
        ejercicio17.setVideo("lsit_raises.mp4");
        ejercicio17.setRepeticiones("6 repeticiones");
        ejercicio17.setSeries(2);
        ejercicios.add(ejercicio17);
    }
    
    public void reorganizarRutina() {
        ArrayList<Ejercicio> arrDes = new ArrayList<>();
        while (rutina.size() > 0) {
            int val = crearValor(0, rutina.size() - 1);
            arrDes.add(rutina.get(val));
            rutina.remove(val);
        }
        rutina = arrDes;
    }
    
    public int crearValor(int numeroMenor, int numeroMayor) {
        return (int) Math.floor(Math.random() * (numeroMayor - numeroMenor + 1) + numeroMenor);
    }
    
    public void dividirListas() {        
        for (Ejercicio ejercicio : ejercicios) {
            if ("Core".equals(ejercicio.getModalidad())) {
                ejerciciosCore.add(ejercicio);
            }
            if ("Hombros".equals(ejercicio.getModalidad())) {
                ejerciciosHombros.add(ejercicio);
            }
            if ("Triceps".equals(ejercicio.getModalidad())) {
                ejerciciosTriceps.add(ejercicio);
            }
            if ("Biceps".equals(ejercicio.getModalidad())) {
                ejerciciosBiceps.add(ejercicio);
            }
            if ("Piernas".equals(ejercicio.getModalidad())) {
                ejerciciosPierna.add(ejercicio);
            }
            if ("Espalda".equals(ejercicio.getModalidad())) {
                ejerciciosEspalda.add(ejercicio);
            }
            if ("Pecho".equals(ejercicio.getModalidad())) {
                ejerciciosPecho.add(ejercicio);
            }
        }
    }
    
    public void limpiarListas(){ 
        ejerciciosBiceps.clear();
        ejerciciosCore.clear();
        ejerciciosEspalda.clear();
        ejerciciosHombros.clear();
        ejerciciosPecho.clear();
        ejerciciosPierna.clear();
        ejerciciosTriceps.clear();
    }

}
