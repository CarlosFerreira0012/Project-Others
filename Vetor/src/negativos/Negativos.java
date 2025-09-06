package negativos;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Passo 1: Definir a variavel
		int n;
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();

		// Passo 2: Criar o Vetor para armazenar cada valor digitado.
		int[] vect = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}

		// Passo 3: Print dos negativos utilizando for .. para todo vaor
		// armazenado/aquele vetor < 0 / será printado.
		System.out.println("NUMEROS NEGATIVOS: ");

		for (int i = 0; i < n; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}

		sc.close();
	}

}
