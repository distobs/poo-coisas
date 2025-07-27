package Atividade11.com.poo.atividade11;

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

	@Override
	public void
	superSub()
	{
		super.superSub();
		System.out.println("\nSub:\n\tpaginas: " + numeroDePaginas
				+ "\n\tcapaDura: " + capaDura);
	}

	public void
	virarPagina()
	{
		System.out.println("Você virou 1 página.");
	}

	public void
	virarPagina(int nPags)
	{
		System.out.println("Você virou" + nPags +
				((nPags > 1) ? (" páginas.") : (" página.")));
	}

	public void
	sublinhar()
	{
		System.out.println("Você sublinhou 1 frase.");
	}

	public void
	sublinhar(int nLin)
	{
		System.out.println("Você sublinhou " + nLin +
				((nLin > 1) ? (" frases.") : (" frase.")));
	}

	public void
	alugar()
	{
		System.out.println("Este livro foi emprestado pelo período padrão: 15 dias.");
	}

	public void
	alugar(int nDias)
	{
		System.out.println("Este livro foi emprestado por " + nDias
				+ " dias.");
	}

	public Livro(int id, String nome, String autor, int pag, Boolean capa)
	{
		super(id, nome, autor);
		this.numeroDePaginas = pag;
		this.capaDura = capa;
	}
}
