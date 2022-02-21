package com.springboot.app.logic.rutrinaFactory.examen;

import java.util.ArrayList;

import com.springboot.app.logic.rutrinaFactory.RutinaEspecifica;
import com.springboot.app.models.entity.Ejercicio;


public class ExamenNivel8 implements RutinaEspecifica {

	private ArrayList<Ejercicio> rutina;

	public ExamenNivel8() {
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
		ejercicio.setDescripcion(
				"Manos en el suelo, apertura un poco más amplia que los hombros, espalda recta y realizar el movimiento controlado");
		ejercicio.setVideo("flexiones.mp4");
		ejercicio.setRepeticiones("40");
		ejercicio.setSeries(4);
		rutina.add(ejercicio);

		Ejercicio ejercicio1 = new Ejercicio();
		ejercicio1.setModalidad("Pecho");
		ejercicio1.setNombre("Muscle up");
		ejercicio1.setDescripcion(
				"Colgado de la barra, sube de forma explosiva, de manera que metas la cabeza por encima de la barra y quedes en posición de fondo en barra.");
		ejercicio1.setVideo("muscle_up.mp4");
		ejercicio1.setRepeticiones("8");
		ejercicio1.setSeries(4);
		rutina.add(ejercicio1);

		Ejercicio ejercicio2 = new Ejercicio();
		ejercicio2.setModalidad("Espalda");
		ejercicio2.setNombre("Dominadas pronas");
		ejercicio2.setDescripcion(
				"En una barra de dominadas, quédate colgando en agarre prono y flexiona los brazos hasta que la barbilla supere la altura de la barra.");
		ejercicio2.setVideo("dominadas_pronas.mp4");
		ejercicio2.setRepeticiones("20");
		ejercicio2.setSeries(4);
		rutina.add(ejercicio2);

		Ejercicio ejercicio3 = new Ejercicio();
		ejercicio3.setModalidad("Espalda");
		ejercicio3.setNombre("Dominadas supinas explosivas");
		ejercicio3.setDescripcion(
				"Realiza dominadas en agarre supino con potencia suficiente para que al llegar a la barra tu pecho vaya hacia la misma y las manos se despeguen ligeramente de la misma.");
		ejercicio3.setVideo("dominadas_supinas_explosivas.mp4");
		ejercicio3.setRepeticiones("8");
		ejercicio3.setSeries(4);
		rutina.add(ejercicio3);

		Ejercicio ejercicio4 = new Ejercicio();
		ejercicio4.setModalidad("Pierna");
		ejercicio4.setNombre("Sentadilla");
		ejercicio4.setDescripcion(
				"Colocar las piernas con una apertura un poco mayor que la de los hombros, puntas de los pies ligeramente hacia afuera, flexionar rodillas para bajar hasta los 90º y volver a subir, mantener la espalda recta.");
		ejercicio4.setVideo("sentadilla.mp4");
		ejercicio4.setRepeticiones("60");
		ejercicio4.setSeries(4);
		rutina.add(ejercicio4);

		Ejercicio ejercicio5 = new Ejercicio();
		ejercicio5.setModalidad("Biceps");
		ejercicio5.setNombre("Dominadas para biceps");
		ejercicio5.setDescripcion(
				"En posición de dominada supina, realiza una dominada hasta la mitad con los codos hacia afuera y repite el movimiento.");
		ejercicio5.setVideo("dominadas_biceps.mp4");
		ejercicio5.setRepeticiones("8");
		ejercicio5.setSeries(4);
		rutina.add(ejercicio5);

		Ejercicio ejercicio6 = new Ejercicio();
		ejercicio6.setModalidad("Triceps");
		ejercicio6.setNombre("Fondos a codos");
		ejercicio6.setDescripcion(
				"En posicion de fondos, flexionar los brazos y deja que tus antebrazos caigas sobre la barra y ustiliza un movimiento explosivo para volver a subir y terminar el fondo.");
		ejercicio6.setVideo("fondos_codos.mp4");
		ejercicio6.setRepeticiones("10");
		ejercicio6.setSeries(4);
		rutina.add(ejercicio6);

		Ejercicio ejercicio7 = new Ejercicio();
		ejercicio7.setModalidad("Hombro");
		ejercicio7.setNombre("Tucked planche Advance");
		ejercicio7.setDescripcion(
				"Colocate en posicion de tucked planche y abre un poco las rodillas hasta que sobrepasen los brazos y manten la posicion por el tiempo determinado e intentando no tocar el suelo con los pies.");
		ejercicio7.setVideo("tucked_advance.mp4");
		ejercicio7.setRepeticiones("12 seg");
		ejercicio7.setSeries(4);
		rutina.add(ejercicio7);

		Ejercicio ejercicio8 = new Ejercicio();
		ejercicio8.setModalidad("Hombro");
		ejercicio8.setNombre("Flexiones a pino");
		ejercicio8.setDescripcion(
				"Haz pino y realiza flexiones con los brazos, al principio el rango era corto, pero con el tiepo intenta aumentar hasta hacer el rango completo.");
		ejercicio8.setVideo("flexiones_pino.mp4");
		ejercicio8.setRepeticiones("8");
		ejercicio8.setSeries(4);
		rutina.add(ejercicio8);

		Ejercicio ejercicio9 = new Ejercicio();
		ejercicio9.setModalidad("Core");
		ejercicio9.setNombre("Shoes to bar");
		ejercicio9.setDescripcion(
				"Colócate colgado en la barra y levanta las piernas rectas hasta que tus pies toquen la barra, evita usar balanceo o inercia.");
		ejercicio9.setVideo("shoes_to_bar.mp4");
		ejercicio9.setRepeticiones("12");
		ejercicio9.setSeries(4);
		rutina.add(ejercicio9);

		Ejercicio ejercicio10 = new Ejercicio();
		ejercicio10.setModalidad("Core");
		ejercicio10.setNombre("Dragon flag");
		ejercicio10.setDescripcion(
				"En una barra cercana al suelo, boca arriba con la cabeza cerca de la misma, utiliza un agarre supino y quedate en un angulo de 45°, con ambas piernas estiradas y apoyando en el suelo solo la parte alta de la espalda.");
		ejercicio10.setVideo("dragon_flag.mp4");
		ejercicio10.setRepeticiones("25 seg");
		ejercicio10.setSeries(4);
		rutina.add(ejercicio10);
	}

}
