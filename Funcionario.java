package principal;

public class Funcionario {
	
	private String nome;
	private boolean pf;
	private double salario;
	private int idade;
	
	//Construtor 
	public Funcionario(String nome,boolean pf, double salario, int idade) {
		this.nome = nome;
		this.pf = pf;
		this.salario = salario;
		this.idade = idade;
	}
	
	//Construtor Vazio
	public Funcionario() {
		
	}
	
	// Get e set
	
	//Nome
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
		}
	
	//PF
	public boolean getPf() {
		return pf;
	}
	public void setPf(boolean pf) {
		this.pf = pf;
	}
	
	//Salario
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//Idade
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//Salario Liquido
	public double getSalLiquido() {
		double salarioLiquido;
		if (pf) {
			salarioLiquido = salario * 0.7 - idade * 0.1;
			} else {
			salarioLiquido = salario * 0.9 - idade * 0.05;
			}
		return salarioLiquido;
		
	}
}	
	
