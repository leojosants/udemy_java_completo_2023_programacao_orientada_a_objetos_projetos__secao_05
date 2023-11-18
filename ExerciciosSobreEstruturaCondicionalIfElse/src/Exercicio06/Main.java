package Exercicio06;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);

		System.out.print(
				"\nDigite um valor e verifique em qual intervalo se encontra [0,25] - [25,50] - [50,75] - [75,100]");

		System.out.print("\nDigite um valor [utilize ponto como separador]: ");
		double value = scanner.nextDouble();

		String interval = "";

		if ((value >= 0) && (value <= 25)) {
			interval = "Intervalo [0, 25]";

		} else if ((value >= 25) && (value <= 50)) {
			interval = "Intervalo [25, 50]";

		} else if ((value >= 50) && (value <= 75)) {
			interval = "Intervalo [50, 75]";

		} else if ((value >= 75) && (value <= 100)) {
			interval = "Intervalo [75, 100]";

		} else {
			interval = "Fora de intervalo";
		}

		System.out.printf("Resultado: %s", interval);

		scanner.close();
	}

}
