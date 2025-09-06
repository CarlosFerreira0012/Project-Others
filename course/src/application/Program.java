//course = Exemplos da aula.



package application; // Resolvendo sem Orientação a Objetos( O.o )

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle; //Importou o pacote Entities

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		/* Antes: Muita variavel solta --> double xA, xB, xC, yA, yB, yC; */

		// DEPOIS --> Ctrl+Shift+O => Importa a class de entities
		Triangle x, y; // Para funcionar tem que INSTANSIAÇÃO(alocar um endereço de memoria do objeto
						// que foi criado no HEAP.Exemplo abaixo:

		x = new Triangle(); // Depois: Reduziu a uma Unica Variavel o Triangle.
		y = new Triangle();

		System.out.println("Enter the measures of triangle X: ");

		/*
		 * Antes: xA = sc.nextDouble(); xB = sc.nextDouble(); xC = sc.nextDouble();
		 */

		// Ler o numero e guarda ele em um atributo do (Objeto X )= (Triangle X )
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Enter the measures of triangle Y: ");

		/*
		 * Antes: yA = sc.nextDouble(); yB = sc.nextDouble(); yC = sc.nextDouble();
		 */

		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		/*
		 * 1- Mesma logica p/ Trangulos Diferentes 2- Tudo que for sobre os Triangulos
		 * devem estar na classe triangulo
		 * 
		 * 
		 * // Antes: double p = (xA + xB + xC) / 2.0;
		 * 
		 * double p = (x.a + x.b + x.c) / 2.0; ( Logica igual )*
		 * 
		 * // Antes: double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		 * 
		 * double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c)); (Logica
		 * igual )
		 * 
		 * // Antes: p = (yA + yB + yC) / 2.0;
		 * 
		 * double p = (y.a + y.b + y.c) / 2.0; ( Logica igual )
		 * 
		 * // Antes: double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		 * 
		 * double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c)); ( Logica
		 * igual )
		 
		System.out.printf("Triangle X area: %.4f%n", X.area);
		System.out.printf("Triangle Y area: %.4f%n", Y.area);
		 */
		
		double areaX = x.area(); // area X = Objeto X . area ( ) para indicar que esta chamando o metodo
		double areaY = y.area();

		if (areaX > areaY ) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		sc.close();
	}
}
