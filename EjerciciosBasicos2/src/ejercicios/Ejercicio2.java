package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// En edad guardaré la edad introducida por el usuario
		int edad;

		// En mayorEdad guardaré si es mayor de edad o no
		boolean mayorEdad;

		// Creo el Scanner para lectura de datos por teclado
		Scanner sc = new Scanner(System.in);

		// Le solicito al usuario su edad
		System.out.println("Introduzca su edad: ");
		edad = sc.nextInt(); // Leo la edad del teclado

		// Compruebo si la edad es mayor o igual a 18 para decir que es mayor de edad
		mayorEdad = edad >= 18;
		System.out.println("Usted es mayor edad: " + mayorEdad);

		// Cierro el Scanner
		sc.close();

	}

}
