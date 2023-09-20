package prjCalculoArea;

public class Quadrado extends FormaGeometrica{
	public Quadrado(int base, int altura) {
		super(base, altura);
	}

	public void calculoArea() {
		int area;
		area = (base*altura);
		System.out.println("O valor da área é quadrado: " +area);
	}
}
