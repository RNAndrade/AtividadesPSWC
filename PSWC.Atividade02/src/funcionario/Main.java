package Funcionario;

public class Main {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		f.setSalario(5000.0);
		f.setCPF("04670463446");
		f.setIdade(25);
		f.setNome("Renato Andrade");
		System.out.println(f.toString());
		
		FuncionarioHorario fh = new FuncionarioHorario();
		fh.setSalario(5000.0);
		fh.setCPF("04670463445");
		fh.setIdade(25);
		fh.setNome("Renato Andrade");
		fh.setQtd_horas(220.00);
		fh.setValor_hora(100.00);
		System.out.println(fh.toString());
		
		FuncionarioChefe fc = new FuncionarioChefe();
		fc.setSalario(5000.0);
		fc.setCPF("04670463445");
		fc.setIdade(25);
		fc.setNome("Renato Andrade");
		fc.setValor_inicial(10000.00);
		fc.setGratificacao(5000.00);
		fc.setFuncionarioAssessor(fh);
		System.out.println(fc.toString());
	}

}
