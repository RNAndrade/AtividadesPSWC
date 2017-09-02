package atividade04.gui;

import atividade04.basic.Usuario;
import atividade04.fachada.Fachada;

public class Sistema {

	public static void main(String[] args) {

		Fachada fachada = new Fachada();
		Usuario user = new Usuario(4, "mpereira", "senha", "Maria Pereira", "mpereira@gmail.com");;
		
		try {
			fachada.logar("rnandrade", "senha");
			fachada.cadastrarUsuario(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
