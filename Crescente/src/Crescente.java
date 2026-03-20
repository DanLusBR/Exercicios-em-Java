// Problema: Crescente ou Decrescente
// Leia uma quantidade indeterminada de duplas de valores inteiros x e y. Para cada dupla, o programa deve imprimir uma mensagem indicando se esses valores foram digitados em ordem Crescente ou Decrescente. Caso os 
// valores sejam iguais, o programa deve encerrar a leitura de dados e ser finalizado.

import java.util.Locale;
import java.util.Scanner;

public class Crescente {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y;

	    System.out.println("Digite dois numeros:");
	    x = sc.nextInt();
	    y = sc.nextInt();

	    while (x != y) {
	        if (x > y) {
	        	System.out.println("DECRESCENTE!");
	        }
	        else {
	        	System.out.println("CRESCENTE!");
	        }

	        System.out.println("Digite outros dois numeros:");
		    x = sc.nextInt();
		    y = sc.nextInt();
	    }

		sc.close();
	}
}