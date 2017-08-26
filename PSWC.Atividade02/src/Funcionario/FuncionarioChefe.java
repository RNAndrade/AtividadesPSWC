package Funcionario;

public class FuncionarioChefe extends Funcionario {

	private Double valor_inicial;
	private Double gratificacao;
	private Funcionario funcionarioAssessor;

	@Override
	public Double obterSalario() {
		return getValor_inicial() + getGratificacao();
	}

	@Override
	public boolean equals(Funcionario f) {
		boolean auxiliar = false;
		if (this.getCPF() == f.getCPF()) {
			auxiliar = true;
		}
		return auxiliar;
	}

	@Override
	public String toString() {
		return this.getCPF() + " - " + this.getNome() + ", " + this.getIdade() + " : " + this.obterSalario() + " (FC) "
				+ "Assessor: " + this.getFuncionarioAssessor();
	}

	public Double getValor_inicial() {
		return valor_inicial;
	}

	public void setValor_inicial(Double valor_inicial) {
		this.valor_inicial = valor_inicial;
	}

	public Double getGratificacao() {
		return gratificacao;
	}

	public void setGratificacao(Double gratificacao) {
		this.gratificacao = gratificacao;
	}

	public Funcionario getFuncionarioAssessor() {
		return funcionarioAssessor;
	}

	public void setFuncionarioAssessor(Funcionario funcionarioAssessor) {
		if (funcionarioAssessor instanceof FuncionarioHorario || funcionarioAssessor instanceof FuncionarioChefe) {
			System.out.println("Assessor não é do tipo Funcionário");
		} else {
			this.funcionarioAssessor = funcionarioAssessor;
		}
	}

}
