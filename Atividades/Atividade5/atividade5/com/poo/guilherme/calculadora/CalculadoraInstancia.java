package com.poo.guilherme.calculadora;

public class CalculadoraInstancia {
	public static void main(String args[]) {
		Calculadora hp = new Calculadora();
		Calculadora ti = new Calculadora();
		Calculadora casio = new Calculadora();

		hp.modelo = "HP 50G";
		ti.modelo = "TI 89";
		casio.modelo = "Casio fx-991CW";

		System.out.println(hp.modelo + ": " + hp.somar(2, 2));
	}
}