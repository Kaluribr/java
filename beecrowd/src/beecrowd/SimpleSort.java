package beecrowd;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleSort {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[] numbers = {7, 21, -14};
		Arrays.sort(numbers);
		
		System.out.println(Arrays.toString(numbers));
		

	}

}
