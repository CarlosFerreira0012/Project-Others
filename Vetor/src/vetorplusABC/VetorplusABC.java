package vetorplusABC;

import java.util.Locale;
import java.util.Scanner;

public class VetorplusABC {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos numeros tera o seu vetor: ");
		int n = sc.nextInt();
		
		int [] a = new int[n];
		int [] b = new int[n];
		int [] c = new int[n];
		
		System.out.print("Digite os valores do vetor A: ");
		for( int i=0; i<n ; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.print("Digite os valores do vetor B: ");
		for( int i=0; i<n ; i++) {
			b[i] = sc.nextInt();
		}
		
		
		for( int i=0; i<n ; i++) {
			c[i] = a[i] + b[i];
		}
			
			
		System.out.println("Vetor resultante: ");
		for( int i=0; i<n ; i++) {
			System.out.printf("Vetor C: ", c[i]);
			
		}
		
		
		sc.close();
	}

}
