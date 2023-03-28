package Principal;

public class Poupanca extends Conta {
	private int aniversario;
	private boolean conjunta;
	
	public Poupanca(int numero, int agencia, boolean bloqueada, int aniversario, boolean conjunta, double saldo) {
		super(numero, agencia, bloqueada, saldo);
		this.aniversario = aniversario;
		this.conjunta = conjunta;
	}
	
	public Poupanca() {
		super();
	}
	
	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}

	public boolean isConjunta() {
		return conjunta;
	}

	public void setConjunta(boolean conjunta) {
		this.conjunta = conjunta;
	}
	
	public double calcRendimento() {
		if((this.isConjunta() == true) && (this.isBloqueada()== false)){
			return (this.getSaldo()* 0.4);
		}else {
			return (this.getSaldo()* 0.3);
		}
	}
	
	
	
	
}
