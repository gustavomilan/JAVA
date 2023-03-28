package Principal;

public abstract class Conta {
	private int numero;
	private int agencia;
	private double saldo;
	private boolean bloqueada;
	
	
	public  Conta(int numero, int agencia, boolean bloqueada, double saldo) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.bloqueada = bloqueada;
	}

	public Conta() {
	
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public boolean isBloqueada() {
		return bloqueada;
	}

	public void setBloqueada(boolean bloqueada) {
		this.bloqueada = bloqueada;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public abstract double calcRendimento();
	

	
	
	
}
