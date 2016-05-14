package br.edu.unoesc.pos;

import java.util.ArrayList;
import java.util.Collection;

public class CalculadoraSadoBanco {

	private Cliente cliente;
	private Collection<Conta> contas;

	public CalculadoraSadoBanco(Collection<Conta> contas) {

		this.contas = contas;
	}
	
	public CalculadoraSadoBanco() {

		contas = new ArrayList<>();
	}

	public Double getSaldoCliente() {

		return 0.0;

	}

	public Double calculaSaldoContas() {
		
		//JAVA 7 

		Double saldo = 0.0;

		for (Conta conta : contas) {

			saldo += conta.getSaldo();

		}
		return saldo;
		
		//return contas.stream().mapToDouble(conta->conta.getSaldo()).sum(); 
		//return contas.stream().pararell().mapToDouble(conta->conta.getSaldo()).sum(); UTILIZANDO pararell(). cria  threds para procesamento de massa grandes de dados;
		//return contas.stream().mapToDouble(Conta::getSaldo()).sum();   - novos metodos de for em JAVA 8 

	}

	public void addConta(Conta conta) {

		if (contas == null) {
			contas = new ArrayList<>();

		}
		contas.add(conta);

	}

}
