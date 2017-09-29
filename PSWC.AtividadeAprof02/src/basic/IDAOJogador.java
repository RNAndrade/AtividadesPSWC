package basic;

import javax.persistence.EntityManager;

public interface IDAOJogador {
	
	public Jogador pesquisarCamisa(EntityManager manager, String nomeTime, Integer numCamisa);
}
