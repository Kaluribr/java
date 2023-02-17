package cliente;

import java.util.Scanner;

public class TestaCliente {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Cliente c1 = new Cliente("Danilo", 1, "Rua dos bobos", 2000.0f, 0.0f);
		
		c1.vizualizar();
		
		System.out.println("\n O Credito do cliente é " + c1.getCredito());
		
		c1.setSaldo(2000.0f);
		
		c1.vizualizar();
	}

}
