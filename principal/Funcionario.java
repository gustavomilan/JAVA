package principal;

public class Funcionario {

		private String nome;
		private double salBruto;
		private Boolean PJ;
		private Empresa empresa;
		
		public Funcionario(String nome, double salBruto, Boolean PJ, Empresa empresa) {
			this.nome = nome;
			this.salBruto = salBruto;
			this.PJ = PJ;
			this.empresa = empresa;
		}
		
		public Funcionario() {
			this.empresa = new Empresa();
		}
		
		
		//GETS
		public Empresa getEmpresa() {
			return this.empresa;
		}
		public String getNome() {
			return this.nome;
		}
		public double getsalBruto() {
			return this.salBruto;
		}
		public String  getPJ() {
			if (PJ) {
				return "Sim";
			}
			else {
				return "Não";
			}
		}
		
		
		
		//SETS
		public void setNome(String nome) {
			this.nome = nome;
		}
		public void setsalBruto(double salBruto) {
			this.salBruto = salBruto;
		}
		public void setPJ(Boolean PJ) {
			this.PJ = PJ;
		}
		
		
		//METODO 
		
		public double getSalario() {
			double salario;
			
			if (PJ) {
				salario = salBruto * 0.8 - 0.01* this.empresa.getQtdFunc();
			}
			else {
				salario = salBruto * 0.9 - 0.02* this.empresa.getQtdFunc();
			}
			
			return salario;
		}
		
		
}


