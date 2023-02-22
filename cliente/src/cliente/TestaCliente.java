package cliente;

import java.util.Scanner;

public class TestaCliente {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Cliente c1 = new Cliente("Danilo", 1, "Rua dos bobos", 4000.0f, 0.0f);
		
		
		c1.visualizar();
		
		System.out.println("\n O Credito do cliente é " + c1.getCredito());
		
		c1.setSaldo(2000.0f);
		
		c1.setCredito(4000.0f);
		
		c1.visualizar();
		
		PessoaJuridica pj1 = new PessoaJuridica("Nilo de Moraes", 2, "Rua dos bobos", 100000.0f, 0, 1234, "Livros");
		
		pj1.visualizar();
		
		PessoaFisica pf1 = new PessoaFisica("Nilo de Moraes", 1, "Rua dos bobos", 100000.0f, 0, 1234);
		
		pf1.visualizar();
		
		leia.close();
	}

}
