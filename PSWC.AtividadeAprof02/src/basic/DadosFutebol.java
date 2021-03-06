package basic;

import java.util.ArrayList;
import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DadosFutebol {

	public static void main(String[] args) {
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("unidadePersistencia");
		EntityManager manager = managerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
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
		manager.persist(coach1);
		manager.persist(coach2);
		manager.persist(coach3);

		// ---------------Juizes---------------
		Calendar data4 = Calendar.getInstance();
		data4.set(1930, 02, 06);
		Calendar data5 = Calendar.getInstance();
		data5.set(1973, 12, 16);
		Juiz judge1 = new Juiz("Armando Marques", data4, 24000.00);
		Juiz judge2 = new Juiz("Paulo Cesar de Oliveira", data5, 35000.00);
		manager.persist(judge1);
		manager.persist(judge2);

		// ---------------Times---------------
		Tecnico pauloAutuori = manager.find(Tecnico.class, new Integer(1));
		Tecnico manoMenezes = manager.find(Tecnico.class, new Integer(2));
		Tecnico marceloOliveira = manager.find(Tecnico.class, new Integer(3));

		Time team1 = new Time("São Paulo", "SP", 15, pauloAutuori);
		Time team2 = new Time("Cruzeiro", "MG", 32, manoMenezes);
		Time team3 = new Time("Flamengo", "RJ", 30, marceloOliveira);
		manager.persist(team1);
		manager.persist(team2);
		manager.persist(team3);

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

		Time saoPaulo = manager.find(Time.class, new Integer(1));
		Time cruzeiro = manager.find(Time.class, new Integer(2));
		Time flamengo = manager.find(Time.class, new Integer(3));

		Jogador player1 = new Jogador("Rogério Ceni", saoPaulo, data6, 88000.00, 01, true, false, 2, 1);
		Jogador player2 = new Jogador("Alex Silva", saoPaulo, data7, 45000.00, 02, true, false, 2, 1);
		Jogador player3 = new Jogador("Fabão", cruzeiro, data8, 52500.00, 03, true, false, 3, 0);
		Jogador player4 = new Jogador("Edcarlos", cruzeiro, data9, 70000.00, 04, false, false, 1, 0);
		Jogador player5 = new Jogador("Souza", saoPaulo, data10, 65000.00, 05, true, true, 1, 1);
		Jogador player6 = new Jogador("Ilsinho", saoPaulo, data11, 43860.90, 06, false, false, 2, 0);

		manager.persist(player1);
		manager.persist(player2);
		manager.persist(player3);
		manager.persist(player4);
		manager.persist(player5);
		manager.persist(player6);

		// ---------------Jogos---------------
		Calendar data12 = Calendar.getInstance();
		data12.set(2013, 7, 13);
		Calendar data13 = Calendar.getInstance();
		data13.set(2013, 10, 10);
		Calendar data14 = Calendar.getInstance();
		data14.set(2013, 8, 14);
		Calendar data15 = Calendar.getInstance();
		data15.set(2013, 9, 19);

		Juiz armandoMarques = manager.find(Juiz.class, new Integer(1));
		Juiz pauloOliveira = manager.find(Juiz.class, new Integer(2));

		Jogo game1 = new Jogo(saoPaulo, cruzeiro, 2, 1, data12, pauloOliveira);
		Jogo game2 = new Jogo(cruzeiro, saoPaulo, 0, 0, data13, armandoMarques);
		Jogo game3 = new Jogo(flamengo, cruzeiro, 1, 1, data14, pauloOliveira);
		Jogo game4 = new Jogo(saoPaulo, flamengo, 0, 0, data15, armandoMarques);

		manager.persist(game1);
		manager.persist(game2);
		manager.persist(game3);
		manager.persist(game4);

		// ---------------Campeonatos---------------
		Calendar dataInicio1 = Calendar.getInstance();
		dataInicio1.set(2013, 7, 13);
		Calendar dataInicio2 = Calendar.getInstance();
		dataInicio2.set(2013, 10, 10);
		Calendar dataFim1 = Calendar.getInstance();
		dataFim1.set(2013, 7, 13);
		Calendar dataFim2 = Calendar.getInstance();
		dataFim2.set(2013, 10, 10);

		ArrayList<Time> times = new ArrayList<>();
		times.add(flamengo);
		times.add(saoPaulo);
		times.add(cruzeiro);

		Campeonato camp1 = new Campeonato("Campeonato Brasileiro", dataInicio1, dataFim1, times);
		Campeonato camp2 = new Campeonato("Taça Glória do Goitá", dataInicio2, dataFim2, times);

		manager.persist(camp1);
		manager.persist(camp2);

		transaction.commit();
		manager.close();
		managerFactory.close();
	}

}
