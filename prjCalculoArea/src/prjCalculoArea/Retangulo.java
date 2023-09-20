package prjCalculoArea;

import javax.swing.JOptionPane;

public class Retangulo extends FormaGeometrica{
	public Retangulo(double altura, double base) {
		super(altura, base);
	}
	public void calculoArea() {
		double area;
		area = this.getAltura()*this.getBase();
		JOptionPane.showMessageDialog(null, "O valor da área do retangulo é: " +area);
	}
}