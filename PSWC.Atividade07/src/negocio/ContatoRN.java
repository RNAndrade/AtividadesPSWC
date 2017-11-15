package negocio;

import basic.Contato;
import dao.ContatoDAO;
import dao.DAOFactory;

public class ContatoRN {

	ContatoDAO dao;
	
	public ContatoRN() {
		this.dao = new ContatoDAO(DAOFactory.getInstance());	
	}
	
	public void novoContato(Contato c) {
		dao.inserir(c);
	}

}
