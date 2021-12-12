package Questao2;

public class Fatura {
	public int numeroItem;
	public String descricaoString;
	private int quantidade;
	private float precoUnitario;
	
	public Fatura(int numeroItem, String descricaoString, int quantidade, float precoUnitario) {
		this.numeroItem = numeroItem;
		this.descricaoString = descricaoString;
		this.setPrecoUnitario(precoUnitario);
		this.setQuantidade(quantidade);
	}
	public int getNumeroItem() {
		return numeroItem;
	}
	public void setNumeroItem(int numeroItem) {
		this.numeroItem = numeroItem;
	}
	public String getDescricaoString() {
		return descricaoString;
	}
	public void setDescricaoString(String descricaoString) {
		this.descricaoString = descricaoString;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		if (quantidade<0) {
			this.quantidade = 0;
		}
		else {
			this.quantidade = quantidade;
		}
	}
	public float getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(float precoUnitario) {
		if (precoUnitario<0) {
			this.precoUnitario = 0;
		}
		else {
			this.precoUnitario = precoUnitario;
		}
	}
	public Double getValorFatura() {
		float preco = this.precoUnitario;
		float quantidade = this.quantidade;
		return (double) preco * quantidade;
	}
}
