package atividade04.dao;

import java.util.ArrayList;

import atividade04.basic.Usuario;

public class DAOUsuario implements IDAOUsuario {

	ArrayList<Usuario> usuarios = new ArrayList<>();

	public DAOUsuario() {
		super();
		this.cadastroInicial();
	}

	@Override
	public void inserir(Usuario usuario) throws Exception {
		this.usuarios.add(usuario);
	}

	@Override
	public ArrayList<Usuario> listar() throws Exception {
		return this.usuarios;
	}

	@Override
	public Usuario pesquisar(String login) throws Exception {
		Usuario user = new Usuario();
		for (Usuario usuario : usuarios) {
			if (usuario.getLogin() == login) {
				user = usuario;
			}
		}
		return user;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuario) {
		this.usuarios = usuario;
	}

	public void cadastroInicial() {
		Usuario user1 = new Usuario(1, "rnandrade", "senha", "Renato Andrade", "rnandrade@gmail.com");
		Usuario user2 = new Usuario(2, "jsilva", "senha", "José Silva", "jsilva@gmail.com");
		Usuario user3 = new Usuario(3, "moliveira", "senha", "Mario Oliveira", "moliveira@gmail.com");
		try {
			this.inserir(user1);
			this.inserir(user2);
			this.inserir(user3);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
