package br.com.jonatas.conta.objetos;

import br.com.jonatas.conta.exeptions.SemSaldoExeption;

/**
 * 
 * @author Jonatas Veloso
 *
 */
public final class ContaPoupanca extends Conta {

	/**
	 * Construtor do objeto Conta Poupança, passando os parâmetros para o construtor
	 * mais genérico Conta.
	 * 
	 * @param agencia
	 * @param numero
	 */
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
		
	@Override
	public String toString() {
		System.out.print("Conta Poupança: ");
		return super.toString();
	}
	
}
