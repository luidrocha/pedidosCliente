package entities;

public class PedidoItem {

	private Produto produto;
	private Integer qtd;
	private Double preco;

	public PedidoItem() {
	}

	public PedidoItem(Integer qtdP, Double precoP, Produto produto) {

		this.qtd = qtdP;
		this.preco = precoP;
		this.produto = produto;
	}

	public Integer getQtd() {
		return qtd;
	}

	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Double SubTotal() {

		return qtd * preco;
	}

	@Override

	public String toString() {

		return "\n" + "Produto: " + produto.getNomeProduto() + 
				" Quantidade: " + qtd + " Preço:  "
				+ String.format("%.2f", preco) + "\n" + "Sub Total: " + SubTotal();

	}

}
