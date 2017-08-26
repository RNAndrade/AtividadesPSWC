package basic;

import java.util.ArrayList;

public class USBPlayer extends Player{

	private ArrayList<Musica> musicas;
	
	public USBPlayer() {
		super();
	}
	
	public USBPlayer(ArrayList<Musica> musicas) {
		this.musicas = musicas;
	}
	
	@Override
	public void avancarMusica() {
		//fazer um for crescente até o size do collection
		System.out.println("Número da música – [nome da música] – [nome do artista");
	}
	
	@Override
	public void recuarMusica() {
		//fazer um for decrescente até o size do collection
		System.out.println("Número da música – [nome da música] – [nome do artista]");
	}

	public ArrayList<Musica> getMusicas() {
		return musicas;
	}

	public void setMusicas(ArrayList<Musica> musicas) {
		this.musicas = musicas;
	}
}
