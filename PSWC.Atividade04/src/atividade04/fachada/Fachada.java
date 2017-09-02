package atividade04.fachada;

import atividade04.basic.Usuario;
import atividade04.negocio.RNUsuario;

public class Fachada implements IFachada {

	RNUsuario user = new RNUsuario();

	public Fachada() {
		super();
		user = new RNUsuario();
	}
	
	@Override
	public void logar(String login, String senha) throws Exception {
		user.logar(login, senha);
	}
	
	public void cadastrarUsuario(Usuario usuario) throws Exception {
			user.cadastrarUsuario(usuario);
	}

}
