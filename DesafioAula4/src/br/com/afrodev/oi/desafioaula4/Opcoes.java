package br.com.afrodev.oi.desafioaula4;

import java.util.Scanner;

public class Opcoes {

	Scanner sc = new Scanner(System.in);

	public void selecionarOpcao1() {
		// Aproveite o código nesse trecho..
		// Extract Method no Eclipse para gerar método de trecho

		String nomeAnimal;
		do {
			nomeAnimal = lerAnimal();
			Impressora.imprimaValor("Eu prefiro gato..");
		} while (!nomeAnimal.toLowerCase().equals("gato"));
		Impressora.imprimaValor("Quem legal o meu também");
	}

	public String lerAnimal() {
		
		Impressora.imprimaValor("Qual o nome do seu animal preferido?");
		return sc.nextLine();
	}

	public int selecionarOpcao2() {

		Impressora.imprimaValor("Qual a idade do seu filho?");
		int idadeFilho = sc.nextInt();
		if (idadeFilho > 0 && idadeFilho < 12) {
			Impressora.imprimaValor("Ele ainda é uma criança!");
		} else if (idadeFilho > 11 && idadeFilho < 19) {
			Impressora.imprimaValor("Adolescência é fogo.. ");
		} else {
			Impressora.imprimaValor("Ele já é um adulto!");
		}
		return idadeFilho;

	}

	public void selecionarOpcao3(int idade) {

		if (idade == 0) {
			Impressora.imprimaValor("É necessário informar a idade na opção 2");

		} else {
			for (int i = 0; i < idade; i++) {
				Impressora.imprimaValor(i + "...");
			}
			Impressora.imprimaValor(idade + "são tantos anos...");
		}

	}
}
