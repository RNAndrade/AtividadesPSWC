package atividade04.negocio;

import java.util.ArrayList;

import atividade04.basic.Usuario;
import atividade04.dao.DAOUsuario;

public class RNUsuario implements IRNUsuario {

	DAOUsuario dao = new DAOUsuario();
	
	@Override
	public void inserir(Usuario usuario) throws Exception {
		dao.inserir(usuario);
	}

	@Override
	public ArrayList<Usuario> listar() throws Exception {
		return dao.getUsuario();
	}

}
