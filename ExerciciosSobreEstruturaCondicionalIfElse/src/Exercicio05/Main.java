package Exercicio05;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);

		System.out.print("\nDigite o código do produto: ");
		int code = scanner.nextInt();

		System.out.print("Digite a quantidade: ");
		int quantity = scanner.nextInt();

		double amountToPay = 0.0;

		if (code == 1) {
			amountToPay = quantity * 4.00;

		} else if (code == 2) {
			amountToPay = quantity * 4.50;

		} else if (code == 3) {
			amountToPay = quantity * 5.00;

		} else if (code == 4) {
			amountToPay = quantity * 2.00;

		} else if (code == 5) {
			amountToPay = quantity * 1.50;
		}

		System.out.printf("Total: R$ %.2f%n", amountToPay);

		scanner.close();
	}

}
