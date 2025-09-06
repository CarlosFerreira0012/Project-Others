package quatroInteiros;

import java.util.Scanner;

public class quatroInteiros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o Valor A: ");
		int A = scanner.nextInt();
		
		System.out.print("Digite o Valor B: ");
		int B = scanner.nextInt();
		
		System.out.print("Digite o Valor C: ");
		int C = scanner.nextInt();
		
		System.out.print("Digite o Valor D: ");
		int D = scanner.nextInt();

		
		int difference = (A * B) - (C * D);
		
		System.out.println("A diferença entre os produtos AB e CD: " + difference);
		
		scanner.close();
	}

}
