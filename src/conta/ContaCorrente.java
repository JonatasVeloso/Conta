package conta;

public final class ContaCorrente extends Conta{
	public ContaCorrente(int agencia, int numero) {
		super(agencia,numero);
		
	}
	@Override
	public void saca(double valor) {
		valor = valor+0.2;
		super.saca(valor);
	}
}
