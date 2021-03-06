package br.edu.unoesc.pos;

import java.util.ArrayList;
import java.util.Collection;

public class Cliente {

	private String nome;
	private String cpf;

	private Collection<Conta> contas;

	public Cliente() {

	}

	public Double getSadoContas() {

		Double saldo = 0.0;

		for (Conta conta : contas) {

			saldo += conta.getSaldo();

		}

		return saldo;

	}

	public void addConta(Conta conta) {

		if (contas == null) {
			contas = new ArrayList<>();

		}
		contas.add(conta);

	}

	public Cliente(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Collection<Conta> getContas() {
		return contas;
	}

	public void setContas(Collection<Conta> contas) {
		this.contas = contas;
	}

}

// lomgbok