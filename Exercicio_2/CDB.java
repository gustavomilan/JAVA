package Principal;

public class CDB extends Conta{
	private int modalidade;
	private double percCDI;
	
	public CDB(int numero, int agencia, boolean bloqueada, double saldo, int modalidade, double percCDI) {
		super(numero, agencia, bloqueada, saldo);
		this.modalidade = modalidade;
		this.percCDI = percCDI;
	}
	
	public CDB() {
		super();
	}

	public int getModalidade() {
		return modalidade;
	}

	public void setModalidade(int modalidade) {
		this.modalidade = modalidade;
	}

	public double getPercCDI() {
		return percCDI;
	}

	public void setPercCDI(double percCDI) {
		this.percCDI = percCDI;
	}
	
	public double calcRendimento() {
		if((this.getModalidade() == 1) && (this.isBloqueada() == false)) {
			return (this.getSaldo()*0.9*this.getPercCDI());
		}else {
			return (this.getSaldo()*0.8*this.getPercCDI());
		}
	}
	
}
