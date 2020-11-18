package br.com.afrodev.oi.segundasemana;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tamanho = lerValor("Qual o tamanho do array? ", sc, 0);
		Pessoa p = new Pessoa();
		// Pessoa p = new Pessoa("Nome", 70.2f, 'F');
		// p.setNome("Janaína");
		// crie um Array de pessoas e passem a utiliza-lo no programa

		Pessoa[] pessoas = new Pessoa[tamanho];
		/*
		 * String[] nomes = new String[tamanho]; float[] peso = new float[tamanho];
		 * char[] sexos = new char[tamanho];
		 */
		int opcao = 0;
		int nrRegistro = 0;

		do {
			opcao = lerValor("Informe a opção desejada para acesso:", sc, opcao);
			switch (opcao) {
			case 0:
				System.out.println("Saindo");
				break;
			case 1:
				for (int i = 0; i < tamanho; i++) {
					Pessoa pConsulta = pessoas[i];
					if (pConsulta != null) {
						System.out.printf("Nome: %s \nPeso: %.2f\nSexo: %s\n", pConsulta.getNome(), pConsulta.getPeso(),
								pConsulta.getSexo());
					}
				}
				break;
			case 2:
				for (int i = 0; i < tamanho; i++) {
					System.out.printf("Registro nr %d \n", (i + 1));
					pessoas[i] = adicionarValoresPessoa(pessoas[i], sc);
					System.out.println("-----------------------");
				}
				break;
			case 3:
				nrRegistro = lerValor("Informe o nº do registro para alteração:", sc, nrRegistro);
				pessoas[nrRegistro - 1] = adicionarValoresPessoa(pessoas[nrRegistro - 1], sc);
				break;
			case 4:
				nrRegistro = lerValor("Informe o nº do registro para alteração:", sc, nrRegistro);
				int campoAlterando = lerValor("Qual a opção que deseja alterar ? \n1-Nome;\n2-Peso;\n3-Sexo;", sc, 0);
				pessoas[nrRegistro - 1] = adicionarValoresPessoa(pessoas[nrRegistro - 1], sc, campoAlterando);
				break;
			case 5:
				// Imprimir valores por registro
				nrRegistro = lerValor("Informe o n° de registro para alteração:  ", sc, 0);
				Pessoa pConsulta = pessoas[nrRegistro - 1];
				if (pConsulta != null) {
					System.out.printf("Nome: %s \nPeso: %.2f\nSexo: %s\n", pConsulta.getNome(), pConsulta.getPeso(),
							pConsulta.getSexo());
				}
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}

		} while (opcao != 0);

	}

	private static Pessoa adicionarValoresPessoa(Pessoa p, Scanner sc) {
		if (p == null) {
			p = new Pessoa();
		}
		p.setNome(lerValor("Informe o nome: ", sc));
		p.setPeso(lerValor("Informe seu peso: ", sc, p.getPeso()));
		p.setSexo(lerValor("Informe seu sexo(F/M): ", sc, p.getSexo()));
		return p;
	}

	private static Pessoa adicionarValoresPessoa(Pessoa p, Scanner sc, int campoAlterando) {
		if (p == null) {
			p = new Pessoa();
		}
		if (campoAlterando == 1) {
			p.setNome(lerValor("Informe o nome: ", sc));
		} else if (campoAlterando == 2) {
			p.setPeso(lerValor("Informe seu peso: ", sc, p.getPeso()));
		} else if (campoAlterando == 3) {
			p.setSexo(lerValor("Informe seu sexo(F/M): ", sc, p.getSexo()));
		}
		return p;
	}

	public static String lerValor(String pergunta, Scanner sc) {
		System.out.println(pergunta);
		return sc.next();
	}

	public static Float lerValor(String pergunta, Scanner sc, Float valor) {
		System.out.println(pergunta);
		return sc.nextFloat();
	}

	public static Character lerValor(String pergunta, Scanner sc, Character valor) {
		System.out.println(pergunta);
		String retorno = sc.next();
		return retorno.charAt(0);
	}

	public static Integer lerValor(String pergunta, Scanner sc, Integer valor) {
		System.out.println(pergunta);
		return sc.nextInt();
	}

}
