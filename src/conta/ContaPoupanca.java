package conta;

public final class ContaPoupanca extends Conta{
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	@Override
	public void deposita(double valor) {
		this.saldo += valor;
	}

}
