package FormasGeometricas;

public class Quadrado extends Retangulo {

	public Quadrado() {
		this.setAltura(5);
		this.setComprimento(5);
	}

	public Quadrado(Integer valor) {
		this.setAltura(valor);
		this.setComprimento(valor);
	}

	public void aumentarQuadrado() {
		this.setAltura(getAltura() + 1);
		this.setComprimento(getComprimento() + 1);
	}
}
