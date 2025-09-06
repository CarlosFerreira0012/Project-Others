package areasPolignos;

import java.util.Scanner;
import java.util.Locale;

public class areasPolignos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double A,B,C,AreaA,AreaB,AreaC,AreaD,AreaE;
		
		
		System.out.print("Digite a Variavel A: ");
		A = scanner.nextDouble();
		
		System.out.print("Digite a Variavel B: ");
		B = scanner.nextDouble();
		
		System.out.print("Digite a Variavel C: ");
		C = scanner.nextDouble();
		
		//a) a área do triângulo retângulo que tem A por base e C por altura.
		 AreaA = (A * C)/2;
		
		//b) a área do círculo de raio C. (pi = 3.14159) 
		 AreaB= 3.14159 * C * C;
		
		//c) a área do trapézio que tem A e B por bases e C por altura. 
		
		AreaC = (A + B)*C/2;
		
		//d) a área do quadrado que tem lado B.
		
		AreaD = B * B;
		
		//e) a área do retângulo que tem lados A e B.
		AreaE = A * B;
		
		System.out.printf(" Area Triangulo: %.3f%n",AreaA );
		System.out.printf("Area Circulo: %.3f%n",AreaB );
		System.out.printf("Area Trapezio: %.3f%n",AreaC );
		System.out.printf("Area Quadrado: %.3f%n",AreaD );
		System.out.printf("Area Retângulo: %.3f%n",AreaE );
		
		scanner.close();

	}

}
