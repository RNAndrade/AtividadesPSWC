package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import basic.Usuario;

public class UsuarioDAO extends DAOGenerico<Usuario> implements IUsuarioDAO {

	public UsuarioDAO(EntityManagerFactory emf) {
		super(emf);
	}

	@Override
	public Boolean autenticaUsuario(Usuario usuario) throws NoResultException {
		EntityManager entityManager = DAOFactory.getInstance().createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Query usuarioQuery = entityManager.createQuery("from Usuario u where u.login = :login and u.senha = :senha");
		usuarioQuery.setParameter("login", usuario.getLogin());
		usuarioQuery.setParameter("senha", usuario.getSenha());
		try {
			return usuarioQuery.getSingleResult() != null;
		} catch (NoResultException e) {
			return false;
		}
	}

	@Override
	public Usuario buscarLogin(Usuario u) {
		EntityManager entityManager = DAOFactory.getInstance().createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Query usuarioQuery = entityManager.createQuery("from Usuario u where u.login = :login");
		usuarioQuery.setParameter("login", u.getLogin());
		return (Usuario) usuarioQuery.getSingleResult();
	}
}
