package aula_02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("##.##");
		
		Scanner leia = new Scanner(System.in);
		
		double n1, n2;
		
		System.out.println("Digite o 1 numero: ");
		n1 = leia.nextDouble();
		
		System.out.println("Digite o 2 numero: ");
		n2 = leia.nextDouble();
		
		System.out.println("O do numero " + n1 + " somado ao " + n2 + " e igual a " +(n1 + n2));
		
		System.out.println("O do numero " + n1 + " subtraido ao " + n2 + " e igual a " +(n1 - n2));
		
		System.out.println("O do numero " + n1 + " mutiplicado ao " + n2 + " e igual a " +(n1 * n2));
		
		if (n2 != 0)
		System.out.println("O do numero " + n1 + " dividido ao " + n2 + "e igual a " +(n1 / n2));
		else 
			System.out.println("Nao e possivel dividir um numero por zero");
		/*System.out.println("Pre Incremento");
		System.out.println(n1);
		System.out.println(++ n1);
		
		System.out.println("Pos Incremento");
		System.out.println(n2);
		System.out.println(n2 ++);
		System.out.println(n2);
		
		System.out.println("A soma de n1 + n2 e igual a: " + (n1 += n2));
		System.out.println("O novo valor de n1 e igual a : " + n1);*/
			
		leia.close();
	}

}
