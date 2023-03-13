package principal;

import java.util.ArrayList;

public class Nota_Fiscal {
	
	private int numNota;
	private String dataImpressao;
	private String obsNota;
	private ArrayList<Itens> itens = new ArrayList<>();
	
	public Nota_Fiscal(int numNota, String dataImpressao, String obsNota) {
		super();
		this.numNota = numNota;
		this.dataImpressao = dataImpressao;
		this.obsNota = obsNota;
	}
	
	public Nota_Fiscal() {
		
	}

	public int getNumNota() {
		return numNota;
	}

	public void setNumNota(int numNota) {
		this.numNota = numNota;
	}

	public String getDataImpressao() {
		return dataImpressao;
	}

	public void setDataImpressao(String dataImpressao) {
		this.dataImpressao = dataImpressao;
	}

	public String getObsNota() {
		return obsNota;
	}

	public void setObsNota(String obsNota) {
		this.obsNota = obsNota;
	}
	
	public Itens getItem (int indice) {
		return this.itens.get(indice);	
	}
	
	public void getItens() {
		double total = 0;
		System.out.println("Nota Ficasl: " +this.getNumNota());
		System.out.println("**********************************");
		
		for (int i=0; i < this.itens.size(); i++) {
			double valorItem = this.itens.get(i).getQtdItem() * +this.itens.get(i).getProduto().getValorUnit();

			System.out.println("Numero do item: " + i);
			System.out.println("Descrição: " + this.itens.get(i).getProduto().getDescProduto());
			System.out.println("Quantidade: " + this.itens.get(i).getQtdItem());
			System.out.println("Valor do item: " + valorItem);
			total += valorItem;
			System.out.println("=====================================");

		}
		System.out.println("Total: " + total);
	}
	public void setItem(Itens it) {
		this.itens.add(it);
	}
}
