class CalculadoraInstancia {
	public static void main(String args[]) {
		Calculadora hp = new Calculadora();
		Calculadora ti = new Calculadora();
		Calculadora casio = new Calculadora();

		hp.modelo = "HP 50G";
		ti.modelo = "TI 89";
		casio.modelo = "Casio fx-991CW";

		System.out.println(hp.modelo + ": " + hp.somar(2, 2));
	}
}

class Calculadora {
	String modelo;
	int res = 0;
	int mem;

	int somar(int a, int b) {
		mem = res;
		res = a + b;
		return res;
	}

	int multiplicar(int a, int b) {
		mem = res;
		res = a * b;
		return res;
	}

	int resto(int a, int b) {
		mem = res;
		res = a % b;
		return res;
	}
}
