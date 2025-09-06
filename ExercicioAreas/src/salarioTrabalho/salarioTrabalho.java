package salarioTrabalho;

import java.util.Scanner;

import java.util.Locale;

public class salarioTrabalho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
	Scanner scanner = new Scanner (System.in);
	
	//Numero do funcionario 
	System.out.print("Informe o seu ID: ");
	int A = scanner.nextInt();
	
	//Qual suas horas trabalhadas 
	System.out.print("Quais sao suas Horas trabalhadas: ");
	int B = scanner.nextInt();
	
	
	//o valor que recebe por horas trabalhadas(numero com virgula) converter
	System.out.print("Quanto você ganha por cada hora trabalhada: ");
	double C = scanner.nextDouble();
	
	
	//seu salario é 
	double D = B * C; 
	
	
	//seu numero funcionario é -> e o seu salario é por mes (com 2 casa decimais)
	
	System.out.println("Seu ID é: " + A);
	
	System.out.printf("Seu salario é: U$ %.2f%n", D); 
	
	
	
	scanner.close();

	}

}
