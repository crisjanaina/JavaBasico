package br.com.afrodev.oi;

import java.util.Scanner;

public class TreinandoScanner {

	public static void main(String[] args) {
		/*
		 * Crie um programa que leia o seu String nome; int idade; float peso; Imprimir
		 * Meu nome é ... Minha idade é ... Meu peso é ... Realize um teste com o if:
		 * Caso peso seja maior que 80 imprimir : Vocé precisa correr mais. Caso peso
		 * seja menor : Coma mais carboidratos. Adicione toda a cadeia de codigo que
		 * criamos em uma estrutura while enquanto o valor de controle for "C"
		 * 
		 * ++ é o mesmo que somar +1 -- é o mesmo que diminuir -1
		 */

		String controle = "C";
		Scanner sc = new Scanner(System.in);
		while (controle.equals("C")) {

			System.out.print("Qual o seu nome? ");
			String nome = sc.nextLine();
			System.out.print("Quantos anos você tem? ");
			int idade = sc.nextInt();
			System.out.print("Qual o seu peso? ");
			float peso = sc.nextFloat();

			System.out.printf("\nMeu nome é %s \nMinha idade é %d \nMeu peso é %.2f \n", nome, idade, peso);

			// metodo verificaIdade(peso,idade,nome) dentro da classe TreinandoScanner
			verificarIdadeEPeso(peso, idade, nome);
			// metodo verificaIdadeComSwitch(idade) dentro da classe TreinandoScanner
			verificaIdadeComSwitch(idade);
		}
	}

	public static void verificarIdadeEPeso(float peso, int idade, String nome) {

		if ((idade > 80 && peso < 35) || nome.startsWith("Ja")) {
			System.out.println("Você precisa comer!!!");
		} else {
			System.out.println("Pode comer, mas coma com moderação ");
		}

	}

	public static void verificaIdadeComSwitch(int idade) {
		switch (idade) {
		case 80:
			System.out.println("Você está idoso!");
			break;
		case 40:
			System.out.println("Você está maduro!");
			break;
		default:
			System.out.println("Talvez você seja jovem!");
			break;
		}
	}
}
