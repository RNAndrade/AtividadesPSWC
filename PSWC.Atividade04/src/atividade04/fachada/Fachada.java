package atividade04.fachada;

import java.util.ArrayList;

import atividade04.basic.Usuario;
import atividade04.negocio.RNUsuario;

public class Fachada implements IFachada {

	RNUsuario user = new RNUsuario();

	@Override
	public void addUsuario(Usuario usuario) throws Exception {
		user.inserir(usuario);
	}

	@Override
	public ArrayList<Usuario> listar() throws Exception {
		return user.listar();
	}

}
