package br.com.afrodev.oi.segundasemana.models;

import br.com.afrodev.oi.segundasemana.util.Tradutor;

public class Cachorro extends Animal {

	private Boolean possuiCama;

	public Cachorro() {

	}

	public Boolean getPossuiCama() {
		return possuiCama;
	}

	public void setPossuiCama(Boolean possuiCama) {
		this.possuiCama = possuiCama;
	}

	@Override
	public void dizerOla() {
		System.out.println("Olá eu sou uma Cachorro!");
	}

	public String getTraduzirPossuiCama() {
		return Tradutor.traduzir(this.possuiCama);
	}
}
