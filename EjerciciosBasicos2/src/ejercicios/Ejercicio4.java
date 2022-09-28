package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Declaración de variables
		boolean estaLloviendo; // Nos dirá si está lloviendo
		boolean finTareas; // Nos dirá si hemos terminado las tareas
		boolean irABiblioteca; // Nos dirá si tenemos que ir a la biblioteca
		boolean puedoSalir;

		Scanner sc = new Scanner(System.in);

		// Preguntamos si está lloviendo
		System.out.println("¿Está lloviendo?");
		estaLloviendo = sc.nextBoolean(); // Recogemos con true o false si está lloviendo

		// Preguntamos si he terminado las tareas
		System.out.println("¿He terminado las tareas?");
		finTareas = sc.nextBoolean(); // Recogemos con true o false si hemos terminado las tareas

		// Preguntamos si tenemos que ir a la biblioteca
		System.out.println("¿Tengo que ir a la biblioteca?"); 
		irABiblioteca = sc.nextBoolean();// Recogemos con true o false si tenemos que ir a la biblioteca

		// Si no está lloviendo Y he terminado las tareas O tengo que ir a la biblioteca, entonces puedo salir
		puedoSalir = (!estaLloviendo && finTareas) || irABiblioteca;
		
		// Indico si puedo salir o no atendiendo al valor de puedoSalir
		System.out.println("¿Puedo salir? " + (puedoSalir ? "Sí" : "No"));

		sc.close();
	}

}
