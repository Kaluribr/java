package beecrowd;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int N,hours,minutes,seconds;
		
		System.out.println("Digite um valor: ");
		N = leia.nextInt();
		
		hours = N / 3600;
		minutes = (N % 3600) / 60;
		seconds = N % 60;
		

		System.out.println(hours+":"+ minutes+":"+ seconds);
		
		leia.close();
	}

}
