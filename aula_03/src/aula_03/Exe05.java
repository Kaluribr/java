package aula_03;

import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int n1 = 1, somaP = 0;
		
		do{
			System.out.println("Digite um número:");
			n1 = leia.nextInt();
			
			if (n1 > 0)
				somaP += n1;
			
			
		} while(n1 != 0);
		
		System.out.println("A soma dos números positivos é: "+ somaP);
	}
	
}
