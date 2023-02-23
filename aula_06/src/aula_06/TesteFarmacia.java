package aula_06;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteFarmacia {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ArrayList<Farmacia> farmacia = new ArrayList<Farmacia>();// Collections

		long id;
		String nome, nomeComercial, fabricante, foto, opcao, principioAtivo, fragancia;
		float preco;
		int tipo;

		do { // Fazer a incercao de dados varias vezes com loop
			System.out.println("\nId: ");
			id = leia.nextLong();

			System.out.println("\nNome: ");
			leia.skip("\\R?");
			nome = leia.nextLine();

			System.out.println("\nNome Comercial: ");
			nomeComercial = leia.nextLine();

			System.out.println("\nFabricante: ");
			fabricante = leia.nextLine();

			System.out.println("\nFoto: ");
			foto = leia.nextLine();

			System.out.println("\nPreco: ");
			preco = leia.nextFloat();

			System.out.println("\nTipo: ");
			tipo = leia.nextInt();

			switch (tipo) {
			case 1 -> {
				System.out.println("\nPrincipio ativo: ");
				leia.skip("\\R?");
				principioAtivo = leia.nextLine();
				Medicamento m1 = new Medicamento(id, nome, nomeComercial, fabricante, foto, preco, tipo,
						principioAtivo);
				farmacia.add(m1);
			}
			case 2 -> {
				System.out.println("\nFragamcia ativo: ");
				leia.skip("\\R?");
				fragancia = leia.nextLine();
				Perfumaria p1 = new Perfumaria(id, nome, nomeComercial, fabricante, foto, preco, tipo, fragancia);
				farmacia.add(p1);
			}
			}


			System.out.println("\nDeseja continuar: ");
			leia.skip("\\R?");
			opcao = leia.nextLine();

		} while (opcao.equalsIgnoreCase("S"));

		for (var produto : farmacia) {
			produto.reajuste(0.10f);
			produto.visualizar();
		}
			

		// Farmacia f2 = new Farmacia(2, "Paracetamol", "Tulenol", "Neo Quimica", "-",
		// 20.0f);

		// f1.visualizar();
		// f2.visualizar();

		leia.close();
		// Conceitos importates : Para ter acesso aos objetos preciso de metotos que
		// utiliza o metodo de encapsulamento.
	}

}
