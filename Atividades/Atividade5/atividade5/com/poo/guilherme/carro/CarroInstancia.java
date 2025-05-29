package com.poo.guilherme.carro;

public class CarroInstancia {
	public static void main(String args[]) {
		Carro civic = new Carro();
		Carro kwid = new Carro();
		Carro onix = new Carro();

		civic.marcaModeloAno = "Honda Civic 2015";
		kwid.marcaModeloAno = "Renault Kwid 2018";
		onix.marcaModeloAno = "Chevrolet Onix 2020";

		System.out.println("V " + civic.marcaModeloAno + ": " + civic.acelerar());
		System.out.println("V " + civic.marcaModeloAno + ": " + civic.frear());
	}
}