package Atividade10.com.poo.atividade10;

public class Livro extends Entrada {
	private int numeroDePaginas;
	private Boolean capaDura;

	public int
	getPaginas()
	{
		return this.numeroDePaginas;
	}

	public Boolean
	getCapa()
	{
		return this.capaDura;
	}

	public void
	setPaginas(int paginas)
	{
		this.numeroDePaginas = paginas;
	}

	public void
	setCapa(Boolean capa)
	{
		this.capaDura = capa;
	}

	public void
	superSub()
	{
		System.out.println("Super:\n\tid: " + getId() + "\n\tnome: " +
				   getNome() + "\n\tautor: " + getAutor() +
				   "\nSub:\n\tpaginas: " + numeroDePaginas +
				   "\n\tcapaDura: " + capaDura);
	}

	public Livro(int id, String nome, String autor, int pag, Boolean capa)
	{
		super(id, nome, autor);
		this.numeroDePaginas = pag;
		this.capaDura = capa;
	}
}