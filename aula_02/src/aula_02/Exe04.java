package aula_02;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String animal01, animal02, animal03;

		System.out.println("Digite o 1 animal");
		leia.skip("\\R?");
		animal01 = leia.nextLine();

		System.out.println("Digite o 2 animal");
		leia.skip("\\R?");
		animal02 = leia.nextLine();

		System.out.println("Digite o 3 animal");
		leia.skip("\\R?");
		animal03 = leia.nextLine();

		if (animal01.equalsIgnoreCase("vertebrado")) {

			if (animal02.equalsIgnoreCase("ave")) {
				if (animal03.equalsIgnoreCase("carnivoro"))
					System.out.println("Águia");
				else
					System.out.println("Pomba");
			} else {
				if (animal03.equalsIgnoreCase("Onivoro"))
					System.out.println("Homem");
				else
					System.out.println("Vaca");
			}
		} else {
			if (animal01.equalsIgnoreCase("invertebrado")) {
				
				if (animal02.equalsIgnoreCase("inseto"))
					if (animal03.equalsIgnoreCase("Hematofago"))
					System.out.println("Pulga");
				else
					System.out.println("Lagarta");
			} else {
				if (animal03.equalsIgnoreCase("onivoro"))
					System.out.println("Homem");
				else
					System.out.println("Vaca");
			}
		}

	}

}
