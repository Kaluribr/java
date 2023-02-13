package aula_04;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num, local = 0, vetorInteiro [] = {2,5,1,3,4,9,7,8,10,6};
		
		
		System.out.println("Digite o número que você deseja encontrar: ");
		num = leia.nextInt();
		
		for (int indice = 0; indice < vetorInteiro.length; indice ++) {
			if(num == vetorInteiro[indice]) {
				System.out.println("O " + num + " esta na posição " + indice);
				local = 1;
			}
		}
		
		if(local == 0)
			System.out.println("O número " + num + " não foi encontrado!");
		
		leia.close();

	}

}
