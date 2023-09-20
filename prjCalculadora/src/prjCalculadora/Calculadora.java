package prjCalculadora;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Calculadora {
	DecimalFormat decimal = new DecimalFormat("0.0000");
	public double num1;
	public double num2;
	public double r;
	public String resp;
	


	public void Soma() {
		int numInt1 = (int)num1;
		int numInt2 = (int)num2;
		int r = (int)numInt1+numInt2;
		JOptionPane.showInternalMessageDialog(null, "O resultado da soma é: "+r);
	}
	public String Soma(double num1, double num2) {
		r = num1+num2;
		resp = "O resultado da soma é: "+decimal.format(r);
		return resp;
	}
	
	public void Subtracao() {
		int numInt1 = (int)num1;
		int numInt2 = (int)num2;
		r = (int)numInt1-numInt2;
		JOptionPane.showInternalMessageDialog(null, "O resultado da subtração é: "+r);
	}
	public String Subtracao(double num1, double num2) {
		r = num1-num2;
		resp = "O resultado da soma é: "+decimal.format(r);
		return resp;
	}
	
	public void Divisao() {
		int numInt1 = (int)num1;
		int numInt2 = (int)num2;
		if (numInt1 == 0 || numInt2 == 0) {
			JOptionPane.showMessageDialog(null, "Não é possível fazer o cálculo divindo e(ou) sendo dividido por zero.");
		}else {
			r = (int)numInt1/numInt2;
			JOptionPane.showInternalMessageDialog(null, "O resultado da divisão é: "+decimal.format(r));
		}
	}
	public String Divisao(double num1, double num2) {
		if (num1 == 0 || num2 == 0) {
			return resp = "Não é possível fazer o cálculo divindo e(ou) sendo dividido por zero.";
		}else {
			r = num1/num2;
			resp = "O resultado da soma é: "+decimal.format(r);
			return resp;
		}

	}
	
	public void Multiplicacao() {
		int numInt1 = (int)num1;
		int numInt2 = (int)num2;
		r = (int)numInt1*numInt2;
		JOptionPane.showInternalMessageDialog(null, "O resultado da multiplicação é: "+r);
	}
	public String Multiplicacao(double num1,double num2) {
		r = num1*num2;
		resp = "O resultado da soma é: "+decimal.format(r);
		return resp;
	}
}
