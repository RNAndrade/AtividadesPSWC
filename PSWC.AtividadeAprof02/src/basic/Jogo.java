package basic;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Jogo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_jogo")
	private Integer id;
	private Integer placarUm;
	private Integer placarDois;
	@Temporal(TemporalType.DATE)
	private Calendar dataJogo;
	@OneToOne
	@JoinColumn(name = "timeCasa")
	private Time timeCasa;
	@OneToOne
	@JoinColumn(name = "timeVisitante")
	private Time timeVisitante;
	@ManyToOne
	@JoinColumn(name = "id_juiz")
	private Juiz juiz;

	public Jogo() {
		super();
	}

	public Jogo(Time timeCasa, Time timeVisitante, Integer placarUm, Integer placarDois, Calendar dataJogo, Juiz juiz) {
		super();
		this.timeCasa = timeCasa;
		this.timeVisitante = timeVisitante;
		this.placarUm = placarUm;
		this.placarDois = placarDois;
		this.dataJogo = dataJogo;
		this.juiz = juiz;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPlacarUm() {
		return placarUm;
	}

	public void setPlacarUm(Integer placarUm) {
		this.placarUm = placarUm;
	}

	public Integer getPlacarDois() {
		return placarDois;
	}

	public void setPlacarDois(Integer placarDois) {
		this.placarDois = placarDois;
	}

	public Calendar getDataJogo() {
		return dataJogo;
	}

	public void setDataJogo(Calendar dataJogo) {
		this.dataJogo = dataJogo;
	}

	public Juiz getJuiz() {
		return juiz;
	}

	public void setJuiz(Juiz juiz) {
		this.juiz = juiz;
	}

	public Time getTimeCasa() {
		return timeCasa;
	}

	public void setTimeCasa(Time timeCasa) {
		this.timeCasa = timeCasa;
	}

	public Time getTimeVisitante() {
		return timeVisitante;
	}

	public void setTimeVisitante(Time timeVisitante) {
		this.timeVisitante = timeVisitante;
	}

}
