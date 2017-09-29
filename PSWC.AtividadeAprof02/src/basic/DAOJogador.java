package basic;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class DAOJogador implements IDAOJogador {

	public Jogador pesquisarCamisa(EntityManager manager, String nomeTime, Integer numCamisa) {
		Query query = manager.createQuery("SELECT t FROM Time t WHERE t.nome = ?1", Time.class);
		query.setParameter(1, nomeTime);
		Time t = (Time) query.getSingleResult();
		Jogador player = new Jogador();
		for (Jogador jogador : t.getJogadores()) {
			if (jogador.getNumCamisa().equals(numCamisa)) {
				player = jogador;
				return player;
			}
		}
		return player;
	}
}
