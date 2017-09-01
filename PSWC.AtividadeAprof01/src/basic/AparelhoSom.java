package basic;

public class AparelhoSom extends Eletronico {

	private int potencia;
	private byte volume = 0;
	private CDPlayer cdPlayer;
	private USBPlayer usbPlayer;
	private String funcao;
	
	public AparelhoSom() {
		super();
	}
	
	public AparelhoSom(String marca, int potencia) {
		super();
		this.setMarca(marca);
		this.potencia = potencia;
		cdPlayer = new CDPlayer();
		usbPlayer = new USBPlayer();
	}

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
			this.setFuncao(funcao);
			System.out.println("Função: " + funcao);
		} else if (funcao == "USBPlayer") {
			this.setFuncao(funcao);
			System.out.println("Função: " + funcao);
		} else if (funcao == "RÁDIO") {
			this.setFuncao(funcao);
			System.out.println("Função: " + funcao);
		}
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public byte getVolume() {
		return volume;
	}

	public void setVolume(byte volume) {
		this.volume = volume;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public CDPlayer getCdPlayer() {
		return cdPlayer;
	}

	public void setCdPlayer(CDPlayer cdPlayer) {
		this.cdPlayer = cdPlayer;
	}

	public USBPlayer getUsbPlayer() {
		return usbPlayer;
	}

	public void setUsbPlayer(USBPlayer usbPlayer) {
		this.usbPlayer = usbPlayer;
	}

}
