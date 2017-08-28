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
	public void play() {
		numMusica = 1;
		System.out.println("Playing: " + this.getMusicas().get(getNumMusica()).getCompositor());
	}

	@Override
	public void stop() {
		numMusica = 0;
		System.out.println("STOP");
	}
	
	public void avancarMusica(int numMusica) {
		if (numMusica >= 0) {
			numMusica++;
		} else {
			for (int i = 0; i <= this.musicas.size(); i++) {
				if (numMusica > i) {
					numMusica = 1;
				}
			}
		}
		System.out.println("Playing: " + this.getMusicas().get(getNumMusica()).getNome().toString());
	}
	
	@Override
	public void recuarMusica() {
		if (numMusica != 0) {
			for (int i = 0; i <= this.musicas.size(); i--) {
				numMusica = i;
			}
			System.out.print("Playing: " + this.getMusicas().get(getNumMusica()).getNome().toString());
		}
	}

	public ArrayList<Musica> getMusicas() {
		return musicas;
	}

	public void setMusicas(ArrayList<Musica> musicas) {
		this.musicas = musicas;
	}
}
