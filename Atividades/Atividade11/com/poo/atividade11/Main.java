package Atividade11.com.poo.atividade11;

public class Main {
	public static void
	main(String args[])
	{
		Livro livro = new Livro(0, "Crime e Castigo",
					"Fiódor Dostoiévski", 561, true);
		Disco disco = new Disco(1, "Clube da Esquina",
					"Milton Nascimento, Lô Borges", 3862,
					"vinil");

		livro.superSub();
		disco.superSub();

		livro.virarPagina();
		livro.virarPagina(2);
		livro.sublinhar();
		livro.sublinhar(5);
		livro.alugar();
		livro.alugar(30);

		disco.tocar();
		disco.tocar(120);
		disco.pularFaixas();
		disco.pularFaixas(2);
		disco.alugar();
		disco.alugar(2);
	}
}
