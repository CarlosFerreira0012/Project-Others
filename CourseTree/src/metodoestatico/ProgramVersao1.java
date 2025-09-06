/*Fazer um programa para ler um valor numérico qualquer, e daí mostrar quanto seria o valor de uma circunferência e do volume de uma esfera 
para um raio daquele valor. Informar também o valor de PI com duas casas decimais.

Enter radius: 3.0
Circumference: 18.85
Volume: 113.10
PI value: 3.14
*/



//VERSÃO 3 => Usa membro estatico na calculator e chama ela no programa principal pelo Calculator.circumference / Calculator.volume e etc...

package metodoestatico;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class ProgramVersao1 {
	// Defini a constante no pacote Util
	// public static final double PI = 3.14159; //Final = Significa que Pi é uma
	// CONSTANTE, ele nao vai mudar..... se fosse mais de uma palavra ( PI ==
	// NET_SALARY )

	Calculator calc = new Calculator(); // Aqui tornei os membros do pacote UTIL(Calculator) ==> Estáticos --> Porque la
										// na classe eles são Estâncias.

	public void main() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();

		double c = calc.circumference(radius);
		double v = calc.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);
		sc.close();
	}
	
	/*
	 * coloquei as funções no pacote util.
	 * 
	 * public static double circumference(double radius) { //Static return 2.0 * PI
	 * * radius; }
	 * 
	 * public static double volume(double radius) { //Static return 4.0 * PI *
	 * radius * radius * radius / 3.0;
	 * 
	 * }
	 */
}
