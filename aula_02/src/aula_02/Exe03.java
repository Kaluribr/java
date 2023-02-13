package aula_02;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean primeira;
		
		System.out.println("Digite o Nome do doador: ");
		leia.skip("\\R?");
		nome = leia.nextLine();
		
		System.out.println("Digite a Idade do doador: ");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação de sangue? ");
		primeira = leia.nextBoolean();
		
		if(idade >= 18 && idade <= 50){
			System.out.println(nome + " está apta para doar sangue!");
			if(idade > 51 && idade <= 60 && primeira) {
				System.out.println(nome + " não está apto para doar sangue!");
			}
		}else
			System.out.println(nome + " está apta para doar sangue!");
	}

}
