
import java.util.Scanner;

public class Whilexercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x;
		int y;

		System.out.println("Digite o valor de X: ");
		x = sc.nextInt();

		System.out.println("Digite o valor de Y: ");
		y = sc.nextInt();

		while (x != 0 || y != 0) {
			if (x > 0 && y > 0) {
				System.out.print("Primeiro");
				break;
				
			} else if (x > 0 && y < 0) {
				System.out.print("Quarto");
				break;

			} else if (x < 0 && y > 0) {
				System.out.print("Segundo");
				break;

			} else if (x < 0 && y < 0) {
				System.out.print("Terceiro");
				break;
			}

		}

		sc.close();

	}

}
