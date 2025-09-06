package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);
SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");//Format que eu quero receber a data 

//O que o programa esta pedindo para digitar...
System.out.print("Enter department's name: ");
String departmentName = sc.nextLine();

System.out.print("Enter worker data: ");
System.out.println("Name: ");
String workerName = sc.nextLine(); // variavel com worker(classe)+Name(o que ela pede).
System.out.print("Level : ");
String workerLevel = sc.nextLine();
System.out.print("Base Salary : ");
double baseSalary = sc.nextDouble();

//Depois de pedir tudo o que eu quero. Posso Instanciar o trabalhador(Worker)[tenho todas as informações]
//Declarei a variavel Worker

Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department (departmentName));


//Desenvolver o Loop For para armazenar o Numero de contratos do trabalhador.
System.out.print(" How many contracts to this worker? ");
int n = sc.nextInt();

for ( int i=1; i<=n; i++) {
	System.out.println("Enter contract #" + i + " data:");
	System.out.print("Date (DD/MM/YYYY): ");
	Date contractDate = sdf.parse(sc.next());
	System.out.print("Value per hour: ");
	double valuePerHour = sc.nextDouble();
	System.out.print("Duration(hours): ");
	int hours = sc.nextInt();
	//Tenho todas informações do contrato. Posso instanciar contrato. 
	HourContract contract = new HourContract(contractDate, valuePerHour, hours);
	
	//Agora para associar o meu contrato(Contract) com o trabalhador(Worker) vou chamar o metodo.
	worker.addContract(contract);	
}


System.out.println();
System.out.print("Enter month and year to calculate income (MM/YYYY): ");//Ler o String MM/YYYY e recortar MANUAL...
String monthAndYear = sc.next();

//1- Pegar os 2 primeiro caracter da string MM/YYYY -->Recortar = [monthAndYear.substring(0, 2)] ... transformar em Inteiro = Integer.parseInt(      ) 
int month = Integer.parseInt(monthAndYear.substring(0, 2));
//2- Pegar os 3 caracteres para frente da String MM/YYYY --> Recortar do 3 em diante = [ monthAndYear.substring(3) ] ... transformar em Inteiro = Integer.parseInt(   )
int year = Integer.parseInt(monthAndYear.substring(3));


//Tenho tudo para poder acessar e mostrar.
System.out.println("Name: " + worker.getName()); //Acessar o OBJETO(worker) e pegar[.getName()] o NAME  .......COMPOSIÇÃO 

System.out.println("Department: " + worker.getDepartment().getName());//Acessar OBJETO(worker)--> OBJETO(Department) --> NAME do department 
//                              Periodo informa MM/YYYY         chama o MM/YYYY digitados
System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));


sc.close();

	}

}
