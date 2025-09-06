import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
  Scanner sc = new Scanner (System.in);
  
  int X = sc.nextInt();
  
  if (X % 2 == 0 ) {
	  System.out.println("Par");
  }
  
  else {
	 
	  System.out.println("Impar");
  }
  
  sc.close();
	}

}
