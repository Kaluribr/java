package aula_04;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int vetorInteiros[] = {1,2,3,4,5};
		
		float[] vetorFloat = new float[5];
		
		
		
		for(int indice = 0; indice < vetorFloat.length; indice++) {
			System.out.println("Digite um valor para a posiçã [" + indice + "]");
			vetorFloat[indice] = leia.nextFloat();
		}
		/* Usar o "var" pode ser necessario quando sabermos o tipo do vetor*/
		for(int contador = 0; contador < vetorInteiros.length; contador++)
			System.out.println(" posição " + contador + " numero " + vetorInteiros[contador]);
		
		Arrays.sort(vetorFloat); /* usado para colocar a lista do vetor em crescente*/
		
		for(var numero : vetorFloat)
			System.out.println(numero);

		leia.close();
	}

}
