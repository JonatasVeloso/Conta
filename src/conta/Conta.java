package conta;

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
	
	public abstract void deposita(double valor);
	
	public void transfere(double valor, Conta conta) {
		conta.saldo += valor;
		this.saldo -= valor;
	}
	
	public void detalhes() {
		System.out.println("Conta: " + this.agencia + " Número: " + this.numero);
		System.out.println("Saldo: " + this.saldo);
	}
	
	public abstract void saca(double valor);
}
