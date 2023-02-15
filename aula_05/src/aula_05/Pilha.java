package aula_05;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		
		pilha.add("Rony");
		pilha.add("Lucas");
		pilha.add("Isaac");
		pilha.add("Fernando");
		pilha.add("Laise");
		pilha.add("Danilo");
		pilha.add("Elizangela");
		
		for(var elemento : pilha)
			System.out.println(elemento);
		
		System.out.println("Remover 1 elemento da pilha"); 
		
		pilha.pop();
		
		for(var elemento : pilha)
			System.out.println(elemento);
		
		System.out.println("Topo da pilha: " + pilha.peek());
	}

}
