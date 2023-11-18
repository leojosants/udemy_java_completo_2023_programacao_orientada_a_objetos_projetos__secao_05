package Exercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("\nDigite um número inteiro: ");
		int number = scanner.nextInt();

		if ((number % 2) == 0) {
			System.out.println("PAR");

		} else {
			System.out.println("IMPAR");
		}

		scanner.close();
	}

}
