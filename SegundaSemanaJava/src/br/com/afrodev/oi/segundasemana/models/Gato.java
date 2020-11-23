package br.com.afrodev.oi.segundasemana.models;

import br.com.afrodev.oi.segundasemana.util.Tradutor;

public class Gato extends Animal {
	private Boolean possuiCaixaDeAreia;
	public Gato() {
		
		
	}

	public Boolean getPossuiCaixaDeAreia() {
		return possuiCaixaDeAreia;
	}

	public void setPossuiCaixaDeAreia(Boolean possuiCaixaDeAreia) {
		this.possuiCaixaDeAreia = possuiCaixaDeAreia;
	}

	@Override
	public void dizerOla() {
		System.out.println("Olá eu sou um Gato!");
	}
	
	public String getTraducaoPossuiCaixaDeAreia() {
		return Tradutor.traduzir(this.possuiCaixaDeAreia);
	}
}
