package prjCalculoArea;

public class Triangulo extends FormaGeometrica{
	public Triangulo(int base, int altura) {
		super(base, altura);
	}

	public void calculoArea() {
		int area;
		area = (base*altura)/2;
		System.out.println("O valor da área do triangulo é: " +area);
	}
}
