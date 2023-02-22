package aula_06;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteFarmacia {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<Farmacia> medicamentos = new ArrayList<Farmacia>();// Collections 
		
		long id;
		String nome, nomeComercial, fabricante, foto, opcao;
		float preco;
		
		
		
		do { // Fazer a incercao de dados varias vezes com loop
		System.out.println("\nId: " ); 		
		id = leia.nextLong();
		
 		System.out.println("\nNome: " );
 		leia.skip("\\R?");
 		nome = leia.nextLine();
 		
 		System.out.println("\nNome Comercial: " );
 		nomeComercial = leia.nextLine();
 		
 		System.out.println("\nFabricante: " );
 		fabricante = leia.nextLine();
 		
 		System.out.println("\nFoto: " );
 		foto = leia.nextLine();
 		
 		System.out.println("\nPreco: " );
		preco = leia.nextFloat();
		
		Farmacia f1 = new Farmacia(id, nome, nomeComercial, fabricante, foto, preco);
		
		medicamentos.add(f1);
		
		System.out.println("\nDeseja continuar: " );
 		leia.skip("\\R?");
 		opcao = leia.nextLine();
		
		}while(opcao.equalsIgnoreCase("S"));
		
		for(var medicamento : medicamentos)
			medicamento.visualizar();
		
		//Farmacia f2 = new Farmacia(2, "Paracetamol", "Tulenol", "Neo Quimica", "-", 20.0f);
		
		//f1.visualizar();
		//f2.visualizar();
		
		leia.close();
		//Conceitos importates : Para ter acesso aos objetos preciso de metotos que utiliza o metodo de encapsulamento.
	} 

}
