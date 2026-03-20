// Problema: Menor de Três
// Faça um programa que leia três números inteiros. Em seguida, o programa deve identificar e mostrar qual é o menor entre os três valores lidos. Caso haja valores iguais que sejam os menores, o programa deve simplesmente
// retornar o valor de um deles.

import java.util.Locale;
import java.util.Scanner;

public class Menor_de_tres {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, menor;

	    System.out.print("Primeiro valor: ");
	    a = sc.nextInt();
	    System.out.print("Segundo valor: ");
	    b = sc.nextInt();
	    System.out.print("Terceiro valor: ");
	    c = sc.nextInt();
		

	    if (a < b && a < c) {
	        menor = a;
	    }
	    else if (b < c) {
	        menor = b;
	    }
	    else {
	        menor = c;
	    }
		
	    System.out.printf("MENOR = %d\n", menor);

		sc.close();
	}
}