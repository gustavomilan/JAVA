package principal;

import java.util.Scanner;


public class principal {
	public static void main(String[] args) {
		
		
		//get
		Funcionario calcula = new Funcionario("Gustavo", true, 1000, 22);
		System.out.println("[GET] Nome: " + calcula.getNome());
		System.out.println("[GET] O Salario Bruto é: " + calcula.getSalario());
		System.out.println("[GET] O Salario Liquido é: "+ calcula.getSalLiquido());
		System.out.println("******************************");
		
		//set
		Funcionario calcula2 = new Funcionario();
		calcula2.setNome("Gustavo");
		calcula2.setPf(true);
		calcula2.setSalario(1000);
		calcula2.setIdade(22);
		
		System.out.println("[GET] Nome: " + calcula.getNome());
		System.out.println("[SET] O Salario Bruto é " + calcula2.getSalario());
		System.out.println("[SET] O Salario Liquido é " + calcula2.getSalLiquido());
	}
}
