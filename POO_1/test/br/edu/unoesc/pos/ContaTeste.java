package br.edu.unoesc.pos;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class ContaTeste {

	@Test

	public void depositarEalterarSaldo() {

		Conta conta = new Conta();

		conta.depositar(100.0);
		conta.depositar(100.0);
		assertThat(conta.getSaldo(), is(200.0));
	}

	@Test

	public void sacarEalterarSaldo() {

		Conta conta = new Conta();

		conta.sacar(100.0);
		assertThat(conta.getSaldo(), is(-100.0));
	}

}
