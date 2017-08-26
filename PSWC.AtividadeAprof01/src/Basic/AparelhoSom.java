package Basic;

public class AparelhoSom extends Eletronico {

	private short potencia;
	private byte volume = 0;
	private Player player;
	private String funcao;

	public void alterarVolume(String comando) {
		if (comando == "+") {
			if (this.volume == 20) {
				System.out.println("Volume Máximo");
			} else {
				this.volume += 1;
			}
		} else if (comando == "-") {
			if (this.volume == 0) {
				System.out.println("Volume Mínimo");
			} else {
				this.volume -= 1;
			}
		}
	}

	public void alterarFuncao(String funcao) {
		if (funcao == "CDPlayer") {
			Player player = new CDPlayer();
			this.player = player;
			this.setFuncao(funcao);
			System.out.println("Função: " + funcao);
		} else if (funcao == "USBPlayer") {
			Player player = new USBPlayer();
			this.player = player;
			this.setFuncao(funcao);
			System.out.println("Função: " + funcao);
		} else if (funcao == "RÁDIO") {
			this.setFuncao(null);
			this.setFuncao(funcao);
			System.out.println("Função: " + funcao);
		}
	}

	public short getPotencia() {
		return potencia;
	}

	public void setPotencia(short potencia) {
		this.potencia = potencia;
	}

	public byte getVolume() {
		return volume;
	}

	public void setVolume(byte volume) {
		this.volume = volume;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

}
