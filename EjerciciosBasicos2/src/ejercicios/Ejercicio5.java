package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Variables para almacenar las notas de los tres trimestres
		int notasPrimerT, notasSegundoT, notasTercerT;
		double notaMedia;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la nota del Primer Trimestre");
		notasPrimerT = sc.nextInt();

		System.out.println("Introduzca la nota del Segundo Trimestre");
		notasSegundoT = sc.nextInt();

		System.out.println("Introduzca la nota del Tercer Trimestre");
		notasTercerT = sc.nextInt();

		notaMedia = (double) (notasPrimerT + notasSegundoT + notasTercerT) / 3;

		System.out.println("La nota del boletín es: " + (int) notaMedia);
		System.out.printf("La nota del expediente es: %.2f", notaMedia);
		// cerramos Scanner
		sc.close();
	}

}
