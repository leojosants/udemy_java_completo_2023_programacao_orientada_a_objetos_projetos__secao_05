package Exercicio04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a hora inicial: ");
		int startTime = scanner.nextInt();

		System.out.print("Digite a hora final: ");
		int endTime = scanner.nextInt();

		int duration;

		if (startTime < endTime) {
			duration = endTime - startTime;

		} else {
			duration = 24 - startTime + endTime;
		}

		System.out.printf("O JOGO DUROU %d HORA(S)", duration);

		scanner.close();

	}

}
