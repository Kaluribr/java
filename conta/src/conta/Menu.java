package conta;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
					
		while (true) {
			
			System.out.println("****************************************************************");
			System.out.println("                                                                ");
			System.out.println("                   BANCO DOS 10CONTOS                           ");
			System.out.println("                                                                ");
			System.out.println("****************************************************************");
			System.out.println("                                                                ");
			System.out.println("               1 - Criar Conta                                  ");
			System.out.println("               2 - Listar todas as Contas                       ");
			System.out.println("               3 - Buscar Conta por Numero                      ");
			System.out.println("               4 - Atualizar Dados da Conta                     ");
			System.out.println("               5 - Apagar Conta                                 ");
			System.out.println("               6 - Sacar                                        ");
			System.out.println("               7 - Depositar                                    ");
			System.out.println("               8 - Transferir valores entre Contas              ");
			System.out.println("               9 - Sair                                         ");
			System.out.println("                                                                ");
			System.out.println("****************************************************************");
			System.out.println("Entre com a opção desejada:                                     ");
			System.out.println("                                                                ");
			
			opcao = leia.nextInt();
			if(opcao == 9) {
				System.out.println("BANCO DOS 10CONTOS - Os Futuro dos seus 10CONTOS começa aqui! ");
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1 -> System.out.println("Criar Conta \n\n");
			case 2 -> System.out.println("Criar Conta \n\n");
			case 3 -> System.out.println("Criar Conta \n\n");
			case 4 -> System.out.println("Criar Conta \n\n");
			case 5 -> System.out.println("Criar Conta \n\n");
			case 6 -> System.out.println("Criar Conta \n\n");
			case 7 -> System.out.println("Criar Conta \n\n");
			case 8 -> System.out.println("Criar Conta \n\n");
			}
			
		}
	}

}
