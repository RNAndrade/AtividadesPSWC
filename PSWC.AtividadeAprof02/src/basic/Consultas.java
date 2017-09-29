package basic;

import java.util.ArrayList;

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
		
		ArrayList<Jogador> players = new ArrayList<Jogador>();
		players = (ArrayList<Jogador>) DAO.pesquisarJogadorCartaoVermelho(manager, "São Paulo");
		for (Jogador jogador : players) {
			System.out.println(jogador.getNome());
		}
		
		System.out.println(DAO.qtdJogadorTime(manager, "SP", "S%"));
		
	}
}
