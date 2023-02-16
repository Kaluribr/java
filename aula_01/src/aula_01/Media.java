package aula_01;

import java.util.Scanner;

public class Media {
	public static void main(String[]args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1,n2,n3,n4,media;
		
		System.out.println("Digire a Primeira nota do aluno: ");
		n1 = leia.nextFloat();
		System.out.println("Digire a Segunda nota do aluno: ");
		n2 = leia.nextFloat();
		System.out.println("Digire a Terceira nota do aluno: ");
		n3 = leia.nextFloat();
		System.out.println("Digire a Quarta nota do aluno: ");
		n4 = leia.nextFloat();
		
		media = (n1+n2+n3+n4)/4;
		
		System.out.printf("A média do seu Aluno é : %.1f", media);
		
		leia.close();
	}
}
