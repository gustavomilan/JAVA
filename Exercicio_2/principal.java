package Principal;

public class principal {
	public static void main(String[] args) {
	
	Poupanca p= new Poupanca();

	CDB c = new CDB();
	
	Cliente cliente1 = new Cliente ("Gustavo",1111111,"000","21/12/2000", p);
	Cliente cliente2 = new Cliente ("Nicolas",2222222,"111","19/03/2001", c);
	
	p.setNumero(1);
	p.setAgencia(402);
	p.setSaldo(1000);
	p.setBloqueada(false);
	p.setAniversario(2112200);
	p.setConjunta(true);
	
	c.setNumero(2);
	c.setAgencia(502);
	c.setSaldo(1000);
	c.setBloqueada(false);
	c.setModalidade(1);
	c.setPercCDI(0.7);
	
	System.out.println("Nome: " + cliente1.getNome());
	System.out.println("Saldo: " + cliente1.getConta().getSaldo());
	System.out.println("Conta Conjunta?: " + p.isConjunta());
	System.out.println("Conta Bloqueada?: " + cliente1.getConta().isBloqueada());
	System.out.println("Redimento: " + cliente1.getConta().calcRendimento());
	
	System.out.println("================================");
	
	System.out.println("Nome: " + cliente2.getNome());
	System.out.println("Saldo: " + cliente2.getConta().getSaldo());
	System.out.println("Modalidade: " + c.getModalidade());
	System.out.println("Conta Bloqueada?: " + cliente2.getConta().isBloqueada());
	System.out.println("Percentual: " + c.getPercCDI());
	System.out.println("Rendimento: " + cliente2.getConta().calcRendimento());
		
	}
	
	

}
