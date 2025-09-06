package entities;

public class Account {

	public static void main(String[] args) {
	
		// São privado => Criar get e set deles(metodos de acesso)
		
		private int number; // só Get =>Number da conta nao pode alterar
		private String holder;// Get e Set => pode ser alterados 
		private double balance;//Só Get => balance não pode ser alterado(Somente por Saque e deposito)
		
		
		//Contrutor 1
		public Account (int number , String holder) {
			
			this.number = number;
			this.holder = holder;
		}
//construtor 2
       public Account (int number , String holder , double initialDeposit)//Começa com um deposito inicial(account zerada) e não um Saldo inicial
       {
			
			this.number = number;
			this.holder = holder;
			deposit(initialDeposit);//Chama a função deposit(Caso tenha uma mudança exemplo:acrescimo de taxa. O construtor não altera.)
			}
       
       
	public int getNumber() {
		return number;
	}
	
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	  
	//Function deposit
	public void deposit (double amount) {
		balance += amount;
	}
	
	public void withdraw (double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account" + number + ", Holder: " + holder + ", balance: $ " + String.format("%.2f",balance);
	}
	}
    	
	}