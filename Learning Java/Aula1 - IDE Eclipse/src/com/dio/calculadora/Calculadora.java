package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			double a, b;

			System.out.println("Primeiro valor: ");
			a = scan.nextDouble();
			System.out.println("Segundo valor: ");
			b = scan.nextDouble();

			double soma = soma(a, b);
			double subtracao = subtracao(a, b);
			double multiplicacao = multiplicacao(a, b);
			double divisao = divisao(a, b);

			System.out.println("soma: " + soma);
			System.out.println("sub: " + subtracao);
			System.out.println("mult: " + multiplicacao);
			System.out.println("div: " + divisao);
		}
	}

	public static double soma(double a, double b) {
		return a + b;
	}

	public static double subtracao(double a, double b) {
		return a - b;
	}

	public static double divisao(double a, double b) {
		return a / b;
	}

	public static double multiplicacao(double a, double b) {
		return a * b;
	}

}
