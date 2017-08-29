package basic;

import java.util.ArrayList;

public class USBPlayer extends Player {

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
		System.out.println("Playing: " + numMusica + " - " + this.getMusicas().get(getNumMusica()).getCompositor());

	}

	@Override
	public void stop() {
		numMusica = 0;
		System.out.println("STOP");
	}

	public void avancarMusica() {
		if (numMusica < this.getMusicas().size() - 1) {
			numMusica++;
			System.out.println("Playing: " + (numMusica + 1) + " - " + this.getMusicas().get(numMusica).getNome()
					+ " - " + this.getMusicas().get(numMusica).getCompositor());
		} else {
			numMusica = 0;
			System.out.println("Playing: " + (numMusica + 1) + " - " + this.getMusicas().get(numMusica).getNome()
					+ " - " + this.getMusicas().get(numMusica).getCompositor());
		}
	}

	@Override
	public void recuarMusica() {
		if (numMusica < this.getMusicas().size() - 1) {
			numMusica--;
			System.out.println("Playing: " + (numMusica + 1) + " - " + this.getMusicas().get(numMusica).getNome()
					+ " - " + this.getMusicas().get(numMusica).getCompositor());
		} else {
			numMusica = 0;
			System.out.println("Playing: " + (numMusica + 1) + " - " + this.getMusicas().get(numMusica).getNome()
					+ " - " + this.getMusicas().get(numMusica).getCompositor());
		}
	}

	public ArrayList<Musica> getMusicas() {
		return musicas;
	}

	public void setMusicas(ArrayList<Musica> musicas) {
		this.musicas = musicas;
	}
}
