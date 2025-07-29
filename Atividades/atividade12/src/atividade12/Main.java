package atividade12;

public class Main {

	public static void main(String[] args) {
		Papagaio louro = new Papagaio("Louro");
		Cavalo pePano = new Cavalo("Pé de Pano");
		Gato tom = new Gato("Thomas", "vira-lata");
		Cachorro brutus = new Cachorro("Brutus", "buldogue inglês", "médio");
		
		System.out.println(pePano.emitirSom());
		System.out.println(louro.emitirSom());
		pePano.alimentar();
		tom.levarVeterinario();
		System.out.println(brutus.emitirSom());
	}

}
