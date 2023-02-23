package aula_03;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, sexo, categoria, backend = 0, frontend = 0, mobile = 0, full = 0;
		String continua = "S";
		
		while(continua.equalsIgnoreCase("S")) {
			
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
				
			System.out.println("Digite o sexo: ");
			sexo = leia.nextInt();
				
			System.out.println("Digite a categoria: ");
			categoria = leia.nextInt();
			// aqui foi feiro depois de esclarecer as variaveis 
			if (categoria == 1)
				backend ++;
			
			if (categoria == 2 && sexo == 2)
				frontend ++;
			
			if (categoria == 3 && sexo == 1 && idade > 40)
				mobile ++;
			
			if (categoria == 4 && sexo == 2 && idade < 30)
				full ++;
			
			System.out.println("Deseja continuar? (S/N)");
			leia.skip("\\R?");
			continua = leia.nextLine().toUpperCase();
			
			System.out.println("Total de pessoas desenvolvedoras Backend: "+ backend);
			System.out.println("Total de mulheres desenvolvedoras Frontend: "+ frontend);
			System.out.println("Total de homens desenvolvedoras Mobile: "+ mobile);
			System.out.println("Total de pessoas desenvolvedoras FullStack: "+ full);
			
		}
		
	}

}
