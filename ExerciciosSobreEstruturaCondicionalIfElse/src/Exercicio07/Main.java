package Exercicio07;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);

		System.out.println("\nInforme dois valores com uma casa decimal [utilize ponto como separador]");

		System.out.print("\nDigite um valor para x: ");
		double x = scanner.nextDouble();

		System.out.print("Digite um valor para y: ");
		double y = scanner.nextDouble();

		String result = "";

		if ((x == 0) && (y == 0)) {
			result = "Origem";

		} else if ((x > 0) && (y > 0)) {
			result = "Q1";

		} else if ((x < 0) && (y > 0)) {
			result = "Q2";

		} else if ((x < 0) && (y < 0)) {
			result = "Q3";

		} else if ((x > 0) && (y < 0)) {
			result = "Q4";

		} else if (((x > 0) || (x < 0) && (y == 0))) {
			result = "Eixo X";

		} else if (((y > 0) || (y < 0) && (x == 0))) {
			result = "Eixo Y";
		}

		System.out.printf("Resultado: %s", result);

		scanner.close();
	}

}
