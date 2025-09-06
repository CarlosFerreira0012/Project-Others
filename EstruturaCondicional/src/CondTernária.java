/* Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em uma condição.

Sintaxe:
( condição ) ? valor_se_verdadeiro : valor_se_falso;

*/


public class CondTernária {
	
	/* utilizando o If-Else
	 * 
	double preco = 34.5;
	double desconto;
	
	if (preco < 20.0) {
	desconto = preco * 0.1;
	}
	else {
	desconto = preco * 0.05;
	}
	
*/
	//Utilizando o Operador Ternario
	
	double preco = 34.5;
	double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
                      //( condição ) ? valor_se_verdadeiro : valor_se_falso;
}
