package br.com.afrodev.oi;

import java.util.Scanner;

public class Opcoes {

	Scanner sc = new Scanner(System.in);

	public void selecionarOpcao1() {
		

		System.out.printf("Qual o nome do seu animal preferido?");
		String nomeAnimal = sc.nextLine();

		while  (!nomeAnimal.equals("Gato")) {
			Impressora.imprimaValor("Eu prefiro gato..");
			System.out.printf("Qual o nome do seu animal preferido?");
			nomeAnimal = sc.nextLine();
			}
			if (nomeAnimal.equals("Gato")) {
				Impressora.imprimaValor("Quem legal o meu tamb�m");

		}
	}

	public void selecionarOpcao2() {

		Impressora.imprimaValor("Qual a idade do seu filho?");
		int idadeFilho = sc.nextInt();

		if ((idadeFilho > 0) && (idadeFilho < 12)) {

			Impressora.imprimaValor("Ele ainda � uma crian�a!");
		}

		if ((idadeFilho > 11) && (idadeFilho < 19)) {
			Impressora.imprimaValor("Adolesc�ncia � fogo.. ");
		}
		if (idadeFilho > 18) {
			Impressora.imprimaValor("Ele j� � um adulto!");

		}

	}

	public void selecionarOpcao3() {
		System.out.println("Em constru��o ...ser� que vamos aprender a usar o for.. ");
	}

}
