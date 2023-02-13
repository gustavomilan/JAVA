package principal;

public class Pessoa {
	
	private  double peso;
	private  double altura;
	 
	public Pessoa(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	public Pessoa () {
		
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public double getAltura() {
		return	this.altura;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void calcula() {
		
		double imc = this.peso/(this.altura*this.altura);
		
		System.out.println("seu IMC é " + imc);
		
	}
}
