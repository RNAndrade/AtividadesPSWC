package atividade04.gui;

import atividade04.basic.Usuario;
import atividade04.dao.DAOUsuario;
import atividade04.fachada.Fachada;

public class Sistema {

	public static void main(String[] args) {
		cadastrarUsuario();
		DAOUsuario dao = new DAOUsuario();
		System.out.println(dao.getUsuario());
	}
	
	private static void cadastrarUsuario() {
		Fachada fachada = new Fachada();
		Usuario user = new Usuario();
		user.setCodigo(1);
		user.setLogin("rnandrade");
		user.setSenha("senha");
		user.setNome("Renato");
		user.setEmail("rnandrade@gmail.com");
		try {
			fachada.addUsuario(user);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
