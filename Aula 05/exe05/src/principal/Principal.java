package principal;

public class Principal {
	public static void main(String[] args) {
		Produto oProd1 = new Produto(1, "Caneta", 11.20);
		Produto oProd2 = new Produto(1, "Borracha", 2.20);
		Produto oProd3 = new Produto(1, "Madeira", 5.50);
		
		//Cadastro Itens
		Itens oItem1 = new Itens();
		oItem1.setNumItem(1);
		oItem1.setQtdItem(1);
		oItem1.setProduto(oProd1);
		
		Itens oItem2 = new Itens();
		oItem2.setNumItem(2);
		oItem2.setQtdItem(1);
		oItem2.setProduto(oProd2);
		
		Itens oItem3 = new Itens();
		oItem3.setNumItem(3);
		oItem3.setQtdItem(1);
		oItem3.setProduto(oProd3);
		
		//Atrelar  os itens a Nota
		Nota_Fiscal oNf = new Nota_Fiscal();
		oNf.setNumNota(1000);
		oNf.setDataImpressao("03/03/2023");
		oNf.setItem(oItem1);
		oNf.setItem(oItem2);
		oNf.setItem(oItem3);
		
		//Imprime a nota fiscal
		oNf.getItens();
	}
}