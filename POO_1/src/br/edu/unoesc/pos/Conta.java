package br.edu.unoesc.pos;

import java.util.Collection;

public class Conta {

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
	
	//instancializando a class

	public void depositar(Double valor) {

		saldo += valor;

	}

	public void sacar(Double valor) {

		saldo -= valor;

	}

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
