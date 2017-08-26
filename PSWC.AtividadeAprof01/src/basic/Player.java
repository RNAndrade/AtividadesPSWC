package basic;

public class Player {

	private int numMusica;
	private int tempoMusica;

	public Player() {
		super();
	}
	
	public Player(int numMusica, int tempoMusica) {
		super();
		this.numMusica = numMusica;
		this.tempoMusica = tempoMusica;
	}
	
	public void play() {
		CDPlayer cdPlayer = new CDPlayer();
		this.numMusica = 1;
		System.out.println("Executando a música + nme música" + cdPlayer.getCdCarregado().getMusicas().get(this.numMusica));
	}

	public void stop() {
		this.numMusica = 0;
		System.out.println("Player parado");
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
}
