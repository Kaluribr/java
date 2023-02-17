package funcionario;

import java.util.Scanner;

public class TestaFuncionario {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Funcionario f1 = new Funcionario ("Danilo Moraes", 1, 5000.0f);
		
		System.out.println("\n O Credito do cliente é " + f1.getSalario());
		
		f1.vizualizar();
		
		f1.setSalario(2000.0f);
		
		f1.vizualizar();

	}

}
