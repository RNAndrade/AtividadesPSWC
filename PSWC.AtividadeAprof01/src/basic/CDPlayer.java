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
		System.out.println("Carregado CD de: " + this.cdCarregado.getArtista());
	}

	public void tirarCD() {
		if (getCdCarregado() != null) {
			System.out.println("Retirado CD de: " + this.cdCarregado.getArtista());
			this.setCdCarregado(null);
		} else {
			System.out.println("CD-Player vazio!");
		}
	}
	
	@Override
	public void play(int numMusica) {
		numMusica = 1;
		System.out.println("Tocando música: " + this.getCdCarregado().getMusicas().get(numMusica).getNome());
	}

	@Override
	public void stop() {
		numMusica = 0;
		System.out.println("STOP");
	}

	public void avancarMusica() {
		for (int i = 0; i < this.getCdCarregado().getMusicas().size(); i++) {
			if (numMusica >= 1) {
				if (numMusica < i) {
					numMusica++;
				}
			}
		}
		System.out.println("Playing: " + this.getCdCarregado().getMusicas().get(getNumMusica()).getNome()
				+ this.getCdCarregado().getArtista());
	}

	public void recuarMusica() {
		if (numMusica != 0) {
			for (int i = numMusica; i >= this.getCdCarregado().getMusicas().size();) {
				while (i != 1) {
					numMusica--;
				}
			}
		}
		System.out.println("Musica: " + this.getCdCarregado().getMusicas().get(getNumMusica()).getNome()
				+ this.getCdCarregado().getArtista());
	}

	public CD getCdCarregado() {
		return cdCarregado;
	}

	public void setCdCarregado(CD cdCarregado) {
		this.cdCarregado = cdCarregado;
	}
}
