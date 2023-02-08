package aula_01;

import java.util.Scanner;

public class Atvd1 {
	public static void main(String[]args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salario, abono, soma;
		
		System.out.println("Digite o Salario: ");
		salario = leia.nextFloat();
		System.out.println("Digite o Abono: ");
		abono = leia.nextFloat();
		
		soma = salario + abono;
		
		System.out.printf("Seu Novo salario e de: %s",soma);
		
	}

}
