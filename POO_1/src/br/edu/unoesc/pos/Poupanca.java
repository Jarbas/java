package br.edu.unoesc.pos;

public class Poupanca extends Conta {
	
	private Double rendimento;
	
	
   // Construtores  - source - contructo superclass

	public Poupanca() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Poupanca(Integer numero, Double saldo, Agencia agencia, Cliente cliente) {
		super(numero, saldo, agencia, cliente);
		// TODO Auto-generated constructor stub
	}

	public Double getRendimento() {
		return rendimento;
	}

	public void setRendimento(Double rendimento) {
		this.rendimento = rendimento;
	}

	@Override
	public Double getSaldoDisponivel() {
		// TODO Auto-generated method stub
		return getSaldo();
	}

}
