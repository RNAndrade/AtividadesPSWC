package Teste;
import java.util.ArrayList;

import Basic.AparelhoSom;
import Basic.CD;
import Basic.CDPlayer;
import Basic.Musica;

public class Teste {

	public static void main(String[] args) {
		
		AparelhoSom xyz = new AparelhoSom();
		xyz.ligar();
		xyz.alterarVolume("+");
		xyz.alterarVolume("+");
		xyz.alterarVolume("+");
		xyz.alterarVolume("+");
		xyz.alterarVolume("+");
		xyz.alterarFuncao("CDPlayer");
		
		if (xyz.getPlayer() instanceof CDPlayer) {
			
			CDPlayer cdPlayer = new CDPlayer();
			cdPlayer = (CDPlayer) xyz.getPlayer();
			Musica m1 = new Musica("Todo Carnaval tem seu fim", "Marcelo Camelo", 252);
			Musica m2 = new Musica("A flor", "Rodrigo Amarante", 210);
			Musica m3 = new Musica("Retrato Pra Iaiá", "Marcelo Camelo", 282);
			Musica m4 = new Musica("Assim será", "Marcelo Camelo", 194);
			Musica m5 = new Musica("Casa pré-fabricada", "Marcelo Camelo", 245);
			
			ArrayList<Musica> musicas = new ArrayList<>();

			musicas.add(m1);
			musicas.add(m2);
			musicas.add(m3);
			musicas.add(m4);
			musicas.add(m5);	
			
			CD cd = new CD();
			cd.setAlbum("Bloco do eu sozinho");
			cd.setAno(2001);
			cd.setMusicas(musicas);
			cd.setArtista("Los Hermanos");
			cdPlayer.colocarCD(cd);
			
		}
		
		
		
		
		
		System.out.println(xyz.getPlayer().getClass().getName());
		System.out.println(xyz.getVolume());
		System.out.println(xyz.isIndicadorON());

	}

}
