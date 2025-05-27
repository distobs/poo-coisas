class LampadaInstancia {
	public static void main(String args[]) {
		Lampada l1 = new Lampada();
		Lampada l2 = new Lampada();
		Lampada l3 = new Lampada();

		l1.ligarDesligar();
		l2.ligarDesligar();
		l3.ligarDesligar();
	}
}

class Lampada {
	int ligado = 0;
	int temperatura = 6000;
	String cor = "branco";

	int ligarDesligar() {
		ligado = !ligado;
		return ligado;
	}

	int alterarTemperatura(int temp) {
		if (temp < 1000 || temp > 10000) {
			System.out.println("Pode não.");
		} else {
			temperatura = temp;
		}

		return temperatura;
	}

	String alterarCor(String c) {
		cor = c;

		return cor;
	}
}
