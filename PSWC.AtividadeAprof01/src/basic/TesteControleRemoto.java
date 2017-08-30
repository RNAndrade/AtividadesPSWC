package basic;

public class TesteControleRemoto {

	public static void main(String[] args) {

		ControleRemotoUniversal controle = new ControleRemotoUniversal();
		controle.ligar(new Televisao());
		controle.ligar(new BlurayPlayer());

	}
}
