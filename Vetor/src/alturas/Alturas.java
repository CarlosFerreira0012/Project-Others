package alturas;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	
		int n;
		System.out.print("Quantos cadastro você deseja fazer: ");
		n = sc.nextInt();
		
		
		// vetores
		
		String [] nomes = new String[n];
		int [] idades = new int[n];
		double [] alturas = new double[n];
		
		for( int i=0 ; i < n ; i++) {
			
			System.out.printf("Dados da " + (i+1) + "a pessoa: ");
			
	    	System.out.print("Nome: ");
	        nomes[i] = sc.next();
	        
	        System.out.print("Idade: ");
	        idades[i] = sc.nextInt();
	        
	        System.out.print("Altura: ");
	        alturas[i] = sc.nextDouble();
				
		}
		
		 int menores = 0;
		double alturatotal = 0;
		
	    for (int i=0; i<n; i++) {
	        if (idades[i] < 16) {
	            menores++;
	        }
	        alturatotal = alturatotal + alturas[i];
	    }

	    double alturamedia = alturatotal / n;
	    double percentualMenores = ((double)menores / n) * 100.0;

	    System.out.printf("\nAltura media = %.2f\n", alturamedia);
	    System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

	    for(int i=0; i<n; i++) {
	        if (idades[i] < 16) {
	        	System.out.printf("%s\n", nomes[i]);
	        }
	    }
		
		sc.close();

	}

}

