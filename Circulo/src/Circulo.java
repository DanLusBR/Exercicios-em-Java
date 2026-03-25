// Circulo
// Fazer um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com três casas decimais. A fórmula da área do círculo é a seguinte: area = π . raio2. Considere o valor de π = 3.14159.

import java.util.Locale;
import java.util.Scanner;

public class Circulo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double r, area;

	    System.out.print("Digite o valor do raio do circulo: ");
	    r = sc.nextDouble();

	    area = 3.14159 * r * r;

	    System.out.printf("AREA = %.3f\n", area);

		sc.close();
	}
}