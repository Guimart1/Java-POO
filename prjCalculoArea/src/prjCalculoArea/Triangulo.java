package prjCalculoArea;

import javax.swing.JOptionPane;

public class Triangulo extends FormaGeometrica{
	public Triangulo(double altura, double base) {
		super(altura, base);
	}
	public void calculoArea() {
		double area;
		area = (this.getAltura()*this.getBase())/2;
		JOptionPane.showMessageDialog(null, "O valor da área do Triangulo é: " +area);
	}
}

