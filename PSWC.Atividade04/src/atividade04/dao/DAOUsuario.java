package atividade04.dao;

import java.util.ArrayList;

import atividade04.basic.Usuario;

public class DAOUsuario implements IDAOUsuario{

	ArrayList<Usuario> usuario = new ArrayList<>();
	
	@Override
	public void inserir(Usuario usuario) throws Exception {
        this.usuario.add(usuario);
	}
	
	@Override
	public ArrayList<Usuario> listar() throws Exception {
		return this.usuario;
	}

	public ArrayList<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(ArrayList<Usuario> usuario) {
		this.usuario = usuario;
	}
}
