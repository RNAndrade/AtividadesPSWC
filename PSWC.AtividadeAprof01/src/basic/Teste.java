package basic;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {

		// CARREGAR MÚSICAS E CD
		Musica m1 = new Musica("Todo Carnaval tem seu fim", "Marcelo Camelo", 252);
		Musica m2 = new Musica("A flor", "Rodrigo Amarante", 210);
		Musica m3 = new Musica("Retrato Pra Iaiá", "Marcelo Camelo", 282);
		Musica m4 = new Musica("Assim será", "Marcelo Camelo", 194);
		Musica m5 = new Musica("Casa pré-fabricada", "Marcelo Camelo", 245);
		
		ArrayList<Musica> musicasCD = new ArrayList<>();
		musicasCD.add(m1);
		musicasCD.add(m2);
		musicasCD.add(m3);
		musicasCD.add(m4);
		musicasCD.add(m5);
		
		CD cd = new CD("Bloco do eu sozinho", "Los Hermanos", 2001, musicasCD);
		
		Musica m6 = new Musica("Pais e filhos", "Renato Russo", 330);
		Musica m7 = new Musica("All you need is love", "John Lennon", 212);
		Musica m8 = new Musica("A flor", "Rodrigo Amarante", 210);
		Musica m9 = new Musica("Construção", "Chico Buarque", 280);
		
		ArrayList<Musica> pendrive = new ArrayList<>();
		pendrive.add(m6);
		pendrive.add(m7);
		pendrive.add(m8);
		pendrive.add(m9);

		// ACIONAR APARELHO DE SOM
		AparelhoSom xyz = new AparelhoSom("Sony", 60);
		xyz.ligar();
		xyz.alterarVolume("+");
		xyz.alterarVolume("+");
		xyz.alterarVolume("+");
		xyz.alterarVolume("+");
		xyz.alterarVolume("+");
		xyz.alterarFuncao("CDPlayer");
		xyz.getCdPlayer().setCdCarregado(cd);
		xyz.getCdPlayer().play();
		xyz.getCdPlayer().avancarMusica();
		xyz.getCdPlayer().avancarMusica();
		xyz.getCdPlayer().avancarMusica();
		xyz.getCdPlayer().avancarMusica();
		xyz.getCdPlayer().avancarMusica();
		xyz.getCdPlayer().recuarMusica();
		xyz.getCdPlayer().recuarMusica();
		xyz.getCdPlayer().recuarMusica();
		xyz.getCdPlayer().recuarMusica();
		xyz.getCdPlayer().recuarMusica();	
		xyz.getCdPlayer().stop();
		xyz.getCdPlayer().tirarCD();
		xyz.alterarFuncao("RÁDIO");
		xyz.alterarVolume("-");
		xyz.alterarVolume("-");
		xyz.alterarFuncao("USBPlayer");
		xyz.getUsbPlayer().setMusicas(pendrive);
		xyz.getUsbPlayer().avancarMusica();
		xyz.alterarVolume("+");
		xyz.alterarVolume("+");
		xyz.alterarVolume("+");
		xyz.alterarVolume("+");
		xyz.alterarVolume("+");
		xyz.alterarVolume("+");
		xyz.alterarVolume("+");
		xyz.alterarVolume("+");
		xyz.alterarVolume("+");
		xyz.alterarVolume("+");
		xyz.alterarVolume("+");
		xyz.alterarVolume("+");
		xyz.alterarVolume("+");
		xyz.alterarVolume("+");
		xyz.alterarVolume("+");
		xyz.alterarVolume("+");
		xyz.alterarVolume("+");
		xyz.alterarVolume("+");
		xyz.alterarVolume("+");
		xyz.alterarVolume("+");
		xyz.alterarVolume("+");
		xyz.alterarVolume("+");
		xyz.alterarVolume("+");
		xyz.alterarVolume("+");
		xyz.alterarVolume("+");
		xyz.getUsbPlayer().avancarMusica();
		xyz.getUsbPlayer().avancarMusica();
		xyz.getUsbPlayer().avancarMusica();
		xyz.getUsbPlayer().avancarMusica();
		xyz.getUsbPlayer().avancarMusica();
		xyz.getUsbPlayer().avancarMusica();
		xyz.getUsbPlayer().avancarMusica();
		xyz.getUsbPlayer().avancarMusica();
		xyz.getUsbPlayer().avancarMusica();
		xyz.getUsbPlayer().avancarMusica();
		xyz.getUsbPlayer().avancarMusica();
		xyz.getUsbPlayer().avancarMusica();
		xyz.desligar();
	}
}
