package areaCirculo;

import java.util.Locale;
import java.util.Scanner;


public class areaCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner (System.in);
		
		//ler o raio
		
		System.out.print("Digite o valor do Raio: ");
		double R = scanner.nextDouble();
		
		//considerar pi 
		double r = 3.14159;
		
		
		//area 
		double A = r * Math.pow(R, R);
		
		System.out.printf("O valor da área do circulo é igual a: %.4f%n" ,A);
		
				
		
		
		scanner.close();
		
		

	}

}
