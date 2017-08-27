package atividade04.fachada;

import java.util.ArrayList;

import atividade04.basic.Usuario;

public interface IFachada {

	public ArrayList<Usuario> addUsuario(Usuario usuario) throws Exception;
}
