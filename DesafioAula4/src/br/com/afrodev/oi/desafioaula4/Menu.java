package br.com.afrodev.oi.desafioaula4;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// ctrl + shift + o
		// para ralizar importa��o das classes

		// Fa�a uma altera��o nesse c�digo para que o menu s� sai quando
		// a op��o informada for 0

		Opcoes opcoes = new Opcoes();
		Scanner sc = new Scanner(System.in);
		int escolha = escolherOpcao(sc);
		int idade = 0;
		// Quando a idade ainda n�o tiver sido informada
		// e entrarem na op��o 3
		// Imprima : � necess�rio informar a idade na op��o 2
		// e n�o execute o c�digo da op��o 2.

		
		// retorne a idade da op��o 2 e atribua o valor
		//a vari�vel idad da classe Menu
		
		do {
		escolha = escolherOpcao(sc);
			switch (escolha) {
			case 1:
				opcoes.selecionarOpcao1();
				break;
			case 2:
				opcoes.selecionarOpcao2();
				break;
			case 3:
				opcoes.selecionarOpcao3(idade);
				break;
			default:
				Impressora.imprimaValor("Op��o escolhida n�o existe!");
				break;
			}
		
		} while(escolha!= 0);
		
	}

	public static int escolherOpcao(Scanner sc) {

		Impressora.imprimaValor("Op��o escolhida n�o existe!");
		return sc.nextInt();
	}

}
