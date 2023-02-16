package aula_01;

import java.util.Scanner;

public class SalarioBruto {
		public static void main(String[]args){
			
			Scanner leia = new Scanner(System.in);
			
			float SalB, AdNo, HorEx, Desco,SalaL;
			
			System.out.printf("Digite o valor do Sálario bruto: ");
			SalB = leia.nextFloat();
			System.out.printf("Digite o valor do Adicional Noturno: ");
			AdNo = leia.nextFloat();
			System.out.printf("Digite o valor das Horas Extras: ");
			HorEx = leia.nextFloat();
			System.out.printf("Digite o valor do Desconto: ");
			Desco = leia.nextFloat();
			
			SalaL = SalB + AdNo + (HorEx * 5) - Desco;
			
			System.out.printf("Seu Sálario Liquido é: %s", SalaL);
			
			leia.close();
		}
		
}
