package br.com.jonatas.conta.exeptions;

public class SemSaldoExeption extends Exception {
	public SemSaldoExeption() {

	}

	public SemSaldoExeption(String mensagem) {
		super(mensagem);
	}

	public SemSaldoExeption(double valor, double saldo) {
		if (saldo < valor) {
			//throw new SemSaldoExeption("Sem Saldo");
		} else {
			System.out.println("Valor Normal");
		}
	}
}
