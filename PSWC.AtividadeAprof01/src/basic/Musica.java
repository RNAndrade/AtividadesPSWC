package basic;

public class Musica {

	private String nome;
	private String compositor;
	private int tempo;
	
	public Musica(String nome, String compositor, int tempo) {
		super();
		this.nome = nome;
		this.compositor = compositor;
		this.tempo = tempo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCompositor() {
		return compositor;
	}
	public void setCompositor(String compositor) {
		this.compositor = compositor;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	
}
