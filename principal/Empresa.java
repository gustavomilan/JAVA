package principal;

public class Empresa {
	
	private String nome;
	private int qtdFunc;
	
	public Empresa(String nome, int qtdFunc) {
		this.nome = nome;
		this.qtdFunc = qtdFunc;
	}
	
	public Empresa() {
		
	}
	
	
	//GETS
	public String getNome() {
		return this.nome;
	}
	public int getQtdFunc() {
		return this.qtdFunc;
	}
	
	
	//SETS
	public void setNome(String nome) {
		 this.nome= nome;
	}
	public void setQtdFunc (int qtdFunc) {
		this.qtdFunc = qtdFunc;
	}
	
}
