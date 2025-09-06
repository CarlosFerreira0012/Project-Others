/*
  Fazer um programa para ler um número inteiro N e a altura de N
pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
altura média dessas pessoas.
 
  
*/
package vetoresArrays;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioOne {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //Numero inteiro N
		double[] vect = new double[n]; //Defini o vetor e o tipo que é double..logo em seguida o tamanho que é N
		
		// For = Vai armazenar cada valor em sua devida posição no ARRAY.
		for (int i=0; i<n; i++) {
		vect[i] = sc.nextDouble(); //Para cada posição [i] do vect ele adiciona um valor. Começando em 0.
		}
		
		double sum = 0.0;//Criada variavel Soma
		
		for (int i=0; i<n; i++) { //vai percorrer todas posições do vetor
		sum += vect[i]; //Somar todos os valores armazenados em cada posição
		}
		
		
		double avg = sum / n; //Criada Variavel avarage age (media dos valores )
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		sc.close();
		}

}
