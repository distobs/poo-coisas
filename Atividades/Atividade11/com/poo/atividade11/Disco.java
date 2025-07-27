package Atividade11.com.poo.atividade11;

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

	@Override
	public void
	superSub()
	{
		super.superSub();
		System.out.println( "\nSub:\n\tduracao: " + duracao
				+ "\n\ttipo: " + tipo);
	}

	public void
	tocar()
	{
		System.out.println("Você ouviu todo esse disco.");
	}

	public void
	tocar(int tempo)
	{
		System.out.println("Você ouviu o disco por " + tempo +
				((tempo > 1) ? (" segundos.") : (" segundo.")));
	}

	public void
	pularFaixas()
	{
		System.out.println("Você pulou 1 faixa.");
	}

	public void
	pularFaixas(int nFaixa)
	{
		System.out.println("Você pulou " + nFaixa +
				((nFaixa > 1) ? (" faixas.") : (" faixa.")));
	}

	public void
	alugar()
	{
		System.out.println("Este disco foi emprestado pelo período padrão: 15 dias.");
	}

	public void
	alugar(int nDias)
	{
		System.out.println("Este disco foi emprestado por " + nDias
				+ " dias.");
	}

	Disco(int id, String nome, String autor, int duracao, String tipo)
	{
		super(id, nome, autor);
		this.duracao = duracao;
		this.tipo = tipo;
	}
}
