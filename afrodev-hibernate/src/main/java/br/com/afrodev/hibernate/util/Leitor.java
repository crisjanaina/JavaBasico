package br.com.afrodev.hibernate.util;

import java.util.Scanner;

public class Leitor {

	public static String lerValor(String pergunta, Scanner sc) {
		System.out.println(pergunta);
		return sc.nextLine();
	}

	public static Float lerValor(String pergunta, Scanner sc, Float valor) {
		System.out.println(pergunta);
		return Float.parseFloat(sc.nextLine());
	}

	public static Integer lerValor(String pergunta, Scanner sc, Integer valor) {
		System.out.println(pergunta);
		return Integer.parseInt(sc.nextLine());
	}

	public static Character lerValor(String pergunta, Scanner sc, Character valor) {
		System.out.println(pergunta);
		String retorno = sc.nextLine();
		return retorno.charAt(0);
	}

	public static Boolean lerValor(String pergunta, Scanner sc, Boolean b) {

		String retorno = "";
		do {
			System.out.println(pergunta);
			retorno = sc.nextLine();
		} while (!retorno.toUpperCase().equals("SIM") && !retorno.toUpperCase().equals("NAO"));
		if (retorno.toUpperCase().equals("SIM")) {
			return true;
		} else {
			return false;
		}
	}

	public static Long lerValor(String pergunta, Scanner sc, Long l) {
		System.out.println(pergunta);
		return Long.parseLong(sc.nextLine());
	}

}
