package br.com.afrodev.oi;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String[] a = "Jana�na".split("");
		String[] b = { "j", "a", "n", "a", "i", "n", "a" };
		String text = "Marcus, Fabiana, Renata, Sam";

		String[] nome = text.split(",");
		for (String i : nome) {
			System.out.println(i);
		}

		// Verifique se uma string tem o tamanho
		// maior que 10 usando o for
		// Quando a String tiver a letra "a" pule
		// 2 caracteres se poss�vel
		Scanner sc = new Scanner(System.in);
		String texto = sc.nextLine();

		System.out.println(texto.substring(0, 1));

		for (int i = 0; i < texto.length(); i++) {
			if (i == 8) {
				System.out.print("O tamanho da String � maior que 10");
			}
			System.out.println(texto.substring(i, (i + 1)));
			// i++ = i = i + 1
			// (i+1), o i n�o � alterado

			if (texto.substring(i, (i + 1)).toLowerCase().equals("a") && (i + 2) < texto.length()) {
				i = i + 2;

			}

		}

	}
}
