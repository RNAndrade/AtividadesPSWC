package basic;

public class ControleRemotoUniversal {
	
	private AparelhoSom aparelhoSom;
	private Televisao tv;
	private BlurayPlayer bluray;
	
	public ControleRemotoUniversal() {
		super();
		AparelhoSom aparelhoSom = new AparelhoSom();
		Televisao tv = new Televisao();
		BlurayPlayer bluray = new BlurayPlayer();
	}

	public AparelhoSom getAparelhoSom() {
		return aparelhoSom;
	}

	public void setAparelhoSom(AparelhoSom aparelhoSom) {
		this.aparelhoSom = aparelhoSom;
	}

	public Televisao getTv() {
		return tv;
	}

	public void setTv(Televisao tv) {
		this.tv = tv;
	}

	public BlurayPlayer getBluray() {
		return bluray;
	}

	public void setBluray(BlurayPlayer bluray) {
		this.bluray = bluray;
	}
}
