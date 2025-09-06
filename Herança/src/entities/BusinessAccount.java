package entities;

public class BusinessAccount extends Account {//extends = chama tudo da SuperClass Account se estanciar um objeto eu posso chamar tudo da SuperClass(account. )

	private double loanLimit;
	
	//Construtor padrão
	
	public  BusinessAccount () {
		super();//Posso chamar super(); pois caso Haja uma nova logica na Superclass a minha SubClass vai atualizar automaticamente. Eexecutar tbm. 
	}

	
	
	//Contrutor com argumentos( O eclipse permite vc selecionar na parte de cima qual a superclasse vc quer criar o construtor) 
	
	public BusinessAccount(Integer number, String holder, Double balance, double loanLimit) {
		super(number, holder, balance);//O que veio da Superclass
		this.loanLimit = loanLimit;
	}



	public double getLoanLimit() {
		return loanLimit;
	}



	public void setLoanLimit(double loanLimit) {
		this.loanLimit = loanLimit;
	}  
	
	public void loan(double amount) {
		if(amount <= loanLimit) {
			balance += amount - 10.0; //Apresenta erro = Estou tentando acessar um item Private da SuperClasse. Tenho que utilizar o PROTECTED para liberar o acesso por uma SubClasse.
		}
	}		
}
