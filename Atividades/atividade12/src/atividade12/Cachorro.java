package atividade12;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao {
	public String tamanho;
	public String raca;

	public void alimentar() {
		System.out.println("O cachorro comeu ração.");
	}
	
	public String amamentar() {
		return "A mãe amamentou o pequeno cachorro.";
	}

	public void levarVeterinario() {
		System.out.println("O cachorro foi ao veterinário");
	}
	
	public void chamarVeterinario() {
		System.out.println("O dono do cachorro ligou para o veterinário.");
	}

	public String emitirSom() {
		return this.nome + " latiu.";
	}

	public Cachorro(String nome, String raca, String tamanho) {
		this.nome = nome;
		this.tamanho = tamanho;
		this.raca = raca;
	}

	public void brincar() {
		System.out.println("O cachorro brincou com o osso de brinquedo.");
		
	}

	public void levarPassear() {
		System.out.println("O dono do cachorro o levou para o parque.");
		
	}
}
