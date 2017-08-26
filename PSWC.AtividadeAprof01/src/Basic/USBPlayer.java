package Basic;
import java.util.Collection;

public class USBPlayer extends Player{

	Collection<Musica> musicas;
	
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
}
