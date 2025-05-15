/* Escreva um programa que pergunte ao usuário quantas notas deseja digitar.
 * Receba o valor das notas, armazene em um Array.
 * Depois faça a média das notas e mostre na tela o resultado. */

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Quantas notas?");

		int n = s.nextInt();

		double[] notas = new double[n];

		double media = 0;

		for (int i = 0; i < n; ++i) {
			notas[i] = s.nextDouble();
		}

		for (int i = 0; i < n; ++i) {
			media += notas[i];
		}

        	media /= n;

		System.out.println("A média final foi: " + media);
	}
}
