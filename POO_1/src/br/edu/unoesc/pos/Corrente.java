package br.edu.unoesc.pos;

public class Corrente extends Conta {

	private Double limite = 0.0;
	
	
	public Corrente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Corrente(Integer numero, Double saldo, Agencia agencia, Cliente cliente) {
		super(numero, saldo, agencia, cliente);
		// TODO Auto-generated constructor stub
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	@Override
	public void sacar(Double valor) {
		{
			// TODO Auto-generated method stub

			if (getSaldo() + limite >= valor) {

				super.sacar(valor);

			}
		}

	}

	@Override
	public Double getSaldoDisponivel() {
		// TODO Auto-generated method stub
		return getSaldo() + limite;
	}

}
