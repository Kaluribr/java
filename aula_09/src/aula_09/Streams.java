package aula_09;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {

		//Já criadas com os metodos .asList que seria a mesmo que criar uma List.
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

		List<Integer> numerosDesordenados = Arrays.asList(6,7,8,1,4,5,9,10,2,3);

		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais","Espirito Santo", 
		"São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro");
		
		List<String> estados2 = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais", 
				"Espirito Santo", "Rio Grande do Sul", "Santa Catarina", "Paraná");

		
		//Exemplo - Método Map:
		System.out.println("\nExemplo - Método Map");
		
		List<Integer> numerosAoCubo = numeros.stream()
		        .map(x -> x*x*x)
		        .collect(Collectors.toList());
		
		System.out.println("\nNumeros elevados ao Cubo: " + numerosAoCubo);
		
		// METODO .filter
		
		List<Integer> numerosPares = numeros.stream()
		        .filter(x ->x%2 == 0)
		        .collect(Collectors.toList());
		
		System.out.println("\nNumeros Pares: " + numerosPares);
		
		// numeors .sorted
		List<Integer> numerosOrdenadosAsc = numerosDesordenados.stream()
		        .sorted()
		        .collect(Collectors.toList());
		
		System.out.println("\nNumeros em Ordem Crescente: " + numerosOrdenadosAsc);
		
		//.sorted
		List<Integer> numerosOrdenadosDesc = numerosDesordenados.stream()
		        .sorted(Comparator.reverseOrder())
		        .collect(Collectors.toList());
		
		System.out.println("\nNumeros em Ordem Decrescente: " + numerosOrdenadosDesc);
		
		//Utilizando o metodo .distinct podemos ter os estados sem repeticao
		List<String> estadosNaoDuplicados = estados.stream()
		        .distinct()
		        .collect(Collectors.toList());
		
		System.out.println("\nNumeros em Ordem Decrescente: " + estadosNaoDuplicados);
		
		//Estados iniciados com a letra R .filter(x -> x.toString().startsWith("R"))
		List<String> estadosIniciamLetraR = estados2.stream()
		        .filter(x -> x.toString().startsWith("R"))
		        .collect(Collectors.toList());
		
		System.out.println("\nEstados iniciados com a letra R: " + estadosIniciamLetraR);
		
		//Contagem de Estados com R
		long estadosIniciamLetraR1 = estados2.stream()
		        .filter(x -> x.toString().startsWith("R"))
		        .count();
		
		System.out.println("\nNumeros de Estados iniciados com a letra R: " + estadosIniciamLetraR1);
	}

}
