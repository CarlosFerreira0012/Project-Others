/* Exercicio 2
  
  Fazer um programa para ler um número inteiro N e os dados (nome e
preço) de N Produtos. Armazene os N produtos em um vetor. Em
seguida, mostrar o preço médio dos produtos.
  
  input                                   
  3   TV 900.00 Fryer 400.00 Stove 800.00
  
  output
  AVERAGE PRICE = 700.00
  */

package apllication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for( int i=0 ; i < vect.length ; i++) { // n = vect.length( É exatamente o tamanho do vetor
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			vect[i] = new Product(name, price);
			
		}
		
		double sum = 0.0;
		for ( int i=0 ; i < vect.length ; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("Average price = %.2f%n", avg);
		
		
		
		sc.close();
	}

}
