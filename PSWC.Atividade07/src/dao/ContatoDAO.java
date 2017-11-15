package dao;

import javax.persistence.EntityManagerFactory;
import basic.Contato;

public class ContatoDAO extends DAOGenerico<Contato> implements IContatoDAO{

	public ContatoDAO(EntityManagerFactory emf) {
		super(emf);
	}
}
