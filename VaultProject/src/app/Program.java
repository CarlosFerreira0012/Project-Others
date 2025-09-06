package app;

public class Program {
    public static void main(String[] args) {
        Vault cofrinho = new Vault();

        Coin dolar1 = new Dolar(10);
        Coin euro1 = new Euro(5);
        Coin real1 = new Real(20);

        cofrinho.adicionar(dolar1);
        cofrinho.adicionar(euro1);
        cofrinho.adicionar(real1);

        cofrinho.listagemMoedas();

        System.out.println("\nTotal convertido para Real: R$" + cofrinho.totalConvertido());

        cofrinho.remover(dolar1);
        cofrinho.listagemMoedas();
    }
}