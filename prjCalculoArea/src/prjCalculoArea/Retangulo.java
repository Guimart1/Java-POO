package prjCalculoArea;

public class Retangulo extends FormaGeometrica{

	public Retangulo(int base, int altura) {
		super(base, altura);
	}

	public void calculoArea() {
		int area;
		area = (base*altura);
		System.out.println("O valor da área é retangulo: " +area);
	}
}