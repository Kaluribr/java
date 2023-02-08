package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Variaveis {
	
		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			
			int numero;
			String nome;
			double area;
			
			System.out.println("Digite um numero inteiro: ");
			numero = leia.nextInt();
			
			System.out.println("Digite um nome: ");
			leia.skip("\\R?");
			nome = leia.nextLine();
			
			System.out.println("O numero real: ");
			area = leia.nextDouble();
			
			
			
			System.out.println("O nome da participante e: " + nome);
			System.out.println("O numero e: " + numero);
			System.out.printf("O numero e: %.2f\n", area);
			
			
			
			
			
		}
}
