package atividade04.negocio;

import java.util.ArrayList;

import atividade04.basic.Usuario;
import atividade04.dao.DAOUsuario;

public class RNUsuario implements IRNUsuario {

	DAOUsuario dao = new DAOUsuario();
	ArrayList<Usuario> usuario = new ArrayList<>();
	
	@Override
	public ArrayList<Usuario> addUsuario(Usuario usuario) throws Exception {
		dao.addUsuario(usuario);
		return this.usuario;
	}

}
