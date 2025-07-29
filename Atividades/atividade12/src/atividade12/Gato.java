package atividade12;

public class Gato extends Mamifero implements AnimalDomesticado, AnimalEstimacao {
	public String raca;

	public void alimentar() {
		System.out.println("O gato comeu peixe.");
	}
	
	public String amamentar() {
		return "A mãe amamentou o pequeno gato.";
	}

	public void levarVeterinario() {
		System.out.println("O gato foi ao veterinário");
	}
	
	public void chamarVeterinario() {
		System.out.println("O dono do gato ligou para o veterinário.");
	}

	public String emitirSom() {
		return this.nome + " ronronou.";
	}

	public Gato(String nome, String raca) {
		this.nome = nome;
		this.raca = raca;
	}

	public void brincar() {
		System.out.println("O gato brincou com o novelo de lã.");
		
	}

	public void levarPassear() {
		System.out.println("O dono do gato o levou para o parque.");
		
	}
}
