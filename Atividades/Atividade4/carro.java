class CarroInstancia {
	public static void main(String args[]) {
		Carro civic = new Carro();
		Carro kwid = new Carro();
		Carro onix = new Carro();

		civic.marcaModeloAno = "Honda Civic 2015";
		kwid.marcaModeloAno = "Renault Kwid 2018";
		onix.marcaModeloAno = "Chevrolet Onix 2020";

		System.out.println("V " + civic.marcaModeloAno + ": " + civic.acelerar());
		System.out.println("V " + civic.marcaModeloAno + ": " + civic.frear());
	}
}

class Carro {
	String marcaModeloAno;
	int velocidade = 0;
	char pisca = 'n'; // 'd'ireita, 'e'squerda, 'n'ada

	int acelerar() {
		velocidade += 10;
		return velocidade;
	}

	int frear() {
		if (velocidade < 10) {
			System.out.println("Este carro tem ré.");
		} else {
			velocidade -= 10;
		}

		return velocidade;
	}

	char piscar(char d) {
		if (d != 'd' && d != 'e' && d != 'n') {
			System.out.println("Direção inválida");
		} else {
			pisca = d;
		}

		return pisca;
	}
}
