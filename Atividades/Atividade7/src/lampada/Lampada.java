package lampada;

public class Lampada {
	Boolean ligado = false;
	int temperatura = 6000;
	String cor = "branco";

	Lampada (int temp) {
		this.temperatura = temp;
	}
	
	Lampada (String cor) {
		this.cor = cor;
	}
	
	Lampada (Boolean lig, int temp, String cor) {
		this.ligado = lig;
		this.temperatura = temp;
		this.cor = cor;
	}
}