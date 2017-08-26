package basic;

import java.util.ArrayList;

public class CD {

	private String album;
	private String artista;
	private int ano;
	private ArrayList<Musica> musicas;

	public CD(String album, String artista, int ano, ArrayList<Musica> musicas) {
		super();
		this.album = album;
		this.artista = artista;
		this.ano = ano;
		this.musicas = musicas;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public ArrayList<Musica> getMusicas() {
		return musicas;
	}

	public void setMusicas(ArrayList<Musica> musicas) {
		this.musicas = musicas;
	}

}
