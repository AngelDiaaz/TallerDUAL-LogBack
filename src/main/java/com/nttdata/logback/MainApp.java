package com.nttdata.logback;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Clase MainApp que ejecuta el programa
 * 
 * @author adiaz
 */

public class MainApp {
	/** LOGGER */
	private static final Logger LOG = LoggerFactory.getLogger(MainApp.class);

	/**
	 * Método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		LOG.info("Inicio del método");

		//Listo las personas del ArrayList
		for (Persona persona : agregarPersonas()) {
			LOG.debug(persona.toString());
		}

		LOG.info("Fin del método");
	}

	/**
	 * Método que agrega personas y los almacena en un ArrayList, devolviendo luego
	 * el ArrayList
	 * 
	 * @return ArrayList con las personas agregadas
	 */

	private static ArrayList<Persona> agregarPersonas() {
		var personas = new ArrayList<Persona>();

		LOG.info("Insertar personas en un ArrayList");

		personas.add(new Persona(1, "Pepe", "Gomez", "11111111A"));
		personas.add(new Persona(2, "Juan", "Rodriguez", "21111111B"));
		personas.add(new Persona(3, "Ramon", "Iglesias", "31111111C"));
		personas.add(new Persona(4, "Maria", "Millan", "41111111P"));
		personas.add(new Persona(5, "Javi", "Acuña", "51111111S"));
		personas.add(new Persona(6, "Pepe", "Ramirez", "61111111V"));
		personas.add(new Persona(7, "Blanca", "Diaz", "71111111Ñ"));
		personas.add(new Persona(8, "Pablo", "Arconada", "81111111L"));
		personas.add(new Persona(9, "Elena", "Moreno", "91111111A"));
		personas.add(new Persona(10, "Laura", "Fiscal", "22111111W"));
		personas.add(new Persona(11, "Contreras", "Perez", "33111111T"));
		personas.add(new Persona(12, "Isabel", "Rajoy", "44111111V"));
		personas.add(new Persona(13, "Paco", "Santos", "11111111A"));
		personas.add(new Persona(14, "Juan", "Ramirez", "21111111B"));
		personas.add(new Persona(15, "Ana", "Macias", "31111111C"));
		personas.add(new Persona(16, "Corbacho", "Ponce", "41111111P"));
		personas.add(new Persona(17, "Iñigo", "Sanchez", "51111111S"));
		personas.add(new Persona(18, "Walter", "Calles", "61111111V"));
		personas.add(new Persona(19, "Pablo", "Sanchez", "71111111Ñ"));
		personas.add(new Persona(20, "Roberto", "Amador", "81111111L"));

		// Realizo el bucle para que en el log se tenga que comprimir y separar a las
		// 50KB
		for (int i = 21; i < 600; i++) {
			personas.add(new Persona(i, "", "", ""));
		}
		return personas;
	}
}
