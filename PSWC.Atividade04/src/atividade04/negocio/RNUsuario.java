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
		return dao.getUsuarios();
	}

	@Override
	public Usuario pesquisar(String login) throws Exception {
		return dao.pesquisar(login);
	}

	@Override
	public void logar(String login, String senha) throws Exception {
		Usuario aux = dao.pesquisar(login);

		if (login.isEmpty() || senha.isEmpty()) {
			System.out.println("Campos obrigatórios não informados!");
		} else {
			if (aux.getLogin() == null) {
				System.out.println("Login inválido!");
			} else {
				if (aux.getSenha() == senha) {
					System.out.println("Login realizado com sucesso!");
				} else {
					System.out.println("Senha inválida!");
				}
			}
		}
	}

	public void cadastrarUsuario(Usuario usuario) throws Exception {
		Usuario aux = dao.pesquisar(usuario.getLogin());
		if (aux.getLogin() == usuario.getLogin()) {
			System.out.println("Login indisponível!");
		} else {
			this.inserir(usuario);
			/*
			 * ArrayList<Usuario> u = this.listar(); for (int i = 0; i < u.size(); i++) {
			 * System.out.println(u.get(i)); }
			 */
			System.out.println("Usuário cadastrado com sucesso!");
		}
	}
}
