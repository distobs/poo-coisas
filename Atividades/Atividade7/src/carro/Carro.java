package carro;

class Carro {
	String marcaModeloAno;
	int velocidade = 0;
	char pisca = 'n'; // 'd'ireita, 'e'squerda, 'n'ada
	
	Carro (String mmm) {
		this.marcaModeloAno = mmm;
	}
	
	Carro (String mmm, int vel) {
		this.marcaModeloAno = mmm;
		this.velocidade = vel;
	}
	
	Carro (String mmm, int vel, char pis) {
		this.marcaModeloAno = mmm;
		this.velocidade = vel;
		this.pisca = pis;
	}
}