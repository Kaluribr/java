package aula_03;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		//Faca enquanto o valor inserido for de 1 ate 10
		do {
			System.out.println("Digite a Tabuada que você deseja calcular: ");
			numero = leia.nextInt();
		}while(numero < 1 || numero > 10);
		
		for(int contador = 1; contador <= 10; contador ++) {
			System.out.println("\n" + numero + " X " + contador + " = " + (numero * contador));
		}
		
		leia.close();
	}

}
