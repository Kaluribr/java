package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<Double> notas = new ArrayList<Double>();//A Collection ArrayList
		
		int opcao = 0;
		
		double nota = 0.0;
		
		do {
			
			System.out.println("1- Cadastrar nota");
			System.out.println("2- Listar todas as notas");
			System.out.println("3- Buscar uma nota");
			System.out.println("4- Remover uma nota");
			System.out.println("5- Atualizar uma nota");
			System.out.println("6- Para sair");
			System.out.println("Digite a opção desejada");
			opcao = leia.nextInt();
			// condicao
			
			switch(opcao) {
			case 1:
				System.out.println("Digite uma nota entre 1 e 10");
				nota = leia.nextDouble();
				notas.add(nota);//Adiciona um objeto no final da lista.
				if(nota > 10)
					System.out.println("Digite novamente");
				break;
			case 2:
				System.out.println("Listar todas as Notas");
				if(notas.isEmpty())
					System.out.println("Base de dados vazia!");
				else
				for(var listaNota : notas)
				System.out.println(listaNota);
				//notas.forEach(System.out::println); pode ser tirado as 2 linhas de cima
				
				break;
			case 3:
				System.out.println("Procurar uma nota");
				//Saber se existe uma nota com o metodo Conteins ou Intexof se tem o dado e qual posicao
				System.out.println("Digite uma nota");
				nota = leia.nextDouble();
				System.out.println("A nota " + nota + " existe? " + notas.contains(nota));
				
				System.out.println("O indice da minha nota e: " + notas.indexOf(nota));
				break;
			case 4: 
				System.out.println("Remover uma nota");
				System.out.println("Digite a nota: ");
				nota = leia.nextDouble();
				notas.remove(nota); // nota
				
				break;
			case 5:
				System.out.println("Atualizar uma nota");
				System.out.println("Digite a nota atual: ");
				nota = leia.nextDouble();
				System.out.println("Digite a nova nota: ");
				double notaNova = leia.nextDouble();
				notas.set(notas.indexOf(nota), notaNova);
				
				break;
			default:
				if (opcao > 6)
					System.out.println("Opcao invalida");
			}
			
		}while(opcao != 6);

	}

}
