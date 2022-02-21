package com.springboot.app.logic.rutrinaFactory.rutina;

import java.util.ArrayList;
import java.util.Date;

import com.springboot.app.logic.rutrinaFactory.RutinaEspecifica;
import com.springboot.app.models.entity.Ejercicio;

public class RutinaDiariaNivel6 implements RutinaEspecifica {

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

    public RutinaDiariaNivel6() {
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
                while (rutina.size() < ejerciciosPecho.size() + 2) {
                    existeEnLista = false;
                    ejercicio = ejerciciosTriceps.get(crearValor(0, ejerciciosTriceps.size() - 1));
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
            case 2:
                for (Ejercicio ej : ejerciciosEspalda) {
                    rutina.add(ej);
                }
                while (rutina.size() < ejerciciosEspalda.size() + 1) {
                    existeEnLista = false;
                    ejercicio = ejerciciosBiceps.get(crearValor(0, ejerciciosBiceps.size() - 1));
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
                for (Ejercicio ej : ejerciciosPierna) {
                    rutina.add(ej);
                }
                break;
            case 4:
                for (Ejercicio ej : ejerciciosHombros) {
                    rutina.add(ej);
                }
                break;
            case 5:
                for (Ejercicio ej : ejerciciosBiceps) {
                    rutina.add(ej);
                }
                for (Ejercicio ej : ejerciciosTriceps) {
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
        ejercicio1.setRepeticiones("20 repeticiones");
        ejercicio1.setSeries(4);
        ejercicios.add(ejercicio1);

        Ejercicio ejercicio2 = new Ejercicio();
        ejercicio2.setModalidad("Pecho");
        ejercicio2.setNombre("Fondos explosivos");
        ejercicio2.setDescripcion("Realiza un fondo en paralelas convencional pero cada vez que termines una repetición hazlo de manera explosiva, consiguiendo que las manos se despeguen de las barras.");
        ejercicio2.setVideo("fondos_explosivos.mp4");
        ejercicio2.setRepeticiones("12 repeticiones");
        ejercicio2.setSeries(4);
        ejercicios.add(ejercicio2);

        Ejercicio ejercicio3 = new Ejercicio();
        ejercicio3.setModalidad("Pecho");
        ejercicio3.setNombre("Flexiones con palmada");
        ejercicio3.setDescripcion("Realiza una flexión de pecho convencional pero cada vez que termines una repetición hazlo de manera explosiva, consiguiendo que las manos se despeguen del piso y aplaudiendo en ese momento.");
        ejercicio3.setVideo("flexiones_palmada.mp4");
        ejercicio3.setRepeticiones("15 repeticiones");
        ejercicio3.setSeries(4);
        ejercicios.add(ejercicio3);

        Ejercicio ejercicio4 = new Ejercicio();
        ejercicio4.setModalidad("Pecho");
        ejercicio4.setNombre("Fondos");
        ejercicio4.setDescripcion("Colócate en las paralelas con los codos bloqueados y realiza una flexión de brazos hasta completar un ángulo de 90°");
        ejercicio4.setVideo("fondos.mp4");
        ejercicio4.setRepeticiones("15 repeticiones");
        ejercicio4.setSeries(4);
        ejercicios.add(ejercicio4);

        Ejercicio ejercicio5 = new Ejercicio();
        ejercicio5.setModalidad("Pecho");
        ejercicio5.setNombre("Flexiones en diamante");
        ejercicio5.setDescripcion("Manos en el suelo, apertura cerrada manos en forma de diamante, espalda recta y realizar el movimiento controlado.");
        ejercicio5.setVideo("flexiones_diamante.mp4");
        ejercicio5.setRepeticiones("15 repeticiones");
        ejercicio5.setSeries(4);
        ejercicios.add(ejercicio5);

        Ejercicio ejercicio6 = new Ejercicio();
        ejercicio6.setModalidad("Pecho");
        ejercicio6.setNombre("Flexiones abiertas");
        ejercicio6.setDescripcion("Manos en el suelo, apertura abierta amplia con respecto a sus hombros, espalda recta y realizar el movimiento controlado");
        ejercicio6.setVideo("flexiones_abiertas.mp4");
        ejercicio6.setRepeticiones("20 repeticiones");
        ejercicio6.setSeries(4);
        ejercicios.add(ejercicio6);

        Ejercicio ejercicio7 = new Ejercicio();
        ejercicio7.setModalidad("Pecho");
        ejercicio7.setNombre("Muscle up");
        ejercicio7.setDescripcion("Colgado de la barra, sube de forma explosiva, de manera que metas la cabeza por encima de la barra y quedes en posición de fondo en barra.");
        ejercicio7.setVideo("muscle_up.mp4");
        ejercicio7.setRepeticiones("3 repeticiones");
        ejercicio7.setSeries(4);
        ejercicios.add(ejercicio7);

        Ejercicio ejercicio8 = new Ejercicio();
        ejercicio8.setModalidad("Pecho");
        ejercicio8.setNombre("Fondos en barra");
        ejercicio8.setDescripcion("Colócate en la parte superior de la barra, con los codos bloqueados y realiza una flexión de brazos hasta completar un ángulo de 90°");
        ejercicio8.setVideo("fondos_barra.mp4");
        ejercicio8.setRepeticiones("10 repeticiones");
        ejercicio8.setSeries(4);
        ejercicios.add(ejercicio8);

        Ejercicio ejercicio9 = new Ejercicio();
        ejercicio9.setModalidad("Pecho");
        ejercicio9.setNombre("Flexiones arqueras");
        ejercicio9.setDescripcion("En posición de flexión de pecho convencional, vas a realizar la flexión de un solo brazo mientras el otro lo bloqueas totalmente hasta tocar el piso con el pecho y así ir alternando cada brazo. ");
        ejercicio9.setVideo("muscle_up.mp4");
        ejercicio9.setRepeticiones("10 repeticiones");
        ejercicio9.setSeries(4);
        ejercicios.add(ejercicio9);

        Ejercicio ejercicio10 = new Ejercicio();
        ejercicio10.setModalidad("Espalda");
        ejercicio10.setNombre("Muscle up");
        ejercicio10.setDescripcion("Colgado de la barra, sube de forma explosiva, de manera que metas la cabeza por encima de la barra y quedes en posición de fondo en barra.");
        ejercicio10.setVideo("muscle_up.mp4");
        ejercicio10.setRepeticiones("3 repeticiones");
        ejercicio10.setSeries(4);
        ejercicios.add(ejercicio10);

        Ejercicio ejercicio11 = new Ejercicio();
        ejercicio11.setModalidad("Espalda");
        ejercicio11.setNombre("Dominadas pronas en L");
        ejercicio11.setDescripcion("En una barra de dominadas, quédate colgando en agarre prono, con las piernas estiradas totalmente paralelas al suelo y flexiona los brazos hasta que la barbilla supere la altura de la barra. ");
        ejercicio11.setVideo("dominadas_l.mp4");
        ejercicio11.setRepeticiones("7 repeticiones");
        ejercicio11.setSeries(4);
        ejercicios.add(ejercicio11);

        Ejercicio ejercicio12 = new Ejercicio();
        ejercicio12.setModalidad("Espalda");
        ejercicio12.setNombre("Dominadas explosivas");
        ejercicio12.setDescripcion("Realiza dominadas con potencia suficiente para que al llegar a la barra tu pecho vaya hacia la misma y las manos se despeguen ligeramente de la misma.");
        ejercicio12.setVideo("dominadas_explosivas.mp4");
        ejercicio12.setRepeticiones("6 repeticiones");
        ejercicio12.setSeries(4);
        ejercicios.add(ejercicio12);

        Ejercicio ejercicio13 = new Ejercicio();
        ejercicio13.setModalidad("Espalda");
        ejercicio13.setNombre("Dominadas pronas");
        ejercicio13.setDescripcion("En una barra de dominadas, quédate colgando en agarre prono y flexiona los brazos hasta que la barbilla supere la altura de la barra.");
        ejercicio13.setVideo("dominadas_pronas.mp4");
        ejercicio13.setRepeticiones("15 repeticiones");
        ejercicio13.setSeries(4);
        ejercicios.add(ejercicio13);

        Ejercicio ejercicio14 = new Ejercicio();
        ejercicio14.setModalidad("Espalda");
        ejercicio14.setNombre("Dominadas asimétricas");
        ejercicio14.setDescripcion("En cada repetición la barbilla va a tocar una de las manos, esto hace que el esfuerzo se centre más en uno de los brazos. ");
        ejercicio14.setVideo("dominadas_asimetricas.mp4");
        ejercicio14.setRepeticiones("7 repeticiones a cada lado");
        ejercicio14.setSeries(4);
        ejercicios.add(ejercicio14);

        Ejercicio ejercicio15 = new Ejercicio();
        ejercicio15.setModalidad("Espalda");
        ejercicio15.setNombre("Dominadas supinas explosivas");
        ejercicio15.setDescripcion("Realiza dominadas en agarre supino con potencia suficiente para que al llegar a la barra tu pecho vaya hacia la misma y las manos se despeguen ligeramente de la misma.");
        ejercicio15.setVideo("dominadas_supinas_explosivas.mp4");
        ejercicio15.setRepeticiones("8 repeticiones");
        ejercicio15.setSeries(4);
        ejercicios.add(ejercicio15);

        Ejercicio ejercicio16 = new Ejercicio();
        ejercicio16.setModalidad("Espalda");
        ejercicio16.setNombre("Dominadas con parada en la mitad");
        ejercicio16.setDescripcion("Realiza una dominada prona convencional, pero al bajar aguanta la posición unos segundos justo cuando tu cabeza esté debajo de la barra, sube de nuevo hasta que la barbilla pase la barra y baja por completo para completar una repetición.");
        ejercicio16.setVideo("dominadas_parada_mitad.mp4");
        ejercicio16.setRepeticiones("4 repeticiones");
        ejercicio16.setSeries(4);
        ejercicios.add(ejercicio16);

        Ejercicio ejercicio17 = new Ejercicio();
        ejercicio17.setModalidad("Piernas");
        ejercicio17.setNombre("Sentadilla");
        ejercicio17.setDescripcion("Colocar las piernas con una apertura un poco mayor que la de los hombros, puntas de los pies ligeramente hacia afuera, flexionar rodillas para bajar hasta los 90º y volver a subir, mantener la espalda recta.");
        ejercicio17.setVideo("sentadilla.mp4");
        ejercicio17.setRepeticiones("50 repeticiones");
        ejercicio17.setSeries(4);
        ejercicios.add(ejercicio17);

        Ejercicio ejercicio18 = new Ejercicio();
        ejercicio18.setModalidad("Piernas");
        ejercicio18.setNombre("Bulgarian Squat");
        ejercicio18.setDescripcion("Con el empeine de un pie apoyado en un banco o barra baja, colocarse en posición de zancada y realizar repeticiones. ");
        ejercicio18.setVideo("bulgarian_squat.mp4");
        ejercicio18.setRepeticiones("30 repeticiones a cada lado");
        ejercicio18.setSeries(4);
        ejercicios.add(ejercicio18);

        Ejercicio ejercicio19 = new Ejercicio();
        ejercicio19.setModalidad("Piernas");
        ejercicio19.setNombre("Puentes femorales");
        ejercicio19.setDescripcion("Colocarse tumbado en el suelo boca arriba, flexionar rodillas y levantar la cadera hasta que la espalda quede alineada con los muslos.");
        ejercicio19.setVideo("puentes_femorales.mp4");
        ejercicio19.setRepeticiones("50 repeticiones");
        ejercicio19.setSeries(4);
        ejercicios.add(ejercicio19);

        Ejercicio ejercicio20 = new Ejercicio();
        ejercicio20.setModalidad("Piernas");
        ejercicio20.setNombre("Sentadilla profunda");
        ejercicio20.setDescripcion("Realizar sentadillas, pero bajando lo máximo posible, superando de largo los 90º, añade trabajo de femorales y glúteos.");
        ejercicio20.setVideo("sentadila_profunda.mp4");
        ejercicio20.setRepeticiones("30 repeticiones");
        ejercicio20.setSeries(4);
        ejercicios.add(ejercicio20);

        Ejercicio ejercicio21 = new Ejercicio();
        ejercicio21.setModalidad("Piernas");
        ejercicio21.setNombre("Elevaciones de gemelos");
        ejercicio21.setDescripcion("Colocarse en el borde de un escalón o barra baja, a la pata coja contraer el gemelo para ponerse de puntillas y luego volver a bajar.");
        ejercicio21.setVideo("elevaciones_gemelos.mp4");
        ejercicio21.setRepeticiones("50 repeticiones por cada pie");
        ejercicio21.setSeries(4);
        ejercicios.add(ejercicio21);

        Ejercicio ejercicio22 = new Ejercicio();
        ejercicio22.setModalidad("Biceps");
        ejercicio22.setNombre("Australian chin ups");
        ejercicio22.setDescripcion("En una barra baja, colócale por debajo para hacer un movimiento de remo con agarre supino, llevando la barra a la frente.");
        ejercicio22.setVideo("autralian_chin_ups.mp4");
        ejercicio22.setRepeticiones("15 repeticiones");
        ejercicio22.setSeries(4);
        ejercicios.add(ejercicio22);

        Ejercicio ejercicio23 = new Ejercicio();
        ejercicio23.setModalidad("Biceps");
        ejercicio23.setNombre("Dominadas supinas");
        ejercicio23.setDescripcion("En una barra de dominadas, quédate colgando en agarre supino y flexiona los brazos hasta que la barbilla supere la altura de la barra.");
        ejercicio23.setVideo("dominadas_supinas.mp4");
        ejercicio23.setRepeticiones("10 repeticiones");
        ejercicio23.setSeries(4);
        ejercicios.add(ejercicio23);

        Ejercicio ejercicio24 = new Ejercicio();
        ejercicio24.setModalidad("Biceps");
        ejercicio24.setNombre("Dominadas para biceps");
        ejercicio24.setDescripcion("En posición de dominada supina, realiza una dominada hasta la mitad con los codos hacia afuera y repite el movimiento.");
        ejercicio24.setVideo("dominadas_biceps.mp4");
        ejercicio24.setRepeticiones("4 repeticiones");
        ejercicio24.setSeries(4);
        ejercicios.add(ejercicio24);

        Ejercicio ejercicio25 = new Ejercicio();
        ejercicio25.setModalidad("Triceps");
        ejercicio25.setNombre("Flexiones enterradoras");
        ejercicio25.setDescripcion("en posición de flexión con las manos a una altura superior que la de sus pies y en una barra baja, realizar una flexión sin abrir sus codos hasta que los codos pasen por debajo de la barra. ");
        ejercicio25.setVideo("flexiones_enterradoras.mp4");
        ejercicio25.setRepeticiones("6 repeticiones");
        ejercicio25.setSeries(4);
        ejercicios.add(ejercicio25);

        Ejercicio ejercicio26 = new Ejercicio();
        ejercicio26.setModalidad("Triceps");
        ejercicio26.setNombre("Extensión de triceps");
        ejercicio26.setDescripcion("en posición de flexiones, flexionar el brazo hasta que el antebrazo toque por completo el piso y volver a subir.");
        ejercicio26.setVideo("extension_triceps.mp4");
        ejercicio26.setRepeticiones("12 repeticiones");
        ejercicio26.setSeries(4);
        ejercicios.add(ejercicio26);

        Ejercicio ejercicio27 = new Ejercicio();
        ejercicio27.setModalidad("Triceps");
        ejercicio27.setNombre("Fondos a codos");
        ejercicio27.setDescripcion("En posicion de fondos, flexionar los brazos y deja que tus antebrazos caigas sobre la barra y ustiliza un movimiento explosivo para volver a subir y terminar el fondo.");
        ejercicio27.setVideo("fondos_codos.mp4");
        ejercicio27.setRepeticiones("6 repeticiones");
        ejercicio27.setSeries(4);
        ejercicios.add(ejercicio27);

        Ejercicio ejercicio28 = new Ejercicio();
        ejercicio28.setModalidad("Hombros");
        ejercicio28.setNombre("Pino");
        ejercicio28.setDescripcion("Haz un impulso a pino y mantén el equilibrio sin mover las manos, ayúdate controlando con los hombros, codos y muñecas. ");
        ejercicio28.setVideo("pino.mp4");
        ejercicio28.setRepeticiones("10 repeticiones");
        ejercicio28.setSeries(3);
        ejercicios.add(ejercicio28);

        Ejercicio ejercicio29 = new Ejercicio();
        ejercicio29.setModalidad("Hombros");
        ejercicio29.setNombre("Flexiones a pino");
        ejercicio29.setDescripcion("Haz pino y realiza flexiones con los brazos, al principio el rango era corto, pero con el tiempo intenta aumentar hasta hacer el rango completo.");
        ejercicio29.setVideo("flexiones_pino.mp4");
        ejercicio29.setRepeticiones("6 repeticiones");
        ejercicio29.setSeries(3);
        ejercicios.add(ejercicio29);

        Ejercicio ejercicio30 = new Ejercicio();
        ejercicio30.setModalidad("Hombros");
        ejercicio30.setNombre("45º push ups");
        ejercicio30.setDescripcion("Desde la posición de pino, sin arquear la espalda, flexiona los brazos y a la vez deja que el cuerpo baje hasta colocarse en un ángulo de 45° con respecto al suelo, para completar el movimiento vuelve a estirar los brazos y a la vez lleva el cuerpo a la vertical.");
        ejercicio30.setVideo("45_push_ups.mp4");
        ejercicio30.setRepeticiones("1 repeticiones");
        ejercicio30.setSeries(3);
        ejercicios.add(ejercicio30);

        Ejercicio ejercicio31 = new Ejercicio();
        ejercicio31.setModalidad("Hombros");
        ejercicio31.setNombre("Flexiones pike");
        ejercicio31.setDescripcion("Acerca las manos y los pies, levantando la cadera y realiza flexiones con la cabeza entre los brazos.");
        ejercicio31.setVideo("flexiones_pike.mp4");
        ejercicio31.setRepeticiones("10 repeticiones");
        ejercicio31.setSeries(4);
        ejercicios.add(ejercicio31);

        Ejercicio ejercicio32 = new Ejercicio();
        ejercicio32.setModalidad("Hombros");
        ejercicio32.setNombre("Tucked planche Advance");
        ejercicio32.setDescripcion("Colócate en posición de tucked planche y abre un poco las rodillas hasta que sobrepasen los brazos y mantén la posición por el tiempo determinado e intentando no tocar el suelo con los pies.");
        ejercicio32.setVideo("tucked_advance.mp4");
        ejercicio32.setRepeticiones("6 segundos");
        ejercicio32.setSeries(4);
        ejercicios.add(ejercicio32);

        Ejercicio ejercicio33 = new Ejercicio();
        ejercicio33.setModalidad("Hombros");
        ejercicio33.setNombre("Fondos inclinados");
        ejercicio33.setDescripcion("En posición de fondos convencionales, genera una inclinación de 45° con el cuerpo y realiza la flexión.");
        ejercicio33.setVideo("fondos_inclinados.mp4");
        ejercicio33.setRepeticiones("6 repeticiones");
        ejercicio33.setSeries(4);
        ejercicios.add(ejercicio33);

        Ejercicio ejercicio34 = new Ejercicio();
        ejercicio34.setModalidad("Core");
        ejercicio34.setNombre("Dragon flag");
        ejercicio34.setDescripcion("En una barra cercana al suelo, boca arriba con la cabeza cerca de la misma, utiliza un agarre supino y quédate en un ángulo de 45°, con ambas piernas estiradas y apoyando en el suelo solo la parte alta de la espalda.");
        ejercicio34.setVideo("dragon_flag.mp4");
        ejercicio34.setRepeticiones("15 segundos");
        ejercicio34.setSeries(4);
        ejercicios.add(ejercicio34);

        Ejercicio ejercicio35 = new Ejercicio();
        ejercicio35.setModalidad("Core");
        ejercicio35.setNombre("Shoes to bar");
        ejercicio35.setDescripcion("Colócate colgado en la barra y levanta las piernas rectas hasta que tus pies toquen la barra, evita usar balanceo o inercia.");
        ejercicio35.setVideo("shoes_to_bar.mp4");
        ejercicio35.setRepeticiones("6 repeticiones");
        ejercicio35.setSeries(4);
        ejercicios.add(ejercicio35);

        Ejercicio ejercicio36 = new Ejercicio();
        ejercicio36.setModalidad("Core");
        ejercicio36.setNombre("Mountain Climbers");
        ejercicio36.setDescripcion("Desde la posición de flexiones, adelanta un pie cada vez, como si estuvieras intentando correr, intenta mantener la cadera en una posición fija, ");
        ejercicio36.setVideo("mountain_climbers.mp4");
        ejercicio36.setRepeticiones("12 repeticiones");
        ejercicio36.setSeries(4);
        ejercicios.add(ejercicio36);

        Ejercicio ejercicio37 = new Ejercicio();
        ejercicio37.setModalidad("Core");
        ejercicio37.setNombre("Rusian Twist");
        ejercicio37.setDescripcion("Colócate boca arriba en el suelo, apoyando solamente en la parte superior de los glúteos y con las rodillas flexionadas, une las manos frente a tu pecho en posición de rezo y gira el torso de un lado a otro.");
        ejercicio37.setVideo("rusian_twist.mp4");
        ejercicio37.setRepeticiones("20 repeticiones");
        ejercicio37.setSeries(4);
        ejercicios.add(ejercicio37);

        Ejercicio ejercicio38 = new Ejercicio();
        ejercicio38.setModalidad("Core");
        ejercicio38.setNombre("Plancha abdominal");
        ejercicio38.setDescripcion("Colócate en el suelo apoyando las puntas de los pies y todo el antebrazo, mantén esa posición por un tiempo determinado, mantén la espalda recta con respecto a las piernas y el cuello en posición neutra.");
        ejercicio38.setVideo("plancha_abdominal.mp4");
        ejercicio38.setRepeticiones("20 segundos");
        ejercicio38.setSeries(4);
        ejercicios.add(ejercicio38);
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

