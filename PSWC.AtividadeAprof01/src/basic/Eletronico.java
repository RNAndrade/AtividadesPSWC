package basic;

public class Eletronico {

	private String marca;
	private String modelo;
	private boolean indicadorON;

	public Eletronico() {
		super();
	}

	public Eletronico(String marca, String modelo, boolean indicadorON) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.indicadorON = indicadorON;
	}

	public void ligar() {
		this.indicadorON = true;
		System.out.println("ON");
	}

	public void desligar() {
		this.indicadorON = false;
		System.out.println("OFF");
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isIndicadorON() {
		return indicadorON;
	}

	public void setIndicadorON(boolean indicadorON) {
		this.indicadorON = indicadorON;
	}
}
