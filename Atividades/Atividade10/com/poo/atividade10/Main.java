package Atividade10.com.poo.atividade10;

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
	}
}
