package atividade12;

public class Papagaio extends Ave {
	public String voar() {
		return "O papagaio voou.";
	}
	
	public String emitirSom() {
		return "'Louro! Louro', disse o papagaio.";
	}
	
	public Papagaio(String nome) {
		this.nome = nome;
	}
}
