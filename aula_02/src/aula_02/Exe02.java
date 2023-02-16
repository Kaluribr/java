package aula_02;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int n;

		System.out.println("Digite o número: ");
		n = leia.nextInt();

		if (n % 2 == 0 && n > 0)
			System.out.println("O número " + n + " é par e positivo!");
		if (n % 2 != 0 && n < 0)
			System.out.println("O número " + n + " é impar e negarivo!");
		if (n % 2 == 0 && n < 0)
			System.out.println("O número " + n + " é par e negativo!");
		if (n % 2 != 0 && n > 0)
			System.out.println("O número " + n + " é impar e positivo!");
		
		leia.close();
	}

}
