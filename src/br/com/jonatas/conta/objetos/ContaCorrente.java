package br.com.jonatas.conta.objetos;

import br.com.jonatas.conta.exeptions.SemSaldoExeption;
import br.com.jonatas.conta.interfaces.Tributavel;

/**
 * Objeto Conta Corrente
 * @author Jonatas Veloso
 * 
 */
public final class ContaCorrente extends Conta implements Tributavel {
	
	/**
	 * 
	 * @param agencia
	 * @param numero
	 */
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);

	}

	/**
	 * Sobreposição do método Saca
	 * O saque em conta Corrente tem desconto 
	 */
	@Override
	public void saca(double valor) throws SemSaldoExeption {
		valor = valor + 0.2;
		super.saca(valor);			
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	/**
	 * Mensagem que irá sair no println
	 */
	@Override
	public String toString() {
		System.out.print("Conta Corrente: ");
		return super.toString();
	}
}
