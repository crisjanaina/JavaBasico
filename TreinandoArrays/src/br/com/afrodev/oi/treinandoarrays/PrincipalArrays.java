package br.com.afrodev.oi.treinandoarrays;

import java.util.Scanner;

public class PrincipalArrays {

	public static void main(String[] args) {

		String[] nomes = { "Marcus", "Janaína", "Renata", "Patricia", "Samuel" };
		int[] idades = { 10, 20, 30, 40, 50 };
		// começa sempre mo 0
		// imprima nome e idade percorrendo os arrays

		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i] + " tem " + idades[i] + " anos! ");

		}

		// Alterar os valores das posições pares
		// utilizando arrays[posicao] = valor;
		// usar o scanner

		Scanner sc = new Scanner(System.in);
		int controle = 0;
		//boolean verificador = false;
		for (String nome : nomes) {
			System.out.println(nome);
			if (controle % 2 == 0) {
				nome = sc.nextLine();
				System.out.println(nome);
				nomes[controle]= nome;
			}
			controle++;
		}

		// Alterar os valores das posições impares
		// utilizando arrays[posicao] = valor;
		// usar o scanner

		for (int idade : idades) {
			System.out.println(idade);
			if (controle % 2 != 0) {
				idade = sc.nextInt();
				System.out.println(idade);
				idades[controle]= idade;
			}
			controle++;
		}

	}
}
