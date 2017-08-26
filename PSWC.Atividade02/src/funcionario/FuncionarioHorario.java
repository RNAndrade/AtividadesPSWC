package Funcionario;

public class FuncionarioHorario extends Funcionario {

	private Double valor_hora;
	private Double qtd_horas;

	@Override
	public Double obterSalario() {
		return this.getValor_hora() * this.getQtd_horas();
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
		return this.getCPF() + " - " + this.getNome() + ", " + this.getIdade() + " : " + this.obterSalario() + " (FH)";
	}

	public Double getValor_hora() {
		return valor_hora;
	}

	public void setValor_hora(Double valor_hora) {
		this.valor_hora = valor_hora;
	}

	public Double getQtd_horas() {
		return qtd_horas;
	}

	public void setQtd_horas(Double qtd_horas) {
		this.qtd_horas = qtd_horas;
	}

}
