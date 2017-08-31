package atividade04.negocio;

import java.util.ArrayList;

import atividade04.basic.Usuario;

public interface IRNUsuario {

	public void inserir(Usuario usuario) throws Exception;
	
	public ArrayList<Usuario> listar() throws Exception;
}
