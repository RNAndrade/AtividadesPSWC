package basic;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Jogador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_jogador")
	private Integer id;
	private String nome;
	@Temporal(TemporalType.DATE)
	private Calendar dataNascimento;
	private Double salario;
	private Integer numCamisa;
	private boolean emCampo;
	private boolean amareloJogo;
	private Integer vermelhoQtd;
	private Integer amareloQtd;
	@ManyToOne
	@JoinColumn(name = "id_time")
	private Time time;

	public Jogador() {
		super();
	}

	public Jogador(String nome, Time time, Calendar dataNascimento, Double salario, Integer numCamisa, boolean emCampo,
			boolean amareloJogo, Integer vermelhoQtd, Integer amareloQtd) {
		super();
		this.nome = nome;
		this.time = time;
		this.dataNascimento = dataNascimento;
		this.salario = salario;
		this.numCamisa = numCamisa;
		this.emCampo = emCampo;
		this.amareloJogo = amareloJogo;
		this.vermelhoQtd = vermelhoQtd;
		this.amareloQtd = amareloQtd;
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

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Integer getNumCamisa() {
		return numCamisa;
	}

	public void setNumCamisa(Integer numCamisa) {
		this.numCamisa = numCamisa;
	}

	public boolean isEmCampo() {
		return emCampo;
	}

	public void setEmCampo(boolean emCampo) {
		this.emCampo = emCampo;
	}

	public boolean isAmareloJogo() {
		return amareloJogo;
	}

	public void setAmareloJogo(boolean amareloJogo) {
		this.amareloJogo = amareloJogo;
	}

	public Integer getVermelhoQtd() {
		return vermelhoQtd;
	}

	public void setVermelhoQtd(Integer vermelhoQtd) {
		this.vermelhoQtd = vermelhoQtd;
	}

	public Integer getAmareloQtd() {
		return amareloQtd;
	}

	public void setAmareloQtd(Integer amareloQtd) {
		this.amareloQtd = amareloQtd;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

}
