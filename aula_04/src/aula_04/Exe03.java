package aula_04;

import java.util.DoubleSummaryStatistics;

public class Exe03 {

	public static void main(String[] args) {
		
		int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int dp = 0, ds = 0;
		
		for(int indice = 0; indice < matriz.length; indice ++) {
			System.out.println("Diagonal Principal: " + matriz[indice][indice]);
			dp += matriz[indice][indice];
		}
		
		System.out.println("Soma dos elementos da Diagonal Principal: " + dp);
		
		for(int indice = 0; indice < matriz.length; indice ++) {
			System.out.println("Diagonal Secundaria: " + matriz[indice][matriz.length - 1 - indice]);
			ds += matriz[indice][matriz.length - 1 - indice];
		}
		System.out.println("Soma dos elementos da diagonal Secundaria : "+ ds);
	}

}
