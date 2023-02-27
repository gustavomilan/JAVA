package principal;

public class principal {
	public static void main(String[] args) {
		

		//get
		
		Empresa empresa = new Empresa("IFSP", 8);
		Funcionario calcula = new Funcionario("Gustavo", 1000, false, empresa);
		System.out.println("=======EMPRESA========");
		System.out.println("Nome: " + calcula.getEmpresa().getNome());
		System.out.println("Quantidade de Funcionarios: " + calcula.getEmpresa().getQtdFunc());
		
		System.out.println("=======FUNCIONARIO========");
		System.out.println("Nome: " + calcula.getNome());
		System.out.println("É PJ?: " + calcula.getPJ());
		System.out.println("Salario: " + calcula.getSalario());
		
		
		Funcionario calcula2 = new Funcionario();
		calcula2.getEmpresa().setNome("CEUNSP");
		calcula2.getEmpresa().setQtdFunc(10);
		
		calcula2.setNome("Nicolas");
		calcula2.setPJ(true);
		calcula2.setsalBruto(2000);
		
		System.out.println("=======EMPRESA========");
		System.out.println("Nome: " + calcula2.getEmpresa().getNome());
		System.out.println("Quantidade de Funcionarios: " + calcula2.getEmpresa().getQtdFunc());
		
		System.out.println("=======FUNCIONARIO========");
		System.out.println("Nome: " + calcula2.getNome());
		System.out.println("É PJ?: " + calcula2.getPJ());
		System.out.println("Salario: " + calcula2.getSalario());
		
	}
}
