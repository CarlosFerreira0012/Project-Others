
public class FuncoesString {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG ";

		String s01 = original.toLowerCase(); // Minusculo

		String s02 = original.toUpperCase(); // Maiusculo

		String s03 = original.trim(); // Retira String Vazias(espaçoes)

		String s04 = original.substring(2); // Conta apartir do caracter [2 = c] p/ frente

		String s05 = original.substring(2, 9); // Conta apartir do caractere 2(C) ate o 9-1=8 (H)

		String s06 = original.replace('a', 'x'); // Substitui todo "a" --> "x"

		String s07 = original.replace("abc", "xy"); // Substitui todo "abc" --> "xy"

		int i = original.indexOf("bc"); // Qual é a primeira posição do Substring "bc" começa no 1

		int j = original.lastIndexOf("bc");// qual é a posição do substring "bc" DE TRAS PARA FRENTE 17

		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);

	}

}
