package br.com.afrodev.oi;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		selecionarOpcao();

	}

	public static void selecionarOpcao() {
		Opcoes opcoes = new Opcoes();
		Scanner sc = new Scanner(System.in);
		Impressora.imprimaValor("Escolha um n�mero de 1 a 3!");

		int numero = sc.nextInt();

		switch (numero) {
		case 1:
			opcoes.selecionarOpcao1();
			break;
		case 2:
			opcoes.selecionarOpcao2();
			break;
		case 3:
			opcoes.selecionarOpcao3();
			break;
		default:
			Impressora.imprimaValor("Op��o escolhida n�o existe!");
			break;
		}

	}

}
