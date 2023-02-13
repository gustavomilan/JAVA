package principal;

public class principal {
		public static void main(String[] args) {
			
			Pessoa oimc = new Pessoa(100, 1.80);
			oimc.calcula();
			
			Pessoa oimc2 = new Pessoa();
			oimc2.setAltura(1.85);
			oimc2.setPeso(100);
			
			oimc.calcula();
		}
}
