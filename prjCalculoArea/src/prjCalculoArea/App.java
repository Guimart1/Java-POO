package prjCalculoArea1;
import java.util.*;
import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Object[] opcoes = {"Retangulo", "Quadrado", "Triangulo"};
        Object selecaoOpcao = JOptionPane.showInputDialog(null, "Escolha a operação:", "Menu", JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
        String opcao = selecaoOpcao.toString();
        
        JOptionPane.showMessageDialog(null,"Você escolheu: "+ opcao);
        
        String numStr = JOptionPane.showInputDialog("Digite o valor da altura: ");
        double altura = Double.parseDouble(numStr);
		numStr = JOptionPane.showInputDialog("Digite o valor da base: ");
		double base = Double.parseDouble(numStr);
		FormaGeometrica c = new FormaGeometrica(altura, base);
		c.setAltura(altura);
		c.setBase(base);
	
		switch (opcao) {
			case "Quadrado":
				Quadrado q = new Quadrado(c.getAltura(), c.getBase());
				q.calculoArea();
				break;
			case "Retangulo":
				Retangulo r = new Retangulo(c.getAltura(), c.getBase());
				r.calculoArea();
				break;
			case "Triangulo":
				Triangulo t = new Triangulo(c.getAltura(), c.getBase());
				t.calculoArea();
				break;
			default:
				System.out.println("Opção inválida.");
		}
	
	}

}

