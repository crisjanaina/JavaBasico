package br.com.afrodev.oi.segundaseamana.models;

//Abstração, Encapsulamento ,Herança, Polimofismo
public class Livro extends ClassePadrao {

	private String nomeLivro;
	private String nomeAutor;
	private String nomeEditora;
	private Integer anoPublicacao;
	private Integer classificacaoLivro;

	public Livro() {

	}

	public Livro(String nomeLivro, String nomeAutor, String nomeEditora, Integer anoPublicacao,
			Integer classificacaoLivro) {
		this.nomeLivro = nomeLivro;
		this.nomeAutor = nomeAutor;
		this.nomeEditora = nomeEditora;
		this.anoPublicacao = anoPublicacao;
		this.classificacaoLivro = classificacaoLivro;

	}

	public String getNomeLivro() {
		return nomeLivro;

	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;

	}

	public String getNomeEditora() {
		return nomeEditora;

	}

	public void setNomeEditora(String nomeEditora) {
		this.nomeEditora = nomeEditora;

	}

	public Integer getAnoPublicacao() {
		return anoPublicacao;

	}

	public void setAnoPublicacao(Integer anoPublicacao) {
		this.anoPublicacao = anoPublicacao;

	}

	public Integer getClassificacaoLivro() {
		return classificacaoLivro;

	}

	public void setClassificacaoLivro(Integer classificacaoLivro) {
		this.classificacaoLivro = classificacaoLivro;

	}

}
