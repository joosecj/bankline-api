package com.dio.santander.bankline.api.model;

public class Correntista {
	private Integer id;
	private String cof;
	private String nome;
	
	private Conta conta;
	
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCof() {
		return cof;
	}
	public void setCof(String cof) {
		this.cof = cof;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
