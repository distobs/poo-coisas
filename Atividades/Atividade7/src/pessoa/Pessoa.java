package pessoa;

public class Pessoa {
	String nome;
	double salario = 1500;
	int idade = 28;
	
	Pessoa (String nome) {
		this.nome = nome;
	}
	
	Pessoa (String nome, double sal) {
		this.nome = nome;
		this.salario = sal;
	}
	
	Pessoa(String nome, double sal, int idade) {
		this.nome = nome;
		this.salario = sal;
	}
}
