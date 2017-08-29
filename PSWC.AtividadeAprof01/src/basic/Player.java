package basic;

public class Player {

	protected int numMusica;
	protected int tempoMusica;
	Musica musica = new Musica();
	
	public Player() {
		super();
	}
	
	public Player(int numMusica, int tempoMusica) {
		super();
		this.numMusica = numMusica;
		this.tempoMusica = tempoMusica;
	}
	
	public void play() {
		
	}

	public void stop() {
		
	}

	public void avancarMusica() {
	
	}

	public void recuarMusica() {
	
	}

	public int getNumMusica() {
		return numMusica;
	}

	public void setNumMusica(int numMusica) {
		this.numMusica = numMusica;
	}

	public int getTempoMusica() {
		return tempoMusica;
	}

	public void setTempoMusica(int tempoMusica) {
		this.tempoMusica = tempoMusica;
	}

	public Musica getMusica() {
		return musica;
	}

	public void setMusica(Musica musica) {
		this.musica = musica;
	}
}
