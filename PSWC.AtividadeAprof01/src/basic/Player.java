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
		this.numMusica = 1;
		System.out.println("Tocando música: " + this.getMusica().toString());
	}

	public void stop() {
		this.numMusica = 0;
		System.out.println("STOP");
	}

	public void avancarMusica() {
		// fazer um for até o limite de musicas do CD (Collection musicas.size());
		System.out.println("Número da música é [nome da música] + [nome do artista]");
	}

	public void recuarMusica() {
		// fazer um for até 1
		System.out.println("Número da música é [nome da música] + [nome do artista]");
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
