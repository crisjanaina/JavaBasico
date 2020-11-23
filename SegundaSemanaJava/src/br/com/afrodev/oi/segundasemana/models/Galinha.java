package br.com.afrodev.oi.segundasemana.models;

public class Galinha extends Animal {

	private Float tamanhoDoPoleiro;
	
	public Galinha() {
		
	}

	public Float getTamanhoDoPoleiro() {
		return tamanhoDoPoleiro;
	}

	public void setTamanhoDoPoleiro(Float tamanhoDoPoleiro) {
		this.tamanhoDoPoleiro = tamanhoDoPoleiro;
	}

	@Override
	public void dizerOla() {
		System.out.println("Olá eu sou uma Galinha!");
	}

}
