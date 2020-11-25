package br.com.terceira;

import br.com.terceiro.dao.UsuarioDAO;
import br.com.terceiro.models.Usuario;

public class Principal {
	
	public static void main(String[] args) {

		UsuarioDAO dao = new UsuarioDAO();
		Usuario u = new Usuario();
		u.setNmeUsuario("Jana�na Maciel");
		u.setUsrUsuario("janaina.maciel");
		u.setIdt(dao.cadastrarUsuario(u, "3107").longValue());
		dao.verificarUsuarioESenha(u.getUsrUsuario(), "3107");
		u.setNmeUsuario("Jana�na Maciel");
		dao.editarUsuario(u);
		u = dao.buscarUsuario(u.getIdt());
		System.out.println(u.getNmeUsuario());
		
		/**
		 * Crie um m�todo login: Retorna true (Caso usu�rio e senha esteja correto) e
		 * false(Quando usu�rio e senha estiver errado) Informe "Login realizado com
		 * sucesso!" caso true ou Seu Usu�rio ou senha Est�o incorretos, informe
		 * novamente. (crie um loop com a op��o para sair)
		 */

	}

}
