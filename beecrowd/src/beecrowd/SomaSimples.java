package beecrowd;

import java.util.Scanner;

public class SomaSimples {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n1, n2, soma;
		
		System.out.println("Digite o primeiro numero: ");
		n1 = leia.nextInt();
		System.out.println("Digite o segundo numero: ");
		n2 = leia.nextInt();
		
		soma = n1 + n2;
		
		System.out.println("SOMA = " + soma);
		
		leia.close();

	}

}
