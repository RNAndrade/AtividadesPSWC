package FormasGeometricas;
import java.util.ArrayList;
import java.util.Collection;

public class ColecaoFormas {

	Collection<FormaGeometrica> formas;

	public ColecaoFormas() {
		formas = new ArrayList<FormaGeometrica>();
	}

	public void adicionarForma(FormaGeometrica forma) {
		if (forma.calcularArea() <= 4) {
			System.out.println("�rea da forma geom�trica abaixo do limite inferior");
		} else {
			formas.add(forma);
		}
	}

	public Integer retornarAreaTotal() {
		Integer auxiliar = 0;
		for (FormaGeometrica forma : formas) {
			auxiliar += forma.calcularArea();
		}
		return auxiliar;
	}

	public Integer retornarPerimetroTotal() {
		Integer auxiliar = 0;
		for (FormaGeometrica forma : formas) {
			auxiliar += forma.calcularPerimetro();
		}
		return auxiliar;
	}

	public Integer obterQuantidadeQuadrados() {
		Integer auxiliar = 0;
		for (FormaGeometrica forma : formas) {
			if (forma.calcularPerimetro() % 4 == 0) {
				auxiliar++;
			}
		}
		return auxiliar;
	}

	public Collection obterColecaoRetangulos() {
		return formas;
	}

}
