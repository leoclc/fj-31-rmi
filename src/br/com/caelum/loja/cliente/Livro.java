package br.com.caelum.loja.cliente;

import java.io.Serializable;

public class Livro implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	transient private String nome;
	private double preço;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}

}
