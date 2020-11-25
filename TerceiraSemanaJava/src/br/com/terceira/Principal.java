package br.com.terceira;

import br.com.terceiro.dao.UsuarioDAO;
import br.com.terceiro.models.Usuario;

public class Principal {
	
	public static void main(String[] args) {

		UsuarioDAO dao = new UsuarioDAO();
		Usuario u = new Usuario();
		u.setNmeUsuario("Janaína Maciel");
		u.setUsrUsuario("janaina.maciel");
		u.setIdt(dao.cadastrarUsuario(u, "3107").longValue());
		dao.verificarUsuarioESenha(u.getUsrUsuario(), "3107");
		u.setNmeUsuario("Janaína Maciel");
		dao.editarUsuario(u);
		u = dao.buscarUsuario(u.getIdt());
		System.out.println(u.getNmeUsuario());
		
		/**
		 * Crie um método login: Retorna true (Caso usuário e senha esteja correto) e
		 * false(Quando usuário e senha estiver errado) Informe "Login realizado com
		 * sucesso!" caso true ou Seu Usuário ou senha Estão incorretos, informe
		 * novamente. (crie um loop com a opção para sair)
		 */

	}

}
