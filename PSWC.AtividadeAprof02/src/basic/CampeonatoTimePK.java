package basic;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Embeddable
public class CampeonatoTimePK implements Serializable {

	@ManyToOne
	@Cascade(CascadeType.ALL)
	@JoinColumn(name = "id_campeonato")
	private Campeonato campeonato;

	@ManyToOne
	@Cascade(CascadeType.ALL)
	@JoinColumn(name = "id_time")
	private Time time;

	public CampeonatoTimePK() {
		super();
	}

	public CampeonatoTimePK(Campeonato campeonato, Time time) {
		super();
		this.campeonato = campeonato;
		this.time = time;
	}

	public Campeonato getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

}
