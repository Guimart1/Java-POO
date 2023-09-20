package prjCalculadora;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Calculadora {
	//Limitar caracteres na variavel double
	DecimalFormat decimal = new DecimalFormat("0.0000");
	//Atributos de cálculo
	private double num1;
	private double num2;
	private double result;
	private String respostaDouble;
	
	//Getters e setters dos atributos principais
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	
	//Método de soma de números inteiros
	public void Soma() {
		//Conversão de número int para double
		int numInt1 = (int)num1;
		int numInt2 = (int)num2;
		int respNum = (int)numInt1+numInt2;
		JOptionPane.showInternalMessageDialog(null, "O resultado da soma é: "+respNum);
	}
	//Método de soma de números decimais
	public String Soma(double num1, double num2) {
		result = num1+num2;
		respostaDouble = "O resultado da soma é: "+decimal.format(result);
		return respostaDouble;
	}
	
	//Método de subtração de numeros inteiros
	public void Subtracao() {
		//Conversão de número int para double
		int numInt1 = (int)num1;
		int numInt2 = (int)num2;
		int result = (int)numInt1-numInt2;
		JOptionPane.showInternalMessageDialog(null, "O resultado da subtração é: "+result);
	}
	
	//Método de subtração de numeros decimais
	public String Subtracao(double num1, double num2) {
		result = num1-num2;
		respostaDouble = "O resultado da soma é: "+decimal.format(result);
		return respostaDouble;
	}
	
	//Método de divisão de numeros inteiros
	public void Divisao() {
		//Conversão de número int para double
		int numInt1 = (int)num1;
		int numInt2 = (int)num2;
		if (numInt1 == 0 || numInt2 == 0) {
			JOptionPane.showMessageDialog(null, "Não é possível fazer o cálculo divindo e(ou) sendo dividido por zero.");
		}else {
			result = (int)numInt1/numInt2;
			JOptionPane.showInternalMessageDialog(null, "O resultado da divisão é: "+decimal.format(result));
		}
	}
	
	//Método de divisão de numeros decimais
	public String Divisao(double num1, double num2) {
		if (num1 == 0 || num2 == 0) {
			return respostaDouble = "Não é possível fazer o cálculo divindo e(ou) sendo dividido por zero.";
		}else {
			result = num1/num2;
			respostaDouble = "O resultado da soma é: "+decimal.format(result);
			return respostaDouble;
		}

	}
	
	//Método de multiplicação de numeros inteiros
	public void Multiplicacao() {
		//Conversão de número int para double
		int numInt1 = (int)num1;
		int numInt2 = (int)num2;
		int r = (int)numInt1*numInt2;
		JOptionPane.showInternalMessageDialog(null, "O resultado da multiplicação é: "+r);
	}
	//Metodo de multiplicação de numeros decimaims
	public String Multiplicacao(double num1,double num2) {
		result = num1*num2;
		respostaDouble = "O resultado da soma é: "+decimal.format(result);
		return respostaDouble;
	}
}

