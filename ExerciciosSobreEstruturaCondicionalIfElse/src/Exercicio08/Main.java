package Exercicio08;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("\nInforme o salário: R$ ");
		double salary = scanner.nextDouble();

		double tax;

		if (salary <= 2000.0) {
			tax = 0.0;

		} else if (salary <= 3000.0) {
			tax = (salary - 2000.0) * 0.08;

		} else if (salary <= 4500.0) {
			tax = (salary - 3000.0) * 0.18 + 1000.0 * 0.08;

		} else {
			tax = (salary - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (tax == 0.0) {
			System.out.println("Isento");

		} else {
			System.out.printf("R$ %.2f%n", tax);
		}

		scanner.close();
	}

}
