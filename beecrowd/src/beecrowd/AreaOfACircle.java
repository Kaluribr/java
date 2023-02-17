package beecrowd;

import java.util.Scanner;

public class AreaOfACircle {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float R, A;
		
		System.out.println("\n Digite um valor para R ");
		R = leia.nextFloat();
		
		A = (float) (3.14159 * Math.pow(R, 2));
		
		System.out.println(A);

	}

}
