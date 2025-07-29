package atividade12;

public class Cavalo extends Mamifero implements AnimalDomesticado {
	public void alimentar() {
		System.out.println("O cavalo comeu milho.");
	}
	
	public String amamentar() {
		return "A mãe amamentou o pequeno cavalo.";
	}

	public void levarVeterinario() {
		System.out.println("O cavalo foi ao veterinário");
	}
	
	public void chamarVeterinario() {
		System.out.println("O dono do cavalo ligou para o veterinário.");
	}
	public String emitirSom() {
		return this.nome + " relinchou.";
	}
	
	public Cavalo(String nome) {
		this.nome = nome;
	}
}
