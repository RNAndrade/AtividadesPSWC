package atividade04.dao;

import java.util.ArrayList;

import atividade04.basic.Usuario;

public interface IDAOUsuario {

	public void inserir(Usuario usuario) throws Exception;
	
	public ArrayList<Usuario> listar() throws Exception;
	
	public Usuario pesquisar(String login) throws Exception;
}
