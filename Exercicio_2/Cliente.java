package Principal;

public class Cliente {
	private String nome;
	private double cpf;
	private String rg;
	private String data_nascimento;
	private Conta conta;

	public Cliente(String nome, double cpf, String rg, String data_nascimento, Conta conta) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.data_nascimento = data_nascimento;
		this.conta = conta;
	}
	
	public Cliente() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCpf() {
		return cpf;
	}

	public void setCpf(double cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	
	
	
}
