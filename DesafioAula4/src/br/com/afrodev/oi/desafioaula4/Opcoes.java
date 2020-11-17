package br.com.afrodev.oi.desafioaula4;

import java.util.Scanner;

public class Opcoes {

	Scanner sc = new Scanner(System.in);

	public void selecionarOpcao1() {
		// Aproveite o c�digo nesse trecho..
		// Extract Method no Eclipse para gerar m�todo de trecho

		String nomeAnimal;
		do {
			nomeAnimal = lerAnimal();
			Impressora.imprimaValor("Eu prefiro gato..");
		} while (!nomeAnimal.toLowerCase().equals("gato"));
		Impressora.imprimaValor("Quem legal o meu tamb�m");
	}

	public String lerAnimal() {
		
		Impressora.imprimaValor("Qual o nome do seu animal preferido?");
		return sc.nextLine();
	}

	public int selecionarOpcao2() {

		Impressora.imprimaValor("Qual a idade do seu filho?");
		int idadeFilho = sc.nextInt();
		if (idadeFilho > 0 && idadeFilho < 12) {
			Impressora.imprimaValor("Ele ainda � uma crian�a!");
		} else if (idadeFilho > 11 && idadeFilho < 19) {
			Impressora.imprimaValor("Adolesc�ncia � fogo.. ");
		} else {
			Impressora.imprimaValor("Ele j� � um adulto!");
		}
		return idadeFilho;

	}

	public void selecionarOpcao3(int idade) {

		if (idade == 0) {
			Impressora.imprimaValor("� necess�rio informar a idade na op��o 2");

		} else {
			for (int i = 0; i < idade; i++) {
				Impressora.imprimaValor(i + "...");
			}
			Impressora.imprimaValor(idade + "s�o tantos anos...");
		}

	}
}
