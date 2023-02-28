package beecrowd;

import java.util.Scanner;

public class SumofConsecutiveOddNumbersI {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num = leia.nextInt();
		
		for(int i = 0; i < num; i++) {
			
			int num1 = leia.nextInt();
			int num2 = leia.nextInt();
			int soma = 0;
			
			if(num1 < num2) {
				for(int j = num1 + 1; j < num2; j++) {
					if(j % 2 != 0) {
						soma = soma + j;
					}
				}
			}else {
				for(int j = num2 + 1; j < num1; j++) {
					if(j % 2 != 0) {
						soma = soma + j;
					}
				}
			}
			System.out.println(soma);
			
		}
		leia.close();

	}

}
