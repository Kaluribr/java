package aula_08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) throws MinhaExcecao{
		
		int dividendo = 0;
		int divisor = 0;
		boolean loop = true;
		
		do {
		try {
			System.out.println("Digite o Dividendo: ");
			dividendo = ler.nextInt();
				
			System.out.println("Digite o Divisor: ");
			divisor = ler.nextInt();
		
			divide(dividendo, divisor);
			
			loop = false;
			
		}catch(InputMismatchException e) {
			System.err.println("Execao: " + e);
			ler.nextLine();
			System.out.println("Digite somente numeros!");
		}catch(java.lang.ArithmeticException e) {
			System.err.println("Execao: " + e);
			ler.nextLine();
			System.out.println("Digite numeros diferente de zero!");
		}/*finally {
			System.out.println("Sempre serei executado!");
		}*/
		
	  }while(loop);
		
	}

	public static void divide(int dividendo, int divisor) throws MinhaExcecao{
		System.out.println("Divisão = " + (dividendo / divisor));
		
		if ((dividendo / divisor) > 5)
			throw new MinhaExcecao("A divisao e maior do que 5");
	}
}
