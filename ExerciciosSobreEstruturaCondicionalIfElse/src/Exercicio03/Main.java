package Exercicio03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("\nDigite dois valores inteiros para A e B");
		System.out.print("Digite o primeiro valor inteiro para A: ");
		int A = scanner.nextInt();

		System.out.print("Digite o segundo valor inteiro para B: ");
		int B = scanner.nextInt();

		if ((A % B) == 0) {
			System.out.println("S�o m�ltiplos");

		} else if ((B % A) == 0) {
			System.out.println("S�o m�ltiplos");

		} else {
			System.out.println("N�o s�o m�ltiplos");
		}

		scanner.close();
	}

}
