package basic;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Time {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_time")
	private Integer id;
	private String nome;
	private String estado;
	private Integer pontos;
	@OneToMany(mappedBy = "time")
	@Cascade(CascadeType.DELETE)
	private List<Jogador> jogadores;
	@OneToOne
	@JoinColumn(name = "id_tecnico")
	@Cascade(CascadeType.DELETE)
	private Tecnico tecnico;
	@ManyToMany
	@Cascade(CascadeType.ALL)
	@JoinTable(name = "campeonato_time", joinColumns = { @JoinColumn(name = "id_time") }, inverseJoinColumns = {
			@JoinColumn(name = "id_campeonato") })
	private List<Campeonato> campeonatos;

	public Time() {
		super();
	}

	public Time(String nome, String estado, Integer pontos, Tecnico tecnico) {
		super();
		this.nome = nome;
		this.estado = estado;
		this.pontos = pontos;
		this.tecnico = tecnico;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getPontos() {
		return pontos;
	}

	public void setPontos(Integer pontos) {
		this.pontos = pontos;
	}

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public List<Campeonato> getCampeonatos() {
		return campeonatos;
	}

	public void setCampeonatos(List<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}

}
