package prjCalculoArea;

public class FormaGeometrica {
	private double base;
	private double altura;

	public FormaGeometrica(double base, double altura){
		this.setAltura(altura);
		this.setBase(base);
	}
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void calculoArea() {
		double area;
		area = (base*altura);
		System.out.println("O valor da área é: " +area);
	}
}
