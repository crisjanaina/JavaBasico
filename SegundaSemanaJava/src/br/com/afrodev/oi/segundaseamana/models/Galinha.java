package br.com.afrodev.oi.segundaseamana.models;

public class Galinha extends Animal {

	private Float tamanhoDoPoleiro;

	public Float getTamanhoDoPoleiro() {
		return tamanhoDoPoleiro;
	}

	public void setTamanhoDoPoleiro(Float tamanhoDoPoleiro) {
		this.tamanhoDoPoleiro = tamanhoDoPoleiro;
	}

	@Override
	public void dizerOla() {
		System.out.println("Ol� eu sou uma Galinha!");
	}

}
