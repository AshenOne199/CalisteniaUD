package com.springboot.app.logic.fabricaRutina.rutinaDiaria;

import java.util.ArrayList;
import java.util.Date;
import com.springboot.app.logic.fabricaRutina.RutinaEspecifica;
import com.springboot.app.models.entity.Ejercicio;

public class RutinaDiariaNivel5 implements RutinaEspecifica {

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

    public RutinaDiariaNivel5() {
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
        reorganizarRutina();
        limpiarListas();        
        return rutina;
    }

    @SuppressWarnings("deprecation")
	@Override
    public void armarRutina() {
        Ejercicio ejercicio;
        boolean existeEnLista;
        switch (fecha.getDay()) {
            case 1:
                for (Ejercicio ej : ejerciciosPecho) {
                    rutina.add(ej);
                }
                break;
            case 2:
                while (rutina.size() < 7) {
                    existeEnLista = false;
                    ejercicio = ejerciciosEspalda.get(crearValor(0, ejerciciosEspalda.size() - 1));
                    for (Ejercicio ej : rutina) {
                        if (ej.getNombre().equals(ejercicio.getNombre())) {
                            existeEnLista = true;
                            break;
                        }
                    }
                    if (!existeEnLista) {
                        rutina.add(ejercicio);
                    }
                }
                break;
            case 3:
                for (Ejercicio ej : ejerciciosBiceps) {
                    rutina.add(ej);
                }
                for (Ejercicio ej : ejerciciosTriceps) {
                    rutina.add(ej);
                }
                break;
            case 4:
                for (Ejercicio ej : ejerciciosPierna) {
                    rutina.add(ej);
                }
                while (rutina.size() < ejerciciosPierna.size() + 2) {
                    existeEnLista = false;
                    ejercicio = ejerciciosCore.get(crearValor(0, ejerciciosCore.size() - 1));
                    for (Ejercicio ej : rutina) {
                        if (ej.getNombre().equals(ejercicio.getNombre())) {
                            existeEnLista = true;
                            break;
                        }
                    }
                    if (!existeEnLista) {
                        rutina.add(ejercicio);
                    }
                }
                break;
            case 5:
                for (Ejercicio ej : ejerciciosHombros) {
                    rutina.add(ej);
                }
                break;
            case 6:
                while (rutina.size() < 3) {
                    existeEnLista = false;
                    ejercicio = ejerciciosEspalda.get(crearValor(0, ejerciciosEspalda.size() - 1));
                    for (Ejercicio ej : rutina) {
                        if (ej.getNombre().equals(ejercicio.getNombre())) {
                            existeEnLista = true;
                            break;
                        }
                    }
                    if (!existeEnLista) {
                        rutina.add(ejercicio);
                    }
                }
                while (rutina.size() < 6) {
                    existeEnLista = false;
                    ejercicio = ejerciciosPecho.get(crearValor(0, ejerciciosPecho.size() - 1));
                    for (Ejercicio ej : rutina) {
                        if (ej.getNombre().equals(ejercicio.getNombre())) {
                            existeEnLista = true;
                            break;
                        }
                    }
                    if (!existeEnLista) {
                        rutina.add(ejercicio);
                    }
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
        ejercicio1.setNombre("Flexiones de pecho");
        ejercicio1.setDescripcion("Manos en el suelo, apertura un poco más amplia que los hombros, espalda recta y realizar el movimiento controlado");
        ejercicio1.setVideo("flexiones.mp4");
        ejercicio1.setRepeticiones("15 repeticiones");
        ejercicio1.setSeries(4);
        ejercicios.add(ejercicio1);

        Ejercicio ejercicio2 = new Ejercicio();
        ejercicio2.setModalidad("Pecho");
        ejercicio2.setNombre("Fondos con parada abajo");
        ejercicio2.setDescripcion("Realiza un fondo en paralelas convencional, pero párate en la posición de máxima tensión.");
        ejercicio2.setVideo("fondos_parada.mp4");
        ejercicio2.setRepeticiones("12 repeticiones");
        ejercicio2.setSeries(4);
        ejercicios.add(ejercicio2);

        Ejercicio ejercicio3 = new Ejercicio();
        ejercicio3.setModalidad("Pecho");
        ejercicio3.setNombre("Fondos");
        ejercicio3.setDescripcion("Colócate en las paralelas con los codos bloqueados y realiza una flexión de brazos hasta completar un ángulo de 90°");
        ejercicio3.setVideo("fondos.mp4");
        ejercicio3.setRepeticiones("15 repeticiones");
        ejercicio3.setSeries(4);
        ejercicios.add(ejercicio3);

        Ejercicio ejercicio4 = new Ejercicio();
        ejercicio4.setModalidad("Pecho");
        ejercicio4.setNombre("Fondos explosivos");
        ejercicio4.setDescripcion("Realiza un fondo en paralelas convencional pero cada vez que termines una repetición hazlo de manera explosiva, consiguiendo que las manos se despeguen de las barras.");
        ejercicio4.setVideo("fondos_explosivos.mp4");
        ejercicio4.setRepeticiones("10 repeticiones");
        ejercicio4.setSeries(4);
        ejercicios.add(ejercicio4);

        Ejercicio ejercicio5 = new Ejercicio();
        ejercicio5.setModalidad("Pecho");
        ejercicio5.setNombre("Flexiones en diamante");
        ejercicio5.setDescripcion("Manos en el suelo, apertura cerrada manos en forma de diamante, espalda recta y realizar el movimiento controlado.");
        ejercicio5.setVideo("flexiones_diamante.mp4");
        ejercicio5.setRepeticiones("10 repeticiones");
        ejercicio5.setSeries(4);
        ejercicios.add(ejercicio5);

        Ejercicio ejercicio6 = new Ejercicio();
        ejercicio6.setModalidad("Pecho");
        ejercicio6.setNombre("Flexiones abiertas");
        ejercicio6.setDescripcion("Flexiones abiertasManos en el suelo, apertura abierta amplia con respecto a sus hombros, espalda recta y realizar el movimiento controlado");
        ejercicio6.setVideo("flexiones_abiertas.mp4");
        ejercicio6.setRepeticiones("15 repeticiones");
        ejercicio6.setSeries(4);
        ejercicios.add(ejercicio6);

        Ejercicio ejercicio7 = new Ejercicio();
        ejercicio7.setModalidad("Pecho");
        ejercicio7.setNombre("Saltos para muscle up");
        ejercicio7.setDescripcion("Salta desde el suelo  y sube  la dominada de forma explosiva, de manera que metas la cabeza por encima de la barra y quedes en posición de fondo en barra.");
        ejercicio7.setVideo("saltos_mucleup.mp4");
        ejercicio7.setRepeticiones("10 repeticiones");
        ejercicio7.setSeries(4);
        ejercicios.add(ejercicio7);

        Ejercicio ejercicio8 = new Ejercicio();
        ejercicio8.setModalidad("Pecho");
        ejercicio8.setNombre("Fondos en barra");
        ejercicio8.setDescripcion("Colócate en la parte superior de la barra, con los codos bloqueados y realiza una flexión de brazos hasta completar un ángulo de 90° ");
        ejercicio8.setVideo("fondos_barra.mp4");
        ejercicio8.setRepeticiones("12 repeticiones");
        ejercicio8.setSeries(4);
        ejercicios.add(ejercicio8);

        Ejercicio ejercicio9 = new Ejercicio();
        ejercicio9.setModalidad("Espalda");
        ejercicio9.setNombre("Dominadas pronas");
        ejercicio9.setDescripcion("En una barra de dominadas, quédate colgando en agarre prono y flexiona los brazos hasta que la barbilla supere la altura de la barra.");
        ejercicio9.setVideo("dominadas.mp4");
        ejercicio9.setRepeticiones("12 repeticiones");
        ejercicio9.setSeries(4);
        ejercicios.add(ejercicio9);

        Ejercicio ejercicio10 = new Ejercicio();
        ejercicio10.setModalidad("Espalda");
        ejercicio10.setNombre("Dominadas supinas");
        ejercicio10.setDescripcion("En una barra de dominadas, quédate colgando en agarre supino y flexiona los brazos hasta que la barbilla supere la altura de la barra.");
        ejercicio10.setVideo("dominadas_supinas.mp4");
        ejercicio10.setRepeticiones("15 repeticiones");
        ejercicio10.setSeries(4);
        ejercicios.add(ejercicio10);

        Ejercicio ejercicio11 = new Ejercicio();
        ejercicio11.setModalidad("Espalda");
        ejercicio11.setNombre("Dominadas pronas explosivas");
        ejercicio11.setDescripcion("Realiza dominadas con potencia suficiente para que al llegar a la barra tu pecho vaya hacia la misma y las manos se despeguen ligeramente de la misma.");
        ejercicio11.setVideo("dominadas_explosivas.mp4");
        ejercicio11.setRepeticiones("8 repeticiones");
        ejercicio11.setSeries(6);
        ejercicios.add(ejercicio11);

        Ejercicio ejercicio12 = new Ejercicio();
        ejercicio12.setModalidad("Espalda");
        ejercicio12.setNombre("Isometrico dominada supina hasta la mitad");
        ejercicio12.setDescripcion("Sube la barra de un salto y aguanta con los codos a 90º durante un tiempo determinado");
        ejercicio12.setVideo("isometrico_dominada_supina_mitad.mp4");
        ejercicio12.setRepeticiones("15 seundos");
        ejercicio12.setSeries(4);
        ejercicios.add(ejercicio12);

        Ejercicio ejercicio13 = new Ejercicio();
        ejercicio13.setModalidad("Espalda");
        ejercicio13.setNombre("Australian pull ups");
        ejercicio13.setDescripcion("En una barra baja, colócale por debajo para hacer un movimiento de remo con agarre prono.");
        ejercicio13.setVideo("australian_pull_ups.mp4");
        ejercicio13.setRepeticiones("25 repeticiones");
        ejercicio13.setSeries(3);
        ejercicios.add(ejercicio13);

        Ejercicio ejercicio14 = new Ejercicio();
        ejercicio14.setModalidad("Espalda");
        ejercicio14.setNombre("Dominadas con agarre estrecho");
        ejercicio14.setDescripcion("Realiza dominadas con agarre prono, colocando las manos prácticamente unidas o con muy poca separación");
        ejercicio14.setVideo("dominadas_estrechas.mp4");
        ejercicio14.setRepeticiones("10 repeticiones");
        ejercicio14.setSeries(3);
        ejercicios.add(ejercicio14);

        Ejercicio ejercicio15 = new Ejercicio();
        ejercicio15.setModalidad("Espalda");
        ejercicio15.setNombre("Dominadas con agarre amplio");
        ejercicio15.setDescripcion("Realiza dominadas con agarre prono, colocando las manos con una separación mayor a la amplitud de los hombros.");
        ejercicio15.setVideo("dominadas_amplias.mp4");
        ejercicio15.setRepeticiones("12 repeticiones");
        ejercicio15.setSeries(3);
        ejercicios.add(ejercicio15);

        Ejercicio ejercicio16 = new Ejercicio();
        ejercicio16.setModalidad("Espalda");
        ejercicio16.setNombre("Dominadas asimétricas");
        ejercicio16.setDescripcion("En cada repetición la barbilla va a tocar una de las manos, esto hace que el esfuerzo se centre más en uno de los brazos.");
        ejercicio16.setVideo("dominadas_asimetricas.mp4");
        ejercicio16.setRepeticiones("6 repeticiones de cada lado");
        ejercicio16.setSeries(3);
        ejercicios.add(ejercicio16);

        Ejercicio ejercicio17 = new Ejercicio();
        ejercicio17.setModalidad("Espalda");
        ejercicio17.setNombre("Dominadas supinas en L");
        ejercicio17.setDescripcion("Realiza repeticiones de dominadas supinas, pero manteniendo las piernas rectas en posición paralela al suelo");
        ejercicio17.setVideo("dominadas_supinas_l.mp4");
        ejercicio17.setRepeticiones("6 repeticiones");
        ejercicio17.setSeries(3);
        ejercicios.add(ejercicio17);

        Ejercicio ejercicio18 = new Ejercicio();
        ejercicio18.setModalidad("Piernas");
        ejercicio18.setNombre("Sentadilla");
        ejercicio18.setDescripcion("Colocar las piernas con una apertura un poco mayor que la de los hombros, puntas de los pies ligeramente hacia afuera, flexionar rodillas para bajar hasta los 90º y volver a subir, mantener la espalda recta.");
        ejercicio18.setVideo("sentadilla.mp4");
        ejercicio18.setRepeticiones("20 repeticiones");
        ejercicio18.setSeries(4);
        ejercicios.add(ejercicio18);

        Ejercicio ejercicio19 = new Ejercicio();
        ejercicio19.setModalidad("Piernas");
        ejercicio19.setNombre("Bulgarian Squat");
        ejercicio19.setDescripcion("Con el empeine de un pie apoyado en un banco o barra baja, colocarse en posición de zancada y realizar repeticiones.");
        ejercicio19.setVideo("bulgarian_squat.mp4");
        ejercicio19.setRepeticiones("10 repeticiones de cada lado");
        ejercicio19.setSeries(4);
        ejercicios.add(ejercicio19);

        Ejercicio ejercicio20 = new Ejercicio();
        ejercicio20.setModalidad("Piernas");
        ejercicio20.setNombre("Puentes femorales");
        ejercicio20.setDescripcion("Colocarse tumbado en el suelo boca arriba, flexionar rodillas y levantar la cadera hasta que la espalda quede alineada con los muslos.");
        ejercicio20.setVideo("puentes_femorales.mp4");
        ejercicio20.setRepeticiones("20 repeticiones");
        ejercicio20.setSeries(4);
        ejercicios.add(ejercicio20);

        Ejercicio ejercicio21 = new Ejercicio();
        ejercicio21.setModalidad("Piernas");
        ejercicio21.setNombre("Sentadilla profunda");
        ejercicio21.setDescripcion("Realizar sentadillas, pero bajando lo máximo posible, superando de largo los 90º, añade trabajo de femorales y glúteos.");
        ejercicio21.setVideo("sentadila_profunda.mp4");
        ejercicio21.setRepeticiones("12 repeticiones");
        ejercicio21.setSeries(4);
        ejercicios.add(ejercicio21);

        Ejercicio ejercicio22 = new Ejercicio();
        ejercicio22.setModalidad("Biceps");
        ejercicio22.setNombre("Australian chin ups");
        ejercicio22.setDescripcion("En una barra baja, colócale por debajo para hacer un movimiento de remo con agarre supino, llevando la barra a la frente.");
        ejercicio22.setVideo("autralian_chin_ups.mp4");
        ejercicio22.setRepeticiones("12 repeticiones");
        ejercicio22.setSeries(4);
        ejercicios.add(ejercicio22);

        Ejercicio ejercicio23 = new Ejercicio();
        ejercicio23.setModalidad("Biceps");
        ejercicio23.setNombre("Dominadas supinas");
        ejercicio23.setDescripcion("En una barra de dominadas, quédate colgando en agarre supino y flexiona los brazos hasta que la barbilla supere la altura de la barra.");
        ejercicio23.setVideo("dominadas_supinas.mp4");
        ejercicio23.setRepeticiones("15 repeticiones");
        ejercicio23.setSeries(4);
        ejercicios.add(ejercicio23);

        Ejercicio ejercicio24 = new Ejercicio();
        ejercicio24.setModalidad("Triceps");
        ejercicio24.setNombre("Fondos en banco");
        ejercicio24.setDescripcion("En un banco, colocar los brazos y luego bajar hasta alcanzar un ángulo de 90º y volver a subir");
        ejercicio24.setVideo("fondos_banco.mp4");
        ejercicio24.setRepeticiones("25 repeticiones");
        ejercicio24.setSeries(4);
        ejercicios.add(ejercicio24);

        Ejercicio ejercicio25 = new Ejercicio();
        ejercicio25.setModalidad("Triceps");
        ejercicio25.setNombre("Extensión de triceps");
        ejercicio25.setDescripcion("en posición de flexiones, flexionar el brazo hasta que el antebrazo toque por completo el piso y volver a subir.");
        ejercicio25.setVideo("extension_triceps.mp4");
        ejercicio25.setRepeticiones("12 repeticiones");
        ejercicio25.setSeries(4);
        ejercicios.add(ejercicio25);

        Ejercicio ejercicio26 = new Ejercicio();
        ejercicio26.setModalidad("Hombros");
        ejercicio26.setNombre("Tucked planche push ups");
        ejercicio26.setDescripcion("Colócate en posición de tucked planche y haz repeticiones flexionando los brazos e intentando no tocar el suelo con los pies.");
        ejercicio26.setVideo("tuck_planch_push_ups.mp4");
        ejercicio26.setRepeticiones("10 repeticiones");
        ejercicio26.setSeries(3);
        ejercicios.add(ejercicio26);

        Ejercicio ejercicio27 = new Ejercicio();
        ejercicio27.setModalidad("Hobros");
        ejercicio27.setNombre("Flexiones a pino asistidas");
        ejercicio27.setDescripcion("Haz pino contra la pared y flexiona los brazos hasta que tu frente roce el suelo, vuelve a subir hasta estirar los brazos por completo. ");
        ejercicio27.setVideo("flexiones_pino_asistidas.mp4");
        ejercicio27.setRepeticiones("10 repeticiones");
        ejercicio27.setSeries(3);
        ejercicios.add(ejercicio27);

        Ejercicio ejercicio28 = new Ejercicio();
        ejercicio28.setModalidad("Hombros");
        ejercicio28.setNombre("Flexiones pike");
        ejercicio28.setDescripcion("Acerca las manos y los pies, levantando la cadera y realiza flexiones con la cabeza entre los brazos. ");
        ejercicio28.setVideo("flexiones_pike.mp4");
        ejercicio28.setRepeticiones("15 repeticiones");
        ejercicio28.setSeries(3);
        ejercicios.add(ejercicio28);

        Ejercicio ejercicio29 = new Ejercicio();
        ejercicio29.setModalidad("Hombros");
        ejercicio29.setNombre("Flexiones de pecho declinadas");
        ejercicio29.setDescripcion("Flexiones con los pies en una altura superior al nivel de los brazos, en la posición superior aguanta la posición 5 segundos, utiliza un banco, silla o barra baja,");
        ejercicio29.setVideo("flexiones_pecho_declinadas.mp4");
        ejercicio29.setRepeticiones("12 repeticiones");
        ejercicio29.setSeries(3);
        ejercicios.add(ejercicio29);

        Ejercicio ejercicio30 = new Ejercicio();
        ejercicio30.setModalidad("Core");
        ejercicio30.setNombre("Knee raises en barra");
        ejercicio30.setDescripcion("Colócate colgado de la barra y lleva las rodillas al pecho, sin flexionar los brazos, para poder hacer repeticiones de forma correcta, debes realizar el movimiento lento y controlado. ");
        ejercicio30.setVideo("knee_raises.mp4");
        ejercicio30.setRepeticiones("15 repeticiones");
        ejercicio30.setSeries(4);
        ejercicios.add(ejercicio30);

        Ejercicio ejercicio31 = new Ejercicio();
        ejercicio31.setModalidad("Core");
        ejercicio31.setNombre("L-Sit Raises en barras");
        ejercicio31.setDescripcion("Colócate colgado en la barra y levanta las piernas rectas hasta formar un ángulo de 90° con tu cuerpo, evita usar balanceo o inercia.");
        ejercicio31.setVideo("lsit_raises.mp4");
        ejercicio31.setRepeticiones("15 repeticiones");
        ejercicio31.setSeries(4);
        ejercicios.add(ejercicio31);

        Ejercicio ejercicio32 = new Ejercicio();
        ejercicio32.setModalidad("Core");
        ejercicio32.setNombre("L sit en paralelas");
        ejercicio32.setDescripcion("Colócate en posición de L-sit con las piernas paralelas al suelo, completamente rectas y pies punteados, luego intenta sacar un poco la cadera hacia adelante, inclinando la espalda ligeramente hacia atrás si es necesario, y mantener la posición.");
        ejercicio32.setVideo("lsit.mp4");
        ejercicio32.setRepeticiones("20 segundos");
        ejercicio32.setSeries(4);
        ejercicios.add(ejercicio32);

        Ejercicio ejercicio33 = new Ejercicio();
        ejercicio33.setModalidad("Core");
        ejercicio33.setNombre("Tijeras en el suelo");
        ejercicio33.setDescripcion("Acostado boca arriba, levanta las piernas justo para que los talones no toquen el suelo, mantenlas ahí y crúzalas una y otra vez.");
        ejercicio33.setVideo("tijeras_suelo.mp4");
        ejercicio33.setRepeticiones("20 repeticiones");
        ejercicio33.setSeries(4);
        ejercicios.add(ejercicio33);

        Ejercicio ejercicio34 = new Ejercicio();
        ejercicio34.setModalidad("Core");
        ejercicio34.setNombre("Mountain Climbers");
        ejercicio34.setDescripcion("Desde la posición de flexiones, adelanta un pie cada vez, como si estuvieras intentando correr, intenta mantener la cadera en una posición fija,");
        ejercicio34.setVideo("mountain_climbers.mp4");
        ejercicio34.setRepeticiones("40 repeticiones");
        ejercicio34.setSeries(4);
        ejercicios.add(ejercicio34);

        Ejercicio ejercicio35 = new Ejercicio();
        ejercicio35.setModalidad("Core");
        ejercicio35.setNombre("Rusian Twist");
        ejercicio35.setDescripcion("Colócate boca arriba en el suelo, apoyando solamente en la parte superior de los glúteos y con las rodillas flexionadas, une las manos frente a tu pecho en posición de rezo y gira el torso de un lado a otro.");
        ejercicio35.setVideo("rusian_twist.mp4");
        ejercicio35.setRepeticiones("30 repeticiones");
        ejercicio35.setSeries(4);
        ejercicios.add(ejercicio35);
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

