package FormasGeometricas;

public class Retangulo extends FormaGeometrica {

	private Integer comprimento;
	private Integer altura;

	public Retangulo() {
		this.comprimento = 5;
		this.altura = 5;
	}

	public Retangulo(Integer valor) {
		this.comprimento = valor;
		this.altura = valor;
	}

	public Retangulo(Integer comprimento, Integer altura) {
		this.comprimento = comprimento;
		this.altura = altura;
	}

	@Override
	public Integer calcularArea() {
		return this.comprimento * this.altura;
	}

	@Override
	public Integer calcularPerimetro() {
		return (2 * this.comprimento) + (2 * this.altura);
	}

	public String ehQuadrado() {
		String auxiliar;
		if (this.comprimento == this.altura) {
			auxiliar = "VERDADEIRO";
		} else {
			auxiliar = "FALSO";
		}
		return auxiliar;
	}

	public boolean equals(Retangulo r1, Retangulo r2) {
		boolean auxiliar;
		if (r1.getComprimento() == r2.getComprimento() && r1.getAltura() == r2.getAltura()) {
			auxiliar = true;
		} else {
			auxiliar = false;
		}
		return auxiliar;
	}

	public Integer getComprimento() {
		return comprimento;
	}

	public void setComprimento(Integer comprimento) {
		this.comprimento = comprimento;
	}

	public Integer getAltura() {
		return altura;
	}

	public void setAltura(Integer altura) {
		this.altura = altura;
	}
}
