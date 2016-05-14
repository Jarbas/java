package br.edu.unoesc.pos;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SomaContasTest {

	@Test
	public void TestandoSandoListadeConta() {

		CalculadoraSadoBanco calculadora = new CalculadoraSadoBanco();

		Poupanca pop1 = new Poupanca();
		pop1.depositar(100.0);
		Corrente cor1 = new Corrente();
		cor1.depositar(100.0);

		calculadora.addConta(pop1);
		calculadora.addConta(cor1);

		assertThat(calculadora.calculaSaldoContas(), is(200.0));

	}

}
