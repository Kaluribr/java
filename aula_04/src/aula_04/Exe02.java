package aula_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		
		int[] vetor = new int[10];
		int[] vetorImpares = new int[10];
		int[] vetorPares = new int[10];
		float media;
		int soma = 0;
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0; i < 10; i ++) {
			System.out.println("Entre com o numero a ser colocado na " + (i + 1) + " posição: ");
			vetor[i] = leia.nextInt();
		}
		leia.close();
		
		for(int posicao = 0; posicao < vetor.length; posicao ++) {
			soma += vetor[posicao];
			if(posicao % 2 != 0)
				vetorImpares[posicao] = vetor[posicao];
			
			if(posicao % 2 == 0)
				vetorPares[posicao] = vetor[posicao];
		}
		
		System.out.println("Os números nas casas ímpares são: ");
		for(int i = 0; i < vetorImpares.length; i++) {
			if(vetorImpares[i] != 0)
				System.out.print(vetorImpares[i] + " ");
		}
		
		System.out.println("\n\nOs números pares são: ");
		for(int i = 0; i < vetorPares.length; i++) {
			if(vetorPares[i] != 0)
				System.out.print(vetorPares[i] + " ");
		}
		
		System.out.println("\n\nA soma dos valores é: " + soma);
		
		media = (float)soma/vetor.length; 
		System.out.println("A média é: " + media);
		
	}

}
