package prjCalculadora;

import javax.swing.*;

public class App {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();

        Object[] opcoes = {"Adição", "Subtração", "Multiplicação", "Divisão"};
        Object selecaoOpcao = JOptionPane.showInputDialog(null, "Escolha a operação:", "Menu", JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
        String opcao = selecaoOpcao.toString();
        JOptionPane.showMessageDialog(null,"Você escolheu: "+ opcao);
        
        Object[] opTipos = {"Inteiro", "Decimal"};
        Object selecaoTipo = JOptionPane.showInputDialog(null, "Escolha o tipo de número:", "Menu", JOptionPane.PLAIN_MESSAGE, null, opTipos, opTipos[0]);
        String opcaoTipo = selecaoTipo.toString();
        
        String numStr = JOptionPane.showInputDialog("Digite o primeiro número: ");
        calc.setNum1 (Double.parseDouble(numStr));
		
		numStr = JOptionPane.showInputDialog("Digite o segundo número: ");
		calc.setNum2 (Double.parseDouble(numStr));
		
        switch(opcao) {
        	case "Adição":
        		if (opcaoTipo == "Inteiro") {
            		calc.Soma();
        		}else {
        			JOptionPane.showMessageDialog(null, calc.Soma(calc.getNum1(),calc.getNum2()));
        		}
        		break;
        	case "Subtração":
        		if (opcaoTipo == "Inteiro") {
            		calc.Subtracao();
        		}else {
        			JOptionPane.showMessageDialog(null, calc.Subtracao(calc.getNum1(), calc.getNum2()));
        		}
        		break;
        	case "Multiplicação":
        		if (opcaoTipo == "Inteiro") {
            		calc.Multiplicacao();
        		}else {
        			JOptionPane.showMessageDialog(null, calc.Multiplicacao(calc.getNum1(), calc.getNum2()));
        		}
        		break;
        	case "Divisão":
        		if (opcaoTipo == "Inteiro") {
            		calc.Divisao();
        		}else {
        			JOptionPane.showMessageDialog(null, calc.Divisao(calc.getNum1(), calc.getNum2()));
        		}
        		break;
        }

	}

}

