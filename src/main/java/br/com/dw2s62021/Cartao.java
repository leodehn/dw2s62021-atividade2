package br.com.dw2s62021;

public class Cartao {
	
	private String numeroCartao;
	private String nomeCliente;
	private String validadeCartao;
	
	public Cartao(String numeroCartao, String nomeCliente, String validadeCartao) {
		super();
		this.numeroCartao = numeroCartao;
		this.nomeCliente = nomeCliente;
		this.validadeCartao = validadeCartao;
	}
	
	public String getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getValidadeCartao() {
		return validadeCartao;
	}
	public void setValidadeCartao(String validadeCartao) {
		this.validadeCartao = validadeCartao;
	}
	
	

}
