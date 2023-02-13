package aula_02;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int a, b, c, soma;

		System.out.println("Digite o número A: ");
		a = leia.nextInt();
		System.out.println("Digite o número B: ");
		b = leia.nextInt();
		System.out.println("Digite o número C: ");
		c = leia.nextInt();

		soma = a + b;

		if (soma > c)
			System.out.println("A Soma de A + B e Maior que C");
		if (soma < c)
			System.out.println("A Soma de A + B e Menor que C");
		if (soma == c)
			System.out.println("A Soma de A + B e Igual a C");

		leia.close();
	}

}
