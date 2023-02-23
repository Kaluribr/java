package aula_03;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 0, continua =  0, maior = 0, menor = 0;
		
		while(continua == 0) {
			
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			
			if (idade < 21 && idade > 0)
				menor ++;
			
			if (idade > 50 && idade > 0)
				maior ++;
			
			if (idade < 0)
				continua ++;
			
		}
		
		
		
		System.out.println("\nTotal de pessoas menores de 21 anos: " + menor);
		System.out.println("Total de pessoas maiores de 50 anos: " + maior);
	}

}
