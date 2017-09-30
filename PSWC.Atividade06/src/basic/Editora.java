package basic;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Editora {
	@Id
	private Integer id;
	private String nome;
	private String cidade;
	@OneToMany
	private List<Livro> livros;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
