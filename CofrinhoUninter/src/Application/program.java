package Application;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	// Classe abstrata Moeda
	abstract class Moeda {
	    protected double valor;

	    public Moeda(double valor) {
	        this.valor = valor;
	    }

	    public abstract void info();
	    public abstract double converter();
	}

	// Classes concretas para cada tipo de moeda
	class Dolar extends Moeda {
	    public Dolar(double valor) {
	        super(valor);
	    }

	    @Override
	    public void info() {
	        System.out.println("Dólar: " + valor);
	    }

	    @Override
	    public double converter() {
	        return valor * 5.0; // Supondo taxa de câmbio fictícia
	    }
	}

	class Euro extends Moeda {
	    public Euro(double valor) {
	        super(valor);
	    }

	    @Override
	    public void info() {
	        System.out.println("Euro: " + valor);
	    }

	    @Override
	    public double converter() {
	        return valor * 6.0; // Supondo taxa de câmbio fictícia
	    }
	}

	class Real extends Moeda {
	    public Real(double valor) {
	        super(valor);
	    }

	    @Override
	    public void info() {
	        System.out.println("Real: " + valor);
	    }

	    @Override
	    public double converter() {
	        return valor; // Real já está na moeda base
	    }
	}

	// Classe Cofrinho
	class Cofrinho {
	    private List<Moeda> listaMoedas;

	    public Cofrinho() {
	        this.listaMoedas = new ArrayList<>();
	    }

	    public void adicionar(Moeda moeda) {
	        listaMoedas.add(moeda);
	    }

	    public void remover(Moeda moeda) {
	        listaMoedas.remove(moeda);
	    }

	    public void listarMoedas() {
	        for (Moeda moeda : listaMoedas) {
	            moeda.info();
	        }
	    }

	    public double totalConvertido() {
	        double total = 0;
	        for (Moeda moeda : listaMoedas) {
	            total += moeda.converter();
	        }
	        return total;
	    }
	}

	// Classe Principal
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Cofrinho cofrinho = new Cofrinho();
	        
	        while (true) {
	            System.out.println("\n1 - Adicionar Moeda");
	            System.out.println("2 - Remover Moeda");
	            System.out.println("3 - Listar Moedas");
	            System.out.println("4 - Calcular Total Convertido");
	            System.out.println("5 - Sair");
	            System.out.print("Escolha uma opção: ");
	            int opcao = scanner.nextInt();
	            
	            if (opcao == 5) break;
	            
	            switch (opcao) {
	                case 1:
	                    System.out.print("Digite o tipo da moeda (1 - Dólar, 2 - Euro, 3 - Real): ");
	                    int tipo = scanner.nextInt();
	                    System.out.print("Digite o valor: ");
	                    double valor = scanner.nextDouble();
	                    
	                    Moeda novaMoeda = switch (tipo) {
	                        case 1 -> new Dolar(valor);
	                        case 2 -> new Euro(valor);
	                        case 3 -> new Real(valor);
	                        default -> null;
	                    };
	                    
	                    if (novaMoeda != null) cofrinho.adicionar(novaMoeda);
	                    else System.out.println("Tipo inválido!");
	                    break;
	                
	                case 2:
	                    System.out.println("Remover ainda não implementado corretamente.");
	                    break;
	                
	                case 3:
	                    cofrinho.listarMoedas();
	                    break;
	                
	                case 4:
	                    System.out.println("Total convertido para Real: " + cofrinho.totalConvertido());
	                    break;
	                
	                default:
	                    System.out.println("Opção inválida!");
	            }
	        }
	        scanner.close();
	    }
	}


}
