package com.br;

public class Carro {

	private int ano;
	private String modelo;
	
	public Carro(int ano, String modelo) {
		this.ano = ano;
		this.modelo = modelo;
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
