package br.edu.unoesc.pos;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class ContaCorrenteTest {
	
	
	@Test	
	public void criarContaCorrente(){
		
		Corrente corrente = new Corrente();
		
		corrente.setLimite(100.00);
		corrente.setNumero(123456);
		
		assertThat(corrente.getLimite(), is(100.00));
		
		
	}
	
	
	@Test
    public void validarSaqueContaCorrentecomLimite() {
		
		Corrente corrente = new Corrente();
		
		corrente.depositar(100.00);
		corrente.setLimite(100.00);
		corrente.setNumero(123456);		
		corrente.sacar(100.0);
		assertThat(corrente.getSaldo(), is(0.00));
		
		
		
	}
	
	
	
	

}
