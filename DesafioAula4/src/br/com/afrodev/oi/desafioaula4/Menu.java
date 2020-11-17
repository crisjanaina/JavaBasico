package br.com.afrodev.oi.desafioaula4;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// ctrl + shift + o
		// para ralizar importação das classes

		// Faça uma alteração nesse código para que o menu só sai quando
		// a opção informada for 0

		Opcoes opcoes = new Opcoes();
		Scanner sc = new Scanner(System.in);
		int escolha = escolherOpcao(sc);
		int idade = 0;
		// Quando a idade ainda não tiver sido informada
		// e entrarem na opção 3
		// Imprima : è necessário informar a idade na opção 2
		// e não execute o código da opção 2.

		
		// retorne a idade da opção 2 e atribua o valor
		//a variável idad da classe Menu
		
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
				Impressora.imprimaValor("Opção escolhida não existe!");
				break;
			}
		
		} while(escolha!= 0);
		
	}

	public static int escolherOpcao(Scanner sc) {

		Impressora.imprimaValor("Opção escolhida não existe!");
		return sc.nextInt();
	}

}
