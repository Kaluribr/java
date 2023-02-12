package aula_03;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int n1, contImpar = 0, contPar = 0, contador;
		
		for (contador = 1; contador <= 10; contador++) {
			System.out.println("Digite o " + contador + "º número: ");
			n1 = leia.nextInt();
			
			if (n1 % 2 == 0) {
				contPar++;
			}
			if (n1 % 2 == 1) {
				contImpar++;
			}
			
		}
		System.out.println("Total de números pares: "+ contPar);
		System.out.println("Total de números ímpares: "+ contImpar);
	}

}
