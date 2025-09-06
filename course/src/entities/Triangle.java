package entities; 

public class Triangle { //Class é a definição do Triangle

	//Atributos
	
	public double a;
	public double b;
	public double c;

	public double area() {
		
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
	}
 }

//nesse pacote foi so para armazenar uma memoria do Scanner