package basic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FutebolDadosAlteracao {

	public static void main(String[] args) {
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("unidadePersistencia");
		EntityManager factory = managerFactory.createEntityManager();
		EntityTransaction transaction = factory.getTransaction();
		transaction.begin();
		
		//-------------Alterar placa jogo-------------
		Jogo game = factory.find(Jogo.class, new Integer(4));
		game.setPlacarUm(3);
		game.setPlacarDois(2);
		factory.persist(game);
		
		//-------------Alterar jogador Ilsinho-------------
		Jogador player1 = factory.find(Jogador.class, new Integer(6));
		player1.setNome("Ilsinho Cavalcanti");
		player1.setSalario(89000.00);
		player1.setAmareloJogo(true);
		factory.persist(player1);
		
		//-------------Alterar time Alex Silva-------------
		Jogador player2 = factory.find(Jogador.class, new Integer(2));
		Time team1 = factory.find(Time.class, new Integer(3));
		player2.setTime(team1);
		factory.persist(player2);
		
		//-------------Excluir Rogerio Ceni-------------
		Jogador player3 = factory.find(Jogador.class, new Integer(1));
		factory.remove(player3);
		
		//-------------Excluir Cruzeiro, Jogadores e Técnico-------------
		Time team2 = factory.find(Time.class, new Integer(2));
		Tecnico coach1 = factory.find(Tecnico.class, new Integer(team2.getTecnico().getId()));
		factory.remove(team2);
		factory.remove(coach1);
		
		transaction.commit();
		factory.close();
		managerFactory.close();

	}

}
