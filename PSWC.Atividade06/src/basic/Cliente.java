package basic;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Cliente extends Pessoa {
	private Integer matricula;
	@OneToOne
	private Endereco endereco;

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
