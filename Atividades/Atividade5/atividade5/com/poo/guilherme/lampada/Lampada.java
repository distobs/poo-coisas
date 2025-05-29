package com.poo.guilherme.lampada;

class Lampada {
	Boolean ligado = false;
	int temperatura = 6000;
	String cor = "branco";

	Boolean ligarDesligar() {
		ligado = !ligado;
		return ligado;
	}

	int alterarTemperatura(int temp) {
		if (temp < 1000 || temp > 10000) {
			System.out.println("Pode não.");
		} else {
			temperatura = temp;
		}

		return temperatura;
	}

	String alterarCor(String c) {
		cor = c;

		return cor;
	}
}