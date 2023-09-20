package prjCalculoArea;

public class FormaGeometrica {
	protected int base;
	protected int altura;
	public FormaGeometrica(int base, int altura){
		this.base = base;
		this.altura = altura;
	}
	public void calculoArea() {
		int area;
		area = (base*altura);
		System.out.println("O valor da área é: " +area);
	}
}
