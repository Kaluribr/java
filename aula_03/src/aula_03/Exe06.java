package aula_03;

import java.util.Scanner;

public class Exe06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero, soma = 0, quantidade = 0;
		float media = 0;
		
		do {
			System.out.println("Digite um numero : ");
			numero = leia.nextInt();
			
			if(numero % 3 == 0) {
				soma += numero;
				quantidade++;
			}
			
		}while (numero != 0);
		
		media = soma/quantidade;
		System.out.printf("A média de todos os números múltiplos de 3 é: " + media);

	}

}
