
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner (System.in); 

System.out.print("Digite aqui o codigo escolhido: ");
 int codigo = sc.nextInt();

 System.out.print("Digite aqui o quantidade escolhido: ");
 int quantidade = sc.nextInt();
 
 double total;
 
 if (codigo == 1 ) {
	 total = quantidade * 4.0;
 }
 
 else if (codigo == 2 ) { 
	 total = quantidade * 4.5;
 }
 
 else if (codigo == 3 ) { 
	 total = quantidade * 5.0;
 }
 
 else if (codigo == 4 ) { 
	   total = quantidade * 2.0;
 }
 
 else  {
	    total = quantidade * 1.5;
 
 }

System.out.printf("total: R$%.2f%n", total);

sc.close();
	}

}
