import java.util.Scanner;

public class WhileExercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int senha;

		System.out.print("Digite a sua senha por favor:");
		senha = sc.nextInt();

		while (senha != 2002){
			System.out.println(" Senha Inválida. Tente Novamente ");
			senha = sc.nextInt();
		}

		System.out.printf("Acesso Permitido");

		sc.close();

	}

}
