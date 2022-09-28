package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Variable entera donde se guardará el número introducido por el usuario
		int numero;
		String res;
		
		// Creo el scanner para la lectura por teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pido al usuario un número
		System.out.println("Introduzca un número: ");
		// Leemos el número por teclado
		numero = sc.nextInt();
		
		res = (numero%2==0) ? "es par" : "es impar";
		System.out.println("El número " + res);
		sc.close();

	}

}
