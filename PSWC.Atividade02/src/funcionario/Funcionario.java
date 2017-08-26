package funcionario;

public class Funcionario {

	private String CPF;
	private String nome;
	private Integer idade;
	private Double salario;
	
	public Double obterSalario() {
		return this.salario;
	}
	
	public boolean equals(Funcionario f) {
		boolean auxiliar = false;
		if (this.getCPF() == f.getCPF()) {
			auxiliar = true;
		}
		return auxiliar;
	}
	
	public String toString() {
		return this.getCPF() + " - " + this.getNome() + ", " + this.getIdade() + " : " + this.obterSalario() + " (F)";
	}
	
	public String getCPF() {
		return CPF;
	}
	
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getIdade() {
		return idade;
	}
	
	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

}
