package basic;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "campeonato_time")
public class CampeonatoTime {

	@EmbeddedId
	private CampeonatoTimePK chaveComposta;
	private Integer posicaoTime;

	public CampeonatoTime() {
		super();
	}

	public CampeonatoTime(CampeonatoTimePK chaveComposta, Integer posicaoTime) {
		super();
		this.chaveComposta = chaveComposta;
		this.posicaoTime = posicaoTime;
	}

	public Integer getPosicaoTime() {
		return posicaoTime;
	}

	public void setPosicaoTime(Integer posicaoTime) {
		this.posicaoTime = posicaoTime;
	}

	public CampeonatoTimePK getChaveComposta() {
		return chaveComposta;
	}

	public void setChaveComposta(CampeonatoTimePK chaveComposta) {
		this.chaveComposta = chaveComposta;
	}

}
