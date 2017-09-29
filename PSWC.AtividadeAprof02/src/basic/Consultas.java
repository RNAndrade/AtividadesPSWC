package basic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Consultas {
	public static void main(String[] args) {
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("unidadePersistencia");
		EntityManager manager = managerFactory.createEntityManager();
		DAOJogador DAO = new DAOJogador();
		Jogador player = DAO.pesquisarCamisa(manager, "Cruzeiro", 3);
		System.out.println(player.getNome());
	}
}
