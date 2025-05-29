package com.poo.guilherme.calculadora;

public class Calculadora {
	String modelo;
	int res = 0;
	int mem;

	int somar(int a, int b) {
		mem = res;
		res = a + b;
		return res;
	}

	int multiplicar(int a, int b) {
		mem = res;
		res = a * b;
		return res;
	}

	int resto(int a, int b) {
		mem = res;
		res = a % b;
		return res;
	}
}
