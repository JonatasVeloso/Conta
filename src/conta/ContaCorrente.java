package conta;

public final class ContaCorrente extends Conta{
	public ContaCorrente(int agencia, int numero) {
		super(agencia,numero);
		
	}
	@Override
	public void saca(double valor) {
		this.saldo -= (valor+0.2);
	}
	
	@Override
	public void deposita(double valor) {
		this.saldo += valor;
	}
}
