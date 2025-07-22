package Atividade10.com.poo.atividade10;

public class Disco extends Entrada {
	private int duracao;
	private String tipo; // vinil, blu-ray, cd, dvd, etc.

	public int
	getDuracao()
	{
		return duracao;
	}

	public String
	getTipo()
	{
		return tipo;
	}

	public void
	setDuracao(int duracao)
	{
		this.duracao = duracao;
	}

	public void
	setTipo(String tipo)
	{
		this.tipo = tipo;
	}

	public void
	superSub()
	{
		System.out.println(
			"Super:\n\tid: " + getId() + "\n\tnome: " + getNome() +
			"\n\tautor: " + getAutor() +
			"\nSub:\n\tduracao: " + duracao + "\n\ttipo: " + tipo);
	}

	Disco(int id, String nome, String autor, int duracao, String tipo)
	{
		super(id, nome, autor);
		this.duracao = duracao;
		this.tipo = tipo;
	}
}
