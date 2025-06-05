package com.poo.guilherme.atividade6;

public class Main {
	public static void main(String args[]) {
		Produto arroz = new Produto("arroz", 10);
		Produto feijao = new Produto("feijao", 8);
		Pedido cliente1 = new Pedido(arroz, 5);
		Pedido cliente2 = new Pedido(feijao, 2);
		
		System.out.println("Cliente 1 pediu " + cliente1.quantidade + " " +
				cliente1.produto.nome + " (R$" + cliente1.valor() + ")");
		
		System.out.println("Cliente 2 pediu " + cliente2.quantidade + " " +
				cliente2.produto.nome + " (R$" + cliente2.valor() + ")");
	}
}
