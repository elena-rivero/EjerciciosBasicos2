package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		final double PRECIO_PERAS = 1.95;
		final double PRECIO_MANZANAS = 2.35;
		
		double kgPeras;
		double kgManzanas;
		double resultado;
		
		Scanner leerKilos = new Scanner(System.in);
		
		System.out.print("Introduzca el número de kilos de peras vendidos: ");
		
		kgPeras = leerKilos.nextDouble();
		
		System.out.print("Introduzca el número de kilos de manzanas vendidos: ");
		
		kgManzanas = leerKilos.nextDouble(); 

		resultado = kgPeras*PRECIO_PERAS + kgManzanas*PRECIO_MANZANAS;
	}

}
