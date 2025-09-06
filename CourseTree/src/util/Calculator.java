package util;

//Pode retirar o Static de todas as funçoes. E importa no programa principal ....Versão 2

//Atenção: Quando os membros das classes nao sao Static e obrigado a Estanciar ele no programa principal.

public class Calculator {

	public final double PI = 3.14159;

	public double circumference(double radius) { // Era Static no programa Principal
		return 2.0 * PI * radius;
	}

	public double volume(double radius) { // Era Static no programa Principal
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}


