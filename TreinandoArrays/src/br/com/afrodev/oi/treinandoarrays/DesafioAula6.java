package br.com.afrodev.oi.treinandoarrays;

import java.util.Scanner;

public class DesafioAula6 {

	public static String lerValor(String pergunta, Scanner sc) {
		System.out.println(pergunta);
		return sc.next();
	}

	public static float lerValor(String pergunta, Scanner sc, float valor) {
		System.out.println(pergunta);
		return sc.nextFloat();
	}

	public static char lerValor(String pergunta, Scanner sc, char valor) {
		System.out.println(pergunta);
		String retorno = sc.next();
		return retorno.charAt(0);
	}

	public static int lerValor(String pergunta, Scanner sc, int valor) {
		System.out.println(pergunta);
		return sc.nextInt();
	}

	public static void main(String[] args) {
		/**
		 * Crie 3 arrays com 6 posições primeiro array com nomes (String) segundo array
		 * com peso(float) terceiro array com sexo (char)//F,M
		 */

		/*
		 * String[] nomes = { "", "", "", "", "", "" }; float[] peso = { 0, 0, 0, 0, 0,
		 * 0 }; char[] sexos = { 'N', 'N', 'N', 'N', 'N', 'N' };
		 */

		// Crie um menu usando o switch com as opções do tipo (1 a 3)
		// apresentar todos os valores do Array
		// alterar todo o Array. Alterar por posição

		Scanner sc = new Scanner(System.in);
		int tamanho = lerValor("Qual o tamanho do array? ", sc, 0);

		String[] nomes = new String[tamanho];
		float[] peso = new float[tamanho];
		char[] sexos = new char[tamanho];
		int opcao = 0;
		int nrRegistro = 0;

		// Adicione valores dentro de cada posição do array

		/*
		 * int opcao = 0; switch (opcao) { case 1: for (int i = 0; i < 6; i++) {
		 * System.out.printf("Nome: %s \n ", nomes[i]);
		 * System.out.printf("Nome: %.2f \n ", peso[i]);
		 * System.out.printf("Nome: %s \n ", sexos[i]); } break; case 2: for (int i = 0;
		 * i < tamanho; i++) {
		 * 
		 * System.out.printf("Registro nr %d \n", (i + 1));
		 * System.out.println("Informe seu nome:  "); nomes[i] = sc.nextLine();
		 * System.out.println("Informe seu peso: "); peso[i] = sc.nextFloat();
		 * System.out.println("Informe seu sexo(F/M): "); String sexo = sc.nextLine();
		 * sexos[i] = sexo.charAt(0); System.out.println("..............."); } break;
		 * case 3: System.out.println("Informe o n° de registro para alteração:  "); int
		 * nrRegistro = sc.nextInt(); System.out.println("Informe o nome: ");
		 * nomes[nrRegistro - 1] = sc.nextLine();
		 * System.out.println("Informe seu peso: "); peso[nrRegistro - 1] =
		 * sc.nextFloat(); System.out.println("Informe seu sexo(F/M): "); String sexo =
		 * sc.nextLine(); sexos[nrRegistro - 1] = sexo.charAt(0);
		 * 
		 * break; default: System.out.println("Opção inválida!"); break; } }
		 * 
		 * }
		 */

		do {
			opcao = lerValor("Informe a opção desejada para acesso:", sc, opcao);
			switch (opcao) {
			case 0:
				System.out.println("Saindo");
				break;
			case 1:
				for (int i = 0; i < tamanho; i++) {
					System.out.printf("Nome: %s \nPeso: %.2f\nSexo: %s\n", nomes[i], peso[i], sexos[i]);
				}
				break;
			case 2:
				for (int i = 0; i < tamanho; i++) {

					System.out.printf("Registro nr %d \n", (i + 1));
					adicionarValoresArray(nomes, peso, sexos, i, sc);
					System.out.println("-----------------------");
	
				}
				break;
			case 3:
				nrRegistro = lerValor("Informe o nº do registro para alteração:", sc, nrRegistro);
				adicionarValoresArray(nomes, peso, sexos, (nrRegistro - 1), sc);
				break;
			case 4:
				
				nrRegistro = lerValor("Informe o nº do registro para alteração:", sc, nrRegistro);
				int campoAlterando = sc.nextInt();
				adicionarValoresArray(nomes, peso, sexos, (nrRegistro - 1), sc, campoAlterando);
				break;
			case 5:
				// Imprimir valores por registro
				nrRegistro = lerValor("Informe o n° de registro para alteração:  ", sc, 0);
				System.out.printf("Nome: %s\nPeso: %.2f\nSexo: %s", nomes[nrRegistro - 1], peso[nrRegistro - 1],
						sexos[nrRegistro - 1]);
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}

		} while (opcao != 0);

	}

	private static void adicionarValoresArray(String[] nomes, float[] peso, char[] sexos, int i, Scanner sc) {
		nomes[i] = lerValor("Informe o nome: ", sc);
		peso[i] = lerValor("Informe seu peso: ", sc, peso[i]);
		sexos[i] = lerValor("Informe seu sexo(F/M): ", sc, sexos[i]);
	}

	private static void adicionarValoresArray(String[] nomes, float[] peso, char[] sexos, int i, Scanner sc,
			int campoAlterando) {
		if (campoAlterando == 1) {
			nomes[i] = lerValor("Informe o nome: ", sc);
		} else if (campoAlterando == 2) {
			peso[i] = lerValor("Informe seu peso: ", sc, peso[i]);
		} else if (campoAlterando == 3) {
			sexos[i] = lerValor("Informe seu sexo(F/M): ", sc, sexos[i]);
		}
	}
}
