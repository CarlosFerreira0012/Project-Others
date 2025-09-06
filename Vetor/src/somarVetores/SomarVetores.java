package somarVetores;

import java.util.Locale;
import java.util.Scanner;

public class SomarVetores {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;

		System.out.print("Quantos numeros voce deseja digitar? ");
		n = sc.nextInt();

		double[] vect = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Digite aqui o numero desejado: ");
			vect[i] = sc.nextDouble();
		}

		// valores Escolhidos
		System.out.println("valores escolhidos: ");

		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f  ", vect[i]);
		}

		// Somar todos os vetores

		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + vect[i];
		}

		// media
		double media;

		media = sum / n;

		System.out.printf("A Soma de todos os valores: ", sum);

		System.out.printf("A média é: %.2f%n", media);

		sc.close();
	}

}
