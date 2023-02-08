package aula_01;

import java.util.Scanner;

public class Diferenca {
		public static void main(String[]args) {
			Scanner leia = new Scanner(System.in);
			
			int n1, n2, n3, n4, dif;
			System.out.println("Digire o Primeiro número: ");
			n1 = leia.nextInt();
			System.out.println("Digire o Segundo número: ");
			n2 = leia.nextInt();
			System.out.println("Digire o Terceiro número: ");
			n3 = leia.nextInt();
			System.out.println("Digire o Quarto número: ");
			n4 = leia.nextInt();
			
			dif = (n1 * n2) - (n3 * n4);
			
			System.out.printf("A difetença é: %d", dif);
		}
}
