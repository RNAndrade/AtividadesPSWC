package Basic;

public class CDPlayer extends Player{

	private CD cdCarregado;
	
	public void colocarCD(CD cdCarregado) {
		this.setCdCarregado(cdCarregado);
		System.out.println("Foi colocado o CD de " + this.cdCarregado.getArtista());
	}
	
	public void tirarCD() {
		this.setCdCarregado(null);
		System.out.println("Foi tirado o CD de " + this.cdCarregado.getArtista());
	}

	public CD getCdCarregado() {
		return cdCarregado;
	}

	public void setCdCarregado(CD cdCarregado) {
		this.cdCarregado = cdCarregado;
	}
}
