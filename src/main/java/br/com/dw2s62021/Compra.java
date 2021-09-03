package br.com.dw2s62021;

public class Compra {
	
//número da compra, o nome do cliente, o nome de um produto e o valor total da compra
	
	private int numCompra;
	private String nomeCliente;
	private String nomeDeUmProduto;
	private float valorTotal;
	
	public Compra(int numCompra, String nomeCliente, String nomeDeUmProduto, float valorTotal) {
		super();
		this.numCompra = numCompra;
		this.nomeCliente = nomeCliente;
		this.nomeDeUmProduto = nomeDeUmProduto;
		this.valorTotal = valorTotal;
	}

	public int getNumCompra() {
		return numCompra;
	}

	public void setNumCompra(int numCompra) {
		this.numCompra = numCompra;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNomeDeUmProduto() {
		return nomeDeUmProduto;
	}

	public void setNomeDeUmProduto(String nomeDeUmProduto) {
		this.nomeDeUmProduto = nomeDeUmProduto;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
	

}
