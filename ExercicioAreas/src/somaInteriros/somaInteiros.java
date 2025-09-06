package somaInteriros;

import java.util.Scanner;

public class somaInteiros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Aqui para ler valor do teclado
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o Valor A: ");
		int A = scanner.nextInt();
		 
		System.out.print("Digite o valor B: ");
		int B = scanner.nextInt();
		
		
		int soma = A + B;
		
		System.out.println("A soma de " + A + " e " + B + " é igual a " + soma);
		
		//fechar scanner
		scanner.close();
		
		
		

	}

}

