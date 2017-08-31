package atividade04.gui;

import atividade04.basic.Usuario;
import atividade04.dao.DAOUsuario;
import atividade04.fachada.Fachada;

public class Sistema {

	public static void main(String[] args) {
		Usuario user1 = new Usuario(1, "rnandrade", "senha", "Renato Andrade", "rnandrade@gmail.com");
		Usuario user2 = new Usuario(2, "rnandrade", "senha", "Renato Andrade", "rnandrade@gmail.com");
		Usuario user3 = new Usuario(3, "rnandrade", "senha", "Renato Andrade", "rnandrade@gmail.com");
		Fachada fachada = new Fachada();
		try {
			fachada.addUsuario(user1);
			fachada.addUsuario(user2);
			fachada.addUsuario(user3);
			for (Usuario users : fachada.listar()) {
				System.out.println("Código: " + users.getCodigo() + " Nome: " + users.getNome() + " Login: " + users.getLogin());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
