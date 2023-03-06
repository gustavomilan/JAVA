package principal;

import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa();
		
		System.out.println("Nome" + pessoa.getNome());
		
		Aluno alu = new Aluno();
		
		System.out.println("Informe o nome");
		alu.setNome(ler.nextLine());
		
		System.out.println("Informe a idade");
		alu.setIdade(ler.nextInt());
		
		
		System.out.println("Informe o peso");
		alu.setPeso(ler.nextDouble()); 
		
		System.out.println("Informe a altura");
		alu.setAltura(ler.nextDouble());
		
		double imc = alu.getIMC();
		
		System.out.println("O aluno é bolsista ?");
		alu.setBolsista(ler.nextBoolean());
		
		System.out.println("Informe a matricula ");
		alu.setMatricula(ler.nextInt());
		
		ler.nextLine();
		
		System.out.println("Informe o Curso");
		alu.setCurso(ler.nextLine());
		
		System.out.println("======RESULTADO=======");
	    System.out.println("Nome: " + alu.getNome());
	    System.out.println("IMC: " + imc);

		System.out.println("Matirucla: " +alu.getMatricula());
	}
}
