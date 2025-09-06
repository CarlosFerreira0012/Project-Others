import java.util.Scanner;

//Public = Que essa função fique disponivel em outras classes...
//static = Que essa função possa ser chamada independente de ser criar um objeto...
public class userFuncao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers:");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int higher = max(a, b, c);// Função 1 = quando o programa chamar ela, iraccasar com os valores da função2

		showResult(higher);

		sc.close();
	}

	public static int max(int x, int y, int z) {// Função2
		int aux;// variavel local => so existe no ESCOPO dessa funçaõ

		if (x > y && x > z) {
			aux = x; // valor sera armazenado em AUX
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux; // função vai retornar valor de AUX
	}

	// Void = é pq a funçaõ nao retorna nenhuma variavel para ser utilizada no
	// programa principal

	public static void showResult(int value) { // Funçaõ de retornar um Void(Vazio), ou seja ela só vai imprimir, sem
												// retornar nada.
		System.out.println("Higher = " + value);
	}
}
