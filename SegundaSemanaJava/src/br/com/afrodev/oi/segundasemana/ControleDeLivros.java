package br.com.afrodev.oi.segundasemana;

import java.util.Scanner;

import br.com.afrodev.oi.segundasemana.models.Livro;
import br.com.afrodev.oi.segundasemana.util.Leitor;

public class ControleDeLivros {

	public static Livro editarRegistroDeLivro(Livro livro, Scanner sc) {
		int opcaoEdicao = 0;
		if (livro != null) {
			do {
				opcaoEdicao = Leitor.lerValor("Qual informa��o voc� deseja editar?"
						+ "\n1) Nome\n2) Autor\n3) Classifica��o\n4) Editora\n" + "5) Ano de publica��o\n", sc,
						opcaoEdicao);
				switch (opcaoEdicao) {
				case 0:
					System.out.println("Saindo da edi��o..");
					break;
				case 1:
					livro.setNomeLivro(Leitor.lerValor("Qual o nome do livro ? ", sc));
					System.out.println("Nome editado com sucesso!");
					break;
				case 2:
					livro.setNomeAutor(Leitor.lerValor("Qual o autor ? ", sc));
					System.out.println("Autor editado com sucesso!");
					break;
				case 3:
					livro.setClassificacaoLivro(
							Leitor.lerValor("Qual a classifica��o ? ", sc, livro.getClassificacaoLivro()));
					System.out.println("Classifica��o editada com sucesso!");
					break;
				case 4:
					livro.setNomeEditora(Leitor.lerValor("Qual a editora ? ", sc));
					System.out.println("Editora editada com sucesso!");
					break;
				case 5:
					livro.setAnoPublicacao(
							Leitor.lerValor("Qual o ano de publica��o ? ", sc, livro.getAnoPublicacao()));
					System.out.println("Ano de publica��o editado com sucesso!");
					break;
				default:
					break;
				}
			} while (opcaoEdicao != 0);

		} else {
			System.out.println("N�o existe registro com esse Nr�!");
		}
		return livro;
	}

	public static Livro criarRegistroDeLivro(Livro livro, Scanner sc) {
		if (livro == null) {
			livro = new Livro();
			livro.setNomeLivro(Leitor.lerValor("Qual o nome do livro ? ", sc));
			livro.setNomeAutor(Leitor.lerValor("Qual o autor ? ", sc));
			livro.setClassificacaoLivro(Leitor.lerValor("Qual a classifica��o ? ", sc, livro.getClassificacaoLivro()));
			livro.setNomeEditora(Leitor.lerValor("Qual a editora ? ", sc));
			livro.setAnoPublicacao(Leitor.lerValor("Qual o ano de publica��o ? ", sc, livro.getAnoPublicacao()));
		} else {
			System.out.println("J� existe um registro com esse Nr�!");
		}
		return livro;
	}

	public static void imprimirLivros(Livro[] livros) {
		Boolean verificaSeTemValor = false;
		for (Livro l : livros) {
			if (l != null) {
				verificaSeTemValor = true;
				System.out.printf("Nome: %s\nAutor: %s\nAno de Publica��o: %d\nClassifica��o: %d\nEditora: %s\n",
						l.getNomeAutor(), l.getNomeAutor(), l.getAnoPublicacao(), l.getClassificacaoLivro(),
						l.getNomeEditora());
				System.out.println("--------------------------");
			}
		}
		if (!verificaSeTemValor) {
			System.out.println("Nenhum livro Cadastrado!");
		}
	}

	public static void imprimirRegistro(Livro l) {

		if (l != null) {
			System.out.printf("Nome: %s\nAutor: %s\nAno de Publica��o: %d\nClassifica��o:" + " %d\nEditora: %s\n",
					l.getNomeAutor(), l.getNomeAutor(), l.getAnoPublicacao(), l.getClassificacaoLivro(),
					l.getNomeEditora());
			System.out.println("--------------------------");
		} else {
			System.out.println("Nenhum livro Cadastrado!");
		}
	}

	public static Livro deletarRegistro(Livro livro) {
		if (livro != null) {
			System.out.println("Registro deletado com sucesso!");
		} else {
			System.out.println("N�o existe registro!");
		}
		return null;
	}

}
