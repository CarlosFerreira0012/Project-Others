package matriz;

import java.util.Locale;
import java.util.Scanner;

public class Aprendendo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		
		int [][] mat = new int [n][n];//instanciou a matriz bidimensional. Tridimensional seria [][][]
		for(int i=0 ; i<n ; i++) {//1 for (i)=percorre as LINHA
			
			for(int j=0; j<n ; j++) {//2 for(j)=percorre as colunas
				mat [i][j] = sc.nextInt();
			}
			
		}
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
