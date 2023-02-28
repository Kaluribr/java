package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class sample {
	
	public static void envelheceAGalera (List<Pessoa> pessoa, int anos) {
	}
	
	public static void main(String[] args) {
		
		List<Integer> pessoas = new ArrayList<>();
		 
		
		pessoas.add(new Pessoa (19, "Danilo"));
		pessoas.add(new Pessoa (19, "Danilo"));
		pessoas.add(new Pessoa (19, "Danilo"));
		pessoas.add(new Pessoa (19, "Danilo"));
		pessoas.add(new Pessoa (19, "Danilo"));
		pessoas.add(new Pessoa (19, "Danilo"));
		
		Collections.sort(pessoas);
		
		for(Integer pessoa : pessoas) {
			if (pessoa.idade >= 18) {
				System.out.println(pessoa.nome);
			}
		}
		
	}
	
}
