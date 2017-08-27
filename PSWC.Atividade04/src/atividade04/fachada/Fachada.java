package atividade04.fachada;

import java.util.ArrayList;

import atividade04.basic.Usuario;
import atividade04.negocio.RNUsuario;

public class Fachada implements IFachada {

	RNUsuario user = new RNUsuario();
	ArrayList<Usuario> usuario = new ArrayList<>();

	@Override
	public ArrayList<Usuario> addUsuario(Usuario usuario) throws Exception {
		user.addUsuario(usuario);
		return this.usuario;
	}

}
