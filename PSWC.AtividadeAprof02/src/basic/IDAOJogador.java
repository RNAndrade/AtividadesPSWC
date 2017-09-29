package basic;

import java.util.List;

import javax.persistence.EntityManager;

public interface IDAOJogador {
	
	public Jogador pesquisarCamisa(EntityManager manager, String nomeTime, Integer numCamisa);
	
	public List<Jogador> pesquisarJogadorCartaoVermelho(EntityManager manager, String nomeTime);
}
