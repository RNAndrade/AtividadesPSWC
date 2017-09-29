package basic;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class DAOJogador implements IDAOJogador {

	public Jogador pesquisarCamisa(EntityManager manager, String nomeTime, Integer numCamisa) {
		Query query = manager.createQuery("SELECT j FROM Jogador j WHERE j.numCamisa = :num AND j.time.nome = :nome",
				Jogador.class);
		query.setParameter("num", numCamisa);
		query.setParameter("nome", nomeTime);
		Jogador j = (Jogador) query.getSingleResult();
		return j;
	}

	public List<Jogador> pesquisarJogadorCartaoVermelho(EntityManager manager, String nomeTime) {
		TypedQuery<Jogador> query = manager.createQuery("SELECT j FROM Jogador j WHERE j.vermelhoQtd > 1 AND j.time.nome = :nome",
				Jogador.class);
		query.setParameter("nome", nomeTime);
		ArrayList<Jogador> players = (ArrayList<Jogador>) query.getResultList();
		return players;
	}

}
