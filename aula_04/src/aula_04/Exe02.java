package aula_04;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num;
		int vetorInteiro[] = {1,2,3,4,5,6,7,8,9,10};
		float[] vetorReal = new float[10];
		
		for(int indice = 0; indice < vetorReal.length; indice++) {
			System.out.println("Digite um valor para a posição [" + indice + "]");
			vetorReal[indice] = leia.nextFloat();
			
			
		}

	}

}
