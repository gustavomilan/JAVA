package principal;

public class Produto {
	private int codProduto;
	private String descProduto;
	private double valorUnit;
	
	public Produto(int codProduto, String descProduto, double valorUnit) {
		this.codProduto = codProduto;
		this.descProduto = descProduto;
		this.valorUnit = valorUnit;
	}

	public int getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}

	public String getDescProduto() {
		return descProduto;
	}

	public void setDescProduto(String descProduto) {
		this.descProduto = descProduto;
	}

	public double getValorUnit() {
		return valorUnit;
	}

	public void setValorUnit(double valorUnit) {
		this.valorUnit = valorUnit;
	}
	
	
	
}
