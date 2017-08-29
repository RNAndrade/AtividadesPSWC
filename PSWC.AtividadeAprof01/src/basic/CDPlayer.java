package basic;

public class CDPlayer extends Player {

	private CD cdCarregado;

	public CDPlayer() {
		super();
	}

	public CDPlayer(CD cdCarregado) {
		super();
		this.cdCarregado = cdCarregado;
	}

	public void colocarCD(CD cdCarregado) {
		this.setCdCarregado(cdCarregado);
		System.out.println("Loading:  " + this.cdCarregado.getArtista());
	}

	public void tirarCD() {
		if (getCdCarregado() != null) {
			System.out.println("Unloading : " + this.cdCarregado.getArtista());
			this.setCdCarregado(null);
		} else {
			System.out.println("CDPlayer is empty!");
		}
	}

	@Override
	public void play() {
		numMusica = 1;
		System.out.println(
				"Playing: " + numMusica + " - " + this.getCdCarregado().getMusicas().get(numMusica - 1).getNome()
						+ " - " + this.getCdCarregado().getArtista());
	}

	@Override
	public void stop() {
		numMusica = 0;
		System.out.println("STOP");
	}

	public void avancarMusica() {
		if (numMusica < this.getCdCarregado().getMusicas().size()) {
			numMusica++;
			System.out.println(
					"Playing: " + numMusica + " - " + this.getCdCarregado().getMusicas().get(numMusica - 1).getNome()
							+ " - " + this.getCdCarregado().getArtista());
		} else {
			System.out.println("Última música já em execução!");
		}
	}

	public void recuarMusica() {
		if (numMusica > 1) {
			numMusica--;
			System.out.println(
					"Playing: " + numMusica + " - " + this.getCdCarregado().getMusicas().get(numMusica - 1).getNome()
							+ " - " + this.getCdCarregado().getArtista());
		} else {
			System.out.println("Primeira música já em execução!");
		}
	}

	public CD getCdCarregado() {
		return cdCarregado;
	}

	public void setCdCarregado(CD cdCarregado) {
		this.cdCarregado = cdCarregado;
	}
}
