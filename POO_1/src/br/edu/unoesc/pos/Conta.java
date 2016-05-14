package br.edu.unoesc.pos;

import java.util.Collection;

public abstract class Conta {

	private Integer numero = 0;
	private Double saldo = 0.0;
	private Agencia agencia;
	private Cliente cliente;

	public Conta() {

	}

	public Conta(Integer numero, Double saldo, Agencia agencia, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.agencia = agencia;
		this.cliente = cliente;
	}

	// instancializando a class - create

	public void depositar(Double valor) {

		saldo += valor;

	}

	/**
	 * Metodo utilizado para sacar verificando limite do tipo de conta
	 * @param valor
	 */
	
	public void sacar(Double valor) {   // o final "public final void" indica que o nao pode ser utilizado pela classe filha
		
		if (getSaldoDisponivel() >= valor) {
			saldo -= valor;
		}
		else {
			
			throw new IllegalArgumentException("Valor indisponivel.");
		}

	}
	
	public abstract Double getSaldoDisponivel(); //para tem um metodo abstrado a class pai tem que ser abstract

	public Double getSaldo() {

		return saldo;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

}
