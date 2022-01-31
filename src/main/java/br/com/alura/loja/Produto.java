package br.com.alura.loja;

import java.math.BigDecimal;

public class Produto {

	private String nome;
	private BigDecimal preco;
	
	public Produto(String nome, BigDecimal preco) {
		this.nome = nome;
		this.setPreco(preco);
	}
	
	public String getNome() {
		return nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
}
