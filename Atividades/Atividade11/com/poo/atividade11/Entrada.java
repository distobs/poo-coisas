package Atividade11.com.poo.atividade11;

// Entrada de uma biblioteca de livros e discos (CDs, vinis, blu-rays)
public class Entrada {
	private int id;
	private String nome;
	private String autor;

	public int
	getId()
	{
		return this.id;
	}

	public String
	getNome()
	{
		return this.nome;
	}

	public String
	getAutor()
	{
		return this.autor;
	}

	public void
	setId(int id)
	{
		this.id = id;
	}

	public void
	setNome(String nome)
	{
		this.nome = nome;
	}

	public void
	getAutor(String autor)
	{
		this.autor = autor;
	}

	public void
	superSub()
	{
		System.out.println("Super:\n\tid: " + getId() + "\n\tnome: " + getNome() + "\n\tautor: " + getAutor());
	}

	public Entrada(int id, String nome, String autor)
	{
		this.id = id;
		this.nome = nome;
		this.autor = autor;
	}
}
