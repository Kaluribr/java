package calculadora;
import java.util.Scanner;

public class MenuCalculadora {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		Calculos calc = new Calculos();
		
		int opcao;
		double numero1, numero2;
		
		while(true) {
			
			System.out.println("1 - Soma");
			System.out.println("2 - Subitracao");
			System.out.println("3 - Multiplicacao");
			System.out.println("4 - Divisao\n");
			
			System.out.println("Digite o numero da Operacao");
			opcao = leia.nextInt();
			
			if(opcao == 0) {
				leia.close();
				System.exit(0);
			}
			
			System.out.println("Digite o primeiro numero");
			numero1 = leia.nextDouble();
			
			
			System.out.println("Digite o segundo numero");
			numero2 = leia.nextDouble();
			
		
			
			switch(opcao) {
			/*case com lambda*/
				case 1 -> System.out.println("Soma:" + calc.soma(numero1, numero2));
				case 2 -> System.out.println("subtracao:" + calc.subtracao(numero1, numero2));
				case 3 -> System.out.println("multiplicacao:" + calc.multiplicacao(numero1, numero2));
				case 4 -> System.out.println("divisao:" + calc.divisao(numero1, numero2));
				default -> System.out.println("Opcao Invalida");
			}
			
		}
		
	}
	
	

}
