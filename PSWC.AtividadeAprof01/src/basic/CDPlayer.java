package basic;

public class CDPlayer extends Player {

	private CD cdCarregado;

	public CDPlayer() {
		super();
	}

	public CDPlayer(CD cdCarregado) {
		this.cdCarregado = cdCarregado;
	}

	public void colocarCD(CD cdCarregado) {
		this.setCdCarregado(cdCarregado);
		System.out.println("Foi colocado o CD de " + this.cdCarregado.getArtista());
	}

	public void tirarCD() {
		if (getCdCarregado() != null) {
			this.setCdCarregado(null);
			System.out.println("Foi tirado o CD de " + this.cdCarregado.getArtista());
		} else {
			System.out.println("CDPlayer vazio!");
		}
	}

	public CD getCdCarregado() {
		return cdCarregado;
	}

	public void setCdCarregado(CD cdCarregado) {
		this.cdCarregado = cdCarregado;
	}
}
