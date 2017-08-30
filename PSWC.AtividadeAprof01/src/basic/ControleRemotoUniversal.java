package basic;

public class ControleRemotoUniversal extends Eletronico {

	public void ligar(Eletronico eletronico) {
		System.out.println("Ligando: " + eletronico.getClass().getName());
	}

	public void desligar(Eletronico eletronico) {
		System.out.println("Desligando: " + eletronico.getClass().getName());
	}
}
