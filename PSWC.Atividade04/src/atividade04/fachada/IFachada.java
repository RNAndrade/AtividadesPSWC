package atividade04.fachada;

import java.util.ArrayList;

import atividade04.basic.Usuario;

public interface IFachada {

	public void addUsuario(Usuario usuario) throws Exception;
	
	public ArrayList<Usuario> listar() throws Exception;
}
