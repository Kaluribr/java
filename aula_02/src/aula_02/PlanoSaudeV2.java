package aula_02;

import java.util.Scanner;

public class PlanoSaudeV2 {
	
	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	int faixa;
	
	System.out.println("Faixas Etarias");
	System.out.println("1\tAte 10 anos: ");
	System.out.println("2\tDe 11 ate 29 ");
	System.out.println("3\tDe 30 ate 45 ");
	System.out.println("4\tDe 46 ate 59 ");
	System.out.println("5\tDe 60 ate 65 ");
	System.out.println("6\tAcima de 66 ");
	
	
	System.out.println("Digite sua faixa etaria: ");
	
	faixa = leia.nextInt();
	
	switch(faixa){
		
	case 1:
		System.out.println("O Valor do Plano de Saúde será igual a R$ 100.00");
		break;
	case 2:
		System.out.println("O Valor do Plano de Saúde será igual a R$ 200.00");
		break;
	case 3:
		System.out.println("O Valor do Plano de Saúde será igual a R$ 300.00");
		break;
	case 4:
		System.out.println("O Valor do Plano de Saúde será igual a R$ 500.00");
		break;
	case 5:
		System.out.println("O Valor do Plano de Saúde será igual a R$ 600.00");
		break;
	case 6:
		System.out.println("O Valor do Plano de Saúde será igual a R$ 1000.00");
		break;
		
	}
		System.out.println("Faixa etaria nao valida");
	
	
	leia.close();
}
}
