package prj_aula3;

public class triangulo {

	private double base;
	private double altura;
	
	public triangulo( double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public triangulo() {
		
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public double getBase() {
		return this.base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setBase(double base) {
		 this.base = base;
	}
	
	public void calculaArea() {
		double area = this.base * this.altura;
		
		System.out.println("A area do triangulo é: " + area);
	
	}
	
	public void calculaPerimetro() {
		double perimetro = this.base *3;
		
		System.out.println("O perimetro do triangulo é: " + perimetro);
	}
	
}
