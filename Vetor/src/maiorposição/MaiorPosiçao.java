package maiorposição;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosiçao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce deseja digitar?");
		int n = sc.nextInt();

		// vetor Armazenamento
		int[] vetor = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite o número: ");
			vetor[i] = sc.nextInt();
		}

		//Posição 0 sendo a MAIOR..ele vai percorrer se (posmaior) > (posiçaõ 0) ele SUBSTITUI; 
		double maior = vetor[0];
		int posmaior = 0;

		for (int i = 1; i < n; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
				posmaior = i;
			}
		}

		System.out.printf("MAIOR VALOR = %.1f\n", maior);
		System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);// do vetor i ... i<n

		sc.close();

	}

}
