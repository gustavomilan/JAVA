package prj_aula3;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		System.out.println("GET");
		triangulo calcula = new triangulo(8,2);
		calcula.calculaArea();
		calcula.calculaPerimetro();
	
		triangulo calcula2 = new triangulo();
		calcula2.setAltura(8);
		calcula2.setBase(2);
		
		System.out.println("SET");
		calcula2.calculaArea();
		calcula2.calculaPerimetro();
	}
}