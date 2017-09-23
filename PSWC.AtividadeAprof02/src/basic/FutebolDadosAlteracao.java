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

		/*-------------Alterar placa jogo-------------
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

		// -------------Excluir Cruzeiro, Jogadores e Técnico-------------
		Time team2 = factory.find(Time.class, new Integer(2));
		factory.remove(team2);*/

		// ---------------Posições Times---------------

		Time saoPaulo = factory.find(Time.class, new Integer(1));
		Time cruzeiro = factory.find(Time.class, new Integer(2));
		Time flamengo = factory.find(Time.class, new Integer(3));

		Campeonato brasileiro = factory.find(Campeonato.class, new Integer(1));
		Campeonato tacaGloria = factory.find(Campeonato.class, new Integer(2));
		
		CampeonatoTimePK campTimePK1 = new CampeonatoTimePK(brasileiro, saoPaulo);
		CampeonatoTime campTime1 = factory.find(CampeonatoTime.class, campTimePK1);
		campTime1.setPosicaoTime(1);
		factory.persist(campTime1);
		
		CampeonatoTimePK campTimePK2 = new CampeonatoTimePK(tacaGloria, cruzeiro);
		CampeonatoTime campTime2 = factory.find(CampeonatoTime.class, campTimePK2);
		campTime2.setPosicaoTime(1);
		factory.persist(campTime2);
		
		CampeonatoTimePK campTimePK3 = new CampeonatoTimePK(brasileiro, flamengo);
		CampeonatoTime campTime3 = factory.find(CampeonatoTime.class, campTimePK3);
		campTime3.setPosicaoTime(2);
		factory.persist(campTime3);
		
		CampeonatoTimePK campTimePK4 = new CampeonatoTimePK(tacaGloria, flamengo);
		CampeonatoTime campTime4 = factory.find(CampeonatoTime.class, campTimePK4);
		campTime4.setPosicaoTime(2);
		factory.persist(campTime4);

		transaction.commit();
		factory.close();
		managerFactory.close();

	}

}
