/**
 * 
 */
package br.com.afrodev.oi.segundasemana;

import java.util.Scanner;

/**
 * @author Janaína
 *
 */
public class MenuLivro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Livro Livro = new Livro();
		// para definir o tamanho do Array de livro
		int tamanho = lerValor("Qual o tamanho do registro para cadastrar os livros? ", sc, 0);
		Livro[] livros = new Livro[tamanho];

		int opcao = 0;
		int nrRegistro = 0;

		do {
			opcao = lerValor(
					"Informe a opção desejada para acesso:  \nOpção 0: Saíra do menu! \nOpção 1: Continuará apresentando a mensagem 'Informe a opção desejada para acesso, caso não tenha livro cadastrado!' \nOpção 2: Cadastrar as informações sobre o livro \nOpção 3: Editar livro por nº de registro \nOpção 4: Editar livro por atributo(Nome do livro, Nome do Autor,Nome da Editora, Ano da Publicação ou Ano da Classificação) \nOpção 5: Imprimir valores por registro \nOpção 6: Selecionar registro a ser deletado ",
					sc, opcao);
			switch (opcao) {
			case 0:
				System.out.println("Saindo");
				break;
			case 1:
				for (int i = 0; i < tamanho; i++) {
					Livro consultaLivro = livros[i];
					if (consultaLivro != null) {
						System.out.printf(
								"Nome do livro: %s \nNome do(a) autor(a) %s \nNome da editora %s \nAno da publicação %d \nClassificação do livro %d",
								consultaLivro.getNomeLivro(), consultaLivro.getNomeAutor(),
								consultaLivro.getNomeEditora(), consultaLivro.getAnoPublicacao(),
								consultaLivro.getClassificacaoLivro());
					}
				}
				break;
			case 2:
				for (int i = 0; i < tamanho; i++) {
					System.out.printf("Registro nr %d \n", (i + 1));
					livros[i] = adicionarValoresLivro(livros[i], sc);
					System.out.println("-----------------------");
				}
				break;
			case 3:
				nrRegistro = lerValor("Informe o nº do registro para alteração:", sc, nrRegistro);
				livros[nrRegistro - 1] = adicionarValoresLivro(livros[nrRegistro - 1], sc);
				break;
			case 4:
				nrRegistro = lerValor("Informe o nº do registro para alteração:", sc, nrRegistro);
				int campoAlterando = lerValor(
						"Qual a opção que deseja alterar ? \n1-Nome do livro;\n2-Nome do Autor;\n3-Nome da editora;\n4-Ano da publicação;\n5-Classificação do livro",
						sc, 0);
				livros[nrRegistro - 1] = adicionarValoresLivro(livros[nrRegistro - 1], sc, campoAlterando);
				break;
			case 5:
				// Imprimir valores por registro
				nrRegistro = lerValor("Informe o n° de registro para alteração:  ", sc, 0);
				Livro consultaLivro = livros[nrRegistro - 1];
				if (consultaLivro != null) {
					System.out.printf(
							"Nome do livro: %s \nNome do(a) autor(a): %s \nNome da editora: %s \nAno da publicação: %d \nClassificação do livro: %d \n \n",
							consultaLivro.getNomeLivro(), consultaLivro.getNomeAutor(), consultaLivro.getNomeEditora(),
							consultaLivro.getAnoPublicacao(), consultaLivro.getClassificacaoLivro());
					
				}
				break;
			case 6:
				nrRegistro = lerValor("Informe o nº do registro a ser deletado:", sc, nrRegistro);
				livros[nrRegistro - 1] = null;
				System.out.println(livros[nrRegistro - 1]);
				break;
			default:
				System.out.println("Opção inexistente!");
				break;
			}

		} while (opcao != 0);

	}

	private static Livro adicionarValoresLivro(Livro livros, Scanner sc) {
		if (livros == null) {
			livros = new Livro();
		}
		livros.setNomeLivro(lerValor("Informe o nome do livro: ", sc));
		livros.setNomeAutor(lerNomeAutor("Informe o nome do(a) autor(a) ", sc, livros.getNomeAutor()));
		livros.setNomeEditora(lerNomeEditora("Informe o nome da Editora: ", sc, livros.getNomeEditora()));
		livros.setAnoPublicacao(
				lerAnopublicacao("Informe o ano da publicação do livro", sc, livros.getAnoPublicacao()));
		livros.setClassificacaoLivro(
				lerClassificacaoLivro("Informe a classificação do livro", sc, livros.getClassificacaoLivro()));
		return livros;
	}

	private static Livro adicionarValoresLivro(Livro livros, Scanner sc, int campoAlterando) {
		if (livros == null) {
			livros = new Livro();
		}
		if (campoAlterando == 1) {
			livros.setNomeLivro(lerValor("Informe o nome do livro: ", sc));
		} else if (campoAlterando == 2) {
			livros.setNomeAutor(lerNomeAutor("Informe o nome do autor do livro: ", sc, livros.getNomeAutor()));
		} else if (campoAlterando == 3) {
			livros.setNomeEditora(lerNomeEditora("Informe o nome do(a) autor(a): ", sc, livros.getNomeEditora()));
		} else if (campoAlterando == 4) {
			livros.setAnoPublicacao(
					lerAnopublicacao("Informe o ano da publicação do livro", sc, livros.getAnoPublicacao()));
		} else if (campoAlterando == 5) {
			livros.setClassificacaoLivro(
					lerClassificacaoLivro("Informe a classificação do livro", sc, livros.getClassificacaoLivro()));
		}

		return livros;
	}

	public static String lerValor(String pergunta, Scanner sc) {
		System.out.println(pergunta);
		return sc.next();
	}

	public static Integer lerValor(String pergunta, Scanner sc, Integer valor) {
		System.out.println(pergunta);
		return sc.nextInt();
	}

	public static String lerNomeLivro(String pergunta, Scanner sc, String nomeLivro) {
		System.out.println(pergunta);
		return sc.next();
	}

	public static String lerNomeAutor(String pergunta, Scanner sc, String nomeAutor) {
		System.out.println(pergunta);
		return sc.next();
	}

	public static String lerNomeEditora(String pergunta, Scanner sc, String nomeEditora) {
		System.out.println(pergunta);
		return sc.next();
	}

	public static Integer lerAnopublicacao(String pergunta, Scanner sc, Integer anopublicacao) {
		System.out.println(pergunta);
		return sc.nextInt();
	}

	public static Integer lerClassificacaoLivro(String pergunta, Scanner sc, Integer classificacaoLivro) {
		System.out.println(pergunta);
		return sc.nextInt();
	}

}
