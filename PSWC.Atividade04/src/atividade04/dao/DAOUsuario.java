package atividade04.dao;

import java.util.ArrayList;

import atividade04.basic.Usuario;

public class DAOUsuario implements IDAOUsuario{

	ArrayList<Usuario> usuario = new ArrayList<>();
	
	@Override
	public ArrayList<Usuario> addUsuario(Usuario usuario) throws Exception {
        this.usuario.add(usuario);
        return this.usuario;
	}

	public ArrayList<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(ArrayList<Usuario> usuario) {
		this.usuario = usuario;
	}
}
