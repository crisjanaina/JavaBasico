package br.com.afrodev.oi.treinandofor;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String[] a = "Janaína".split("");
		String[] b = { "j", "a", "n", "a", "i", "n", "a" };
		String text = "Marcus, Fabiana, Renata, Sam";

		String[] nome = text.split(",");
		for (String i : nome) {
			System.out.println(i);
		}

		// Verifique se uma string tem o tamanho
		// maior que 10 usando o for
		// Quando a String tiver a letra "a" pule
		// 2 caracteres se possível
		Scanner sc = new Scanner(System.in);
		String texto = sc.nextLine();

		/*
		 * System.out.println(texto.substring(0, 1));
		 * 
		 * for (int i = 0; i < texto.length(); i++) { if (i == 8) {
		 * System.out.print("O tamanho da String é maior que 10"); }
		 * System.out.println(texto.substring(i, (i + 1))); // i++ = i = i + 1 // (i+1),
		 * o i não é alterado
		 * 
		 * if (texto.substring(i, (i + 1)).toLowerCase().equals("a") && (i + 2) <
		 * texto.length()) { i = i + 2;
		 * 
		 * }
		 * 
		 * }
		 */

		for (int i = 0; i < texto.length(); i++) {

			System.out.println(texto.substring(i, (i + 1)));
			if (texto.substring(i, (i + 1)).toLowerCase().equals("a") && (i + 2) < texto.length()) {
				i = i + 2;
			}
		}
		
		int controleAchouA = 0;
		// contains... verifica se a String contem o caracter informado.
		// break - para o for
		// continue - ele volta para o inicio do for
		for (String a1: texto.split("")) {
			if (controleAchouA == 0) {
				System.out.println(a1);
			} else {
				controleAchouA--;
			}
			if (a1.toLowerCase().contains("a")) {
				controleAchouA = 2;
			}
		}
		for (String a1 : texto.split("")) {
			if (a1.toLowerCase().contains("b")) {
				System.out.print("Encontrei um b");
				continue;
			}
			System.out.println("Não encontrei um b");
		}
		for (String a1 : texto.split("")) {
			if (a1.toLowerCase().contains("b")) {
				System.out.print("Encontrei um b");
				break;
			}
			System.out.println("Não encontrei um b");
		}
	}

}
