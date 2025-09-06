
package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Aprendendo {
	public static void main(String[] args) {
		
		//lista nao aceita tipo primitivo tipo -- Int-- tem que ser --interge--
		
		List<String> list = new ArrayList<>();//intanciando a lista => com uma classe que recebe a interface List
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");//Na posição 2 eu quero add Marco
		
		System.out.println(list.size());
		
		for (String x : list) { //utilizou laço for each para percorrer a lista com objetos X
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		
		list.removeIf(x -> x.charAt(0) == 'M');//Remove cada nome que tem como caracter inicial letra (M)
		for (String x : list) { //Repete laço para ele pércorrer e me apresentar
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		
		System.out.println("Qual posição de Bob: " + list.indexOf("Bob"));//encontrar a posição de um elemento ==== indexOf
		System.out.println("Index of Marco: " + list.indexOf("Marco"));// Nao encontrou retorna -1
		
		System.out.println("---------------------");
		
		//              converto p/stream  faço minha ope. Lambda       coleta e gera a nova lista filtrada
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) { //procura  apelido no Result
			System.out.println(x);
		}
		System.out.println("---------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}
}
