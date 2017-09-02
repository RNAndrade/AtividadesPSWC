package atividade04.negocio;

import java.util.ArrayList;

import javax.swing.JOptionPane;

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
			JOptionPane.showMessageDialog(null, "Campos obrigatórios não informados!");
		} else {
			if (aux.getLogin() == null) {
				JOptionPane.showMessageDialog(null, "Login inválido!");
			} else {
				if (aux.getSenha() == senha) {
					JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
				} else {
					JOptionPane.showMessageDialog(null, "Senha inválida!");
				}
			}
		}
	}

	public void cadastrarUsuario(Usuario usuario) throws Exception {
		Usuario aux = dao.pesquisar(usuario.getLogin());
		if (aux.getLogin() == usuario.getLogin()) {
			JOptionPane.showMessageDialog(null, "Login indisponível!");
		} else {
			this.inserir(usuario);
			/*
			 * ArrayList<Usuario> u = this.listar(); for (int i = 0; i < u.size(); i++) {
			 * System.out.println(u.get(i)); }
			 */
			JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
		}
	}
}
