package Basic;

public class Eletronico {

	private String marca;
	private String modelo;
	private boolean indicadorON;
	
	public void ligar() {
		this.indicadorON = true;
	}
	
	public void desligar() {
		this.indicadorON = false;
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
