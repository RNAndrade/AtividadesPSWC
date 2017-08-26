package FormasGeometricas;

public class TesteFormaGeometrica {

	public static void main(String args[]) {

		Quadrado q1 = new Quadrado();
		Quadrado q2 = new Quadrado(8);
		Retangulo r1 = new Retangulo();
		Retangulo r2 = new Retangulo(4, 9);
		Retangulo r3 = new Retangulo(3);
		ColecaoFormas formasPSC = new ColecaoFormas();

		formasPSC.adicionarForma(q1);
		formasPSC.adicionarForma(q2);
		formasPSC.adicionarForma(r1);
		formasPSC.adicionarForma(r2);
		formasPSC.adicionarForma(r3);

		System.out.println(formasPSC.retornarAreaTotal());
		System.out.println(formasPSC.retornarPerimetroTotal());
		System.out.println(formasPSC.obterQuantidadeQuadrados());
		for (FormaGeometrica forma : formasPSC.formas) {
			Retangulo r = (Retangulo) forma;
			System.out.println(r.getAltura());
			System.out.println(r.getComprimento());
		}
	}
}