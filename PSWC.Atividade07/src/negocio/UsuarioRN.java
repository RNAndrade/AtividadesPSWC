package negocio;

import basic.Usuario;
import dao.DAOFactory;
import dao.UsuarioDAO;

public class UsuarioRN {

	UsuarioDAO dao;

	public UsuarioRN() {
		this.dao = new UsuarioDAO(DAOFactory.getInstance());
	}

	public void novoUsuario(Usuario u) {
		dao.inserir(u);
	}

	public Boolean logar(Usuario u) {
		return dao.autenticaUsuario(u);
	}

}
