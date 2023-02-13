package aula_04;

import java.util.Scanner;

public class vetor02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String mes[] = {"Jan","Fev","Mar","Abr","Mai",
				"Jun","Jul","Ago","Set","Out","Nov","Dez"};
		int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for(int c = 0; c < mes.length; c++){
			System.out.println("O mês de " + mes[c] + " tem " + tot[c] + " dias ao todo");
		}

	}

}
