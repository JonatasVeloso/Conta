package br.com.jonatas.conta.objetos;

import br.com.jonatas.conta.exeptions.SemSaldoExeption;

/**
 * 
 * @author Jonatas Veloso
 *
 */
public final class ContaPoupanca extends Conta {

	/**
	 * Construtor do objeto Conta Poupan�a, passando os par�metros para o construtor
	 * mais gen�rico Conta.
	 * 
	 * @param agencia
	 * @param numero
	 */
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
		
	@Override
	public String toString() {
		System.out.print("Conta Poupan�a: ");
		return super.toString();
	}
	
}
