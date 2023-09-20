package prjCalculoArea;
import javax.swing.JOptionPane;
public class Quadrado extends FormaGeometrica{
	public Quadrado(double altura, double base) {
		super(altura, base);
	}
	public void calculoArea() {
		double area;
		area = this.getAltura()*this.getBase();
		JOptionPane.showMessageDialog(null, "O valor da área do quadrado é: " +area);
	}
}

