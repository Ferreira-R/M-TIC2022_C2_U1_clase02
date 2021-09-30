package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {

		Scanner dayInput = new Scanner(System.in);
		System.out.println("Ingresa tu día de nacimiento");
		var day = dayInput.nextInt();
		Scanner monthInput = new Scanner(System.in);
		System.out.println("Ingresa tu mes de nacimiento");
		var month = monthInput.nextInt();
		Scanner yearInput = new Scanner(System.in);
		System.out.println("Ingresa tu año de nacimiento");
		var year = yearInput.nextInt();

		var NSuerte = calcularNSuerte(day, month, year);
		dayInput.close();
		monthInput.close();
		yearInput.close();

		System.out.println("Número de la suerte: " + NSuerte);
	}

	public static int calcularNSuerte(int dia, int mes, int año) {
		Integer sumaDMY = dia + mes + año;
		String sumaDMYStr = Integer.toString(sumaDMY);
		int[] sumaDMYMtx = new int[sumaDMYStr.length()];
		int luckyN = 0;
		for (int i = 0; i < sumaDMYStr.length(); i++) {
			sumaDMYMtx[i] = Character.getNumericValue(sumaDMYStr.charAt(i));
			luckyN = luckyN + sumaDMYMtx[i];
		}
		return luckyN;
	}
}
