package basic;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Livro {
	@Id
	private Integer id;
	private String titulo;
	private Calendar ano;
	@ManyToMany
	private List<Autor> autores;
	@ManyToOne
	private Editora editora;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Calendar getAno() {
		return ano;
	}

	public void setAno(Calendar ano) {
		this.ano = ano;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
