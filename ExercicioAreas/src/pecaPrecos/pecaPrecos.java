package pecaPrecos;

import java.util.Scanner;
import java.util.Locale;

public class pecaPrecos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		//nomear as variaveis
		
		int codOne, codTwo,num1,num2;
		double preco1,preco2,total;
		
		//codigo1
		System.out.print("Codigo peça 1: ");
		codOne = scanner.nextInt();
		
		//numero de peças1
		System.out.print("Quantidade de peças: ");
		num1 = scanner.nextInt();
		
		//preço1
		System.out.print("Preço da peça: ");
		preco1 = scanner.nextDouble();
		
		//codigo2
		System.out.print("Codigo peça 2: ");
		codTwo = scanner.nextInt();
		
		//numero de peças2
		System.out.print("Quantidade de peças: ");
		num2 = scanner.nextInt();
				
		//preço2
		System.out.print("Preço da peça: ");
		preco2 = scanner.nextDouble();
				
		total = num1*preco1 + num2*preco2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		
		
		
		
		
		scanner.close();

	}

}
