package br.edu.unoesc.pos.calculadora;

public class Calculadora {

	public void mostrarResultado(Operacao operacao, int x, int y) {

		System.out.println("Resultado: " + operacao.calcular(x, y));

	}

	public static void main(String[] args) {
		// primerio metodo que a vm procura para executar

		Calculadora calculadora = new Calculadora();
		calculadora.mostrarResultado(new Soma(), 10, 10);
		calculadora.mostrarResultado(new Subtracao(), 20, 10);
	}

}
