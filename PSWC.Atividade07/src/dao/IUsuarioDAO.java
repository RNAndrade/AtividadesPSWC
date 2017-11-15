package dao;

import basic.Usuario;

public interface IUsuarioDAO extends IDAOGenerico<Usuario> {
	public Boolean autenticaUsuario(Usuario usuario);

	public Usuario buscarLogin(Usuario u);
}
