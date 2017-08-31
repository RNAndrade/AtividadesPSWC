package atividade04.negocio;

import atividade04.basic.Usuario;
import atividade04.dao.DAOUsuario;

public class RNUsuario implements IRNUsuario {

	DAOUsuario dao = new DAOUsuario();
	
	@Override
	public void addUsuario(Usuario usuario) throws Exception {
		dao.addUsuario(usuario);
	}

}
