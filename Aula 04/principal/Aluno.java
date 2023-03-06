package principal;

public class Aluno extends Pessoa {
	
	private boolean bolsista;
	private int matricula;
	private String curso;
	
	public Aluno(String nome, int idade, double peso, double altura, boolean bolsista, int matricula, String curso) {
		super(nome, idade, peso, altura);
		this.bolsista = bolsista;
		this.matricula = matricula;
		this.curso = curso;
	}

	public Aluno() {
		super();
	}

	public boolean isBolsista() {
		return bolsista;
	}

	public void setBolsista(boolean bolsista) {
		this.bolsista = bolsista;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
