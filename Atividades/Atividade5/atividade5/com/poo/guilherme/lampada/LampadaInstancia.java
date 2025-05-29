package com.poo.guilherme.lampada;

public class LampadaInstancia {
	public static void main(String args[]) {
		Lampada l1 = new Lampada();
		Lampada l2 = new Lampada();
		Lampada l3 = new Lampada();

		l1.ligarDesligar();
		l2.ligarDesligar();
		l3.ligarDesligar();
	}
}
