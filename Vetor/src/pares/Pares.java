package pares;

import java.util.Locale;
import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	
	System.out.print("Quantos numeros voce deseja: ");
	 int n = sc.nextInt();
	
	 int [] numeros = new int[n];
	 for( int i=0 ; i < n ; i++) {
		 System.out.print("Digite os numeros: ");
		 numeros[i] = sc.nextInt();
		 }
	 
	 System.out.println("\nEsses são os numeros pares: ");
	 int countPares = 0; 
	for( int i=0 ; i < n ; i++) {
		if( numeros[i] % 2 == 0 ) {
			System.out.println(numeros[i]);
			countPares++;
		}
	}
	
	  System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", countPares);//Mostraquantidade de pares
	
	
        sc.close();
	}
}