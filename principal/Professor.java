package principal;

public class Professor extends Pessoa {
	
	private double salario;
	private String disciplina;
	private String formacao;
	
	public Professor(String nome, int idade, double peso, double altura, double salario, String disciplina,
			String formacao) {
		super(nome, idade, peso, altura);
		this.salario = salario;
		this.disciplina = disciplina;
		this.formacao = formacao;
	}
		
	public Professor() {
		super();
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	
	
}
