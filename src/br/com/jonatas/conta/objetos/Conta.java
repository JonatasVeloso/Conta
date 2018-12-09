package br.com.jonatas.conta.objetos;

import br.com.jonatas.conta.exeptions.SemSaldoExeption;

public abstract class Conta {
	private int agencia;
	private int numero;
	protected double saldo;

	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	};

	public void transfere(double valor, Conta conta) {
		conta.saldo += valor;
		this.saldo -= valor;
	}
	
	@Override
	public String toString() {
		System.out.println("Número: " + this.agencia + " Número: " + this.numero);
		System.out.println("Saldo: " + this.saldo);
		return "";
	}

	public void saca(double valor) throws SemSaldoExeption {
		if (this.saldo < valor) {
			throw new SemSaldoExeption("ERRO: Saldo Insuficiente!");
		}
		this.saldo -= valor;
	}
}
