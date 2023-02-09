package aula_02;

import java.util.Scanner;

public class CombraSwitch {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int cod, qnt, vt;

		System.out.println("######################## MENU ########################");
		System.out.println("---------Digite 1 para: Cachorro Quente --------------");
		System.out.println("---------Digite 2 para: X - Salada -------------------");
		System.out.println("---------Digite 3 para: X - Bacon --------------------");
		System.out.println("---------Digite 4 para: Bauru ------------------------");
		System.out.println("---------Digite 5 para: Refrigerante -----------------");
		System.out.println("---------Digite 6 para: Suco de laranja --------------");
		System.out.println("Numero: ");
		cod = leia.nextInt();

		switch (cod) {
		case 1:
			System.out.println("Você escolheu: Cachorro Quente");
			System.out.println("Quantidade: ");
			qnt = leia.nextInt();
			vt = qnt * 10;
			System.out.println("Valor total: " + vt);
			break;
		case 2:
			System.out.println("Você escolheu: X - Salada");
			System.out.println("Quantidade: ");
			qnt = leia.nextInt();
			vt = qnt * 15;
			System.out.println("Valor total: " + vt);
			break;
		case 3:
			System.out.println("Você escolheu: X - Bacon");
			System.out.println("Quantidade: ");
			qnt = leia.nextInt();
			vt = qnt * 18;
			System.out.println("Valor total: " + vt);
			break;
		case 4:
			System.out.println("Você escolheu: Bauru");
			System.out.println("Quantidade: ");
			qnt = leia.nextInt();
			vt = qnt * 12;
			System.out.println("Valor total: " + vt);
			break;
		case 5:
			System.out.println("Você escolheu: Refrigerante");
			System.out.println("Quantidade: ");
			qnt = leia.nextInt();
			vt = qnt * 8;
			System.out.println("Valor total: " + vt);
			break;
		case 6:
			System.out.println("Você escolheu: Suco de laranja");
			System.out.println("Quantidade: ");
			qnt = leia.nextInt();
			vt = qnt * 13;
			System.out.println("Valor total: " + vt);
			break;

		}

	}

}
