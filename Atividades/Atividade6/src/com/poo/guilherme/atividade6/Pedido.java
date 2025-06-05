package com.poo.guilherme.atividade6;

public class Pedido {
	Produto produto;
	int quantidade;
	
	double valor() {
		return produto.preco * quantidade;
	}
	
	Pedido(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}
}
