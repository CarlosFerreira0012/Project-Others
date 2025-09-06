
import java.util.Scanner;

public class WhileExercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int Alcool = 0;
		int Gasolina = 0;
		int Diesel = 0;
		int tipo;

		System.out.println("Qual é o tipo de combustível abastecido: ");
		tipo = sc.nextInt();

		while (tipo != 4) {
			if (tipo == 1) {
				Alcool = Alcool + 1;
			} else if (tipo == 2) {
				Gasolina = Gasolina + 1;
			} else if (tipo == 3) {
				Diesel = Diesel + 1;
			}

			tipo = sc.nextInt();
		}

		System.out.println(" Muito Obrigado! ");
		System.out.println("Alcool: " + Alcool);
		System.out.println("Gasolina: " + Gasolina);
		System.out.println("Diesel: " + Diesel);

		sc.close();

	}

}
