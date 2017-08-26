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
	
	@Override
	public void play(int numMusica) {
		numMusica = 1;
		System.out.print("\n Executando musica " + this.getCdCarregado().getMusicas().get(numMusica).getNome());
	}

	@Override
	public void stop() {
		numMusica = 0;
		System.out.print(" \n Player Parado");
	}

	public void avancarMusica() {
		for (int i = 0; i < this.getCdCarregado().getMusicas().size(); i++) {
			if (numMusica >= 1) {
				if (numMusica < i) {
					numMusica++;
				}
			}
		}
		System.out.println(" \n Musica:" + this.getCdCarregado().getMusicas().get(getNumMusica()).getNome()
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
		System.out.println("\n Musica:" + this.getCdCarregado().getMusicas().get(getNumMusica()).getNome()
				+ this.getCdCarregado().getArtista());
	}

	public CD getCdCarregado() {
		return cdCarregado;
	}

	public void setCdCarregado(CD cdCarregado) {
		this.cdCarregado = cdCarregado;
	}
}
