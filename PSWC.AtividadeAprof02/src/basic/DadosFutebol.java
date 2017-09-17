package basic;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DadosFutebol {

	public static void main(String[] args) {
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("unidadePersistencia");
		EntityManager factory = managerFactory.createEntityManager();
		EntityTransaction transaction = factory.getTransaction();
		transaction.begin();

		// --------------Técnicos---------------
		Calendar data1 = Calendar.getInstance();
		data1.set(1958, 03, 10);
		Calendar data2 = Calendar.getInstance();
		data2.set(1957, 04, 21);
		Calendar data3 = Calendar.getInstance();
		data3.set(1958, 03, 10);
		Tecnico coach1 = new Tecnico("Paulo Autuori", data1, 102000.00);
		Tecnico coach2 = new Tecnico("Mano Menezes", data2, 90000.00);
		Tecnico coach3 = new Tecnico("Marcelo Oliveira", data3, 82500.00);
		factory.persist(coach1);
		factory.persist(coach2);
		factory.persist(coach3);

		// ---------------Juizes---------------
		Calendar data4 = Calendar.getInstance();
		data4.set(1930, 02, 06);
		Calendar data5 = Calendar.getInstance();
		data5.set(1973, 12, 16);
		Juiz judge1 = new Juiz("Armando Marques", data4, 24000.00);
		Juiz judge2 = new Juiz("Paulo Cesar de Oliveira", data5, 35000.00);
		factory.persist(judge1);
		factory.persist(judge2);

		// ---------------Times---------------
		Tecnico coachOne = factory.find(Tecnico.class, new Integer(1));
		Tecnico coachTwo = factory.find(Tecnico.class, new Integer(2));
		Tecnico coachThree = factory.find(Tecnico.class, new Integer(3));
		Time team1 = new Time("São Paulo", "SP", 15, coachOne);
		Time team2 = new Time("Cruzeiro", "MG", 32, coachTwo);
		Time team3 = new Time("Flamengo", "RJ", 30, coachThree);
		factory.persist(team1);
		factory.persist(team2);
		factory.persist(team3);

		// ---------------Jogadores---------------
		Calendar data6 = Calendar.getInstance();
		data6.set(1979, 10, 28);
		Calendar data7 = Calendar.getInstance();
		data7.set(1983, 1, 04);
		Calendar data8 = Calendar.getInstance();
		data8.set(1982, 11, 22);
		Calendar data9 = Calendar.getInstance();
		data9.set(1984, 5, 16);
		Calendar data10 = Calendar.getInstance();
		data10.set(1980, 9, 27);
		Calendar data11 = Calendar.getInstance();
		data11.set(1984, 11, 25);

		Time teamOne = factory.find(Time.class, new Integer(1));
		Time teamTwo = factory.find(Time.class, new Integer(2));

		Jogador player1 = new Jogador("Rogério Ceni", teamOne, data6, 88000.00, 01, true, false, 2, 1);
		Jogador player2 = new Jogador("Alex Silva", teamOne, data7, 45000.00, 02, true, false, 2, 1);
		Jogador player3 = new Jogador("Fabão", teamTwo, data8, 52500.00, 03, true, false, 3, 0);
		Jogador player4 = new Jogador("Edcarlos", teamTwo, data9, 70000.00, 04, false, false, 1, 0);
		Jogador player5 = new Jogador("Souza", teamOne, data10, 65000.00, 05, true, true, 1, 1);
		Jogador player6 = new Jogador("Ilsinho", teamOne, data11, 43860.90, 06, false, false, 2, 0);

		factory.persist(player1);
		factory.persist(player2);
		factory.persist(player3);
		factory.persist(player4);
		factory.persist(player5);
		factory.persist(player6);

		// ---------------Jogos---------------
		Calendar data12 = Calendar.getInstance();
		data12.set(2013, 7, 13);
		Calendar data13 = Calendar.getInstance();
		data13.set(2013, 10, 10);
		Calendar data14 = Calendar.getInstance();
		data14.set(2013, 8, 14);
		Calendar data15 = Calendar.getInstance();
		data15.set(2013, 9, 19);

		Time teamUm = factory.find(Time.class, new Integer(1));
		Time teamDois = factory.find(Time.class, new Integer(2));
		Time teamTres = factory.find(Time.class, new Integer(3));

		Juiz judgeOne = factory.find(Juiz.class, new Integer(1));
		Juiz judgeTwo = factory.find(Juiz.class, new Integer(2));

		Jogo game1 = new Jogo(teamUm, teamDois, 2, 1, data12, judgeTwo);
		Jogo game2 = new Jogo(teamDois, teamUm, 0, 0, data13, judgeOne);
		Jogo game3 = new Jogo(teamTres, teamDois, 1, 1, data14, judgeTwo);
		Jogo game4 = new Jogo(teamUm, teamTres, 0, 0, data15, judgeOne);

		factory.persist(game1);
		factory.persist(game2);
		factory.persist(game3);
		factory.persist(game4);

		transaction.commit();
		factory.close();
	}

}
