package conta.objetos;

import conta.exeptions.SemSaldoExeption;
import conta.interfaces.Tributavel;

public final class ContaCorrente extends Conta implements Tributavel {
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);

	}

	@Override
	public void saca(double valor) throws SemSaldoExeption {
		valor = valor + 0.2;
		super.saca(valor);			
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
}
