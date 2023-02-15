package aula_05;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		ArrayList <String> cores = new ArrayList<String>();
		
		String cor;
	
		
		for(int cont = 0; cont <= 4; cont++) {
			System.out.println("\nDigite a cor: ");
			cor = leia.nextLine();
			cores.add(cor);
			
		}
		System.out.println("\nListar todas as cores:");
		for(var corLista : cores) { 
			System.out.println(corLista);
			
		}
		System.out.println("\nOrdenar as cores: ");
		cores.sort(null);
		for(var corLista : cores) { 
			System.out.println(corLista);
		}
		//System.out.println("Listar todas as cores: ");
		//System.out.println(cores);
		leia.close();
	}

}
