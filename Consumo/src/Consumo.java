// Consumo
// Fazer um programa para ler a distância total percorrida por um carro, bem como o total de combustível gasto por ele. O programa deve calcular e mostrar o consumo médio do automóvel, com três casas decimais.

import java.util.Locale;
import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int distancia;
	    double gasto, consumo;

	    System.out.print("Distancia percorrida(Em KM):  ");
	    distancia = sc.nextInt();

	    System.out.print("Combustivel gasto(Em Litros): ");
	    gasto = sc.nextDouble();

	    consumo = distancia/gasto;

		System.out.printf("Consumo medio = %.3f\n", consumo);

		sc.close();
	}
}