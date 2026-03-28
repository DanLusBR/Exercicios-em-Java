// Coordenadas
// Fazer um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

import java.util.Locale;
import java.util.Scanner;

public class Coordenadas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y;

	    System.out.print("Valor de X: ");
	    x = sc.nextDouble();

	    System.out.print("Valor de Y: ");
	    y = sc.nextDouble();

	    if (x == 0 && y == 0) {
	    	System.out.println("Origem");
	    }
	    else if (x == 0) {
	    	System.out.println("Eixo Y");
	    }
	    else if (y == 0) {
	    	System.out.println("Eixo X");
	    }
	    else if (x > 0 && y > 0) {
	    	System.out.println("Q1");
	    }
	    else if (x < 0 && y > 0) {
	    	System.out.println("Q2");
	    }
	    else if (x < 0 && y < 0) {
	    	System.out.println("Q3");
	    }
	    else {
	    	System.out.println("Q4");
	    }

		sc.close();
	}
}