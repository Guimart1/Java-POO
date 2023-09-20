package prjCalculoArea;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Escolha a forma geométrica na qual deseja calcular a área: \n1-Quadrado\n2-Retangulo\n3-Triangulo");
		int d = ler.nextInt();
		System.out.println("Insira os valores da base e da altura:");
		FormaGeometrica c = new FormaGeometrica(ler.nextInt(), ler.nextInt());
		switch (d) {
			case 1:
				Quadrado q = new Quadrado(c.altura, c.base);
				q.calculoArea();
				break;
			case 2:
				Retangulo r = new Retangulo(c.altura, c.base);
				r.calculoArea();
				break;
			case 3:
				Triangulo t = new Triangulo(c.altura, c.base);
				t.calculoArea();
				break;
			default:
				System.out.println("Opção inválida.");
		}
	
	}

}
