package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

//Criar a classe Worker: ela tem ( Um Departamento) e (Varios* contratos)
public class Worker {
	
	//Atributos Basicos da classe
	private String name;
	private WorkerLevel Level;
	private Double baseSalary;
	
	//Associaçoes
	private Department department; //Primeira assosciação ( - departament )- Esta na UML
	
	//Um trabalhador tem Vários Contratos... Terá que ser representado com uma <Lista>
	//lista do tipo HourContract com nome Contract
	private List<HourContract> contracts = new ArrayList<>(); //Tenho uma composição "tem vários" ->Eu não incluo "Contracts" no Construtor, eu simplesmente  inicio a lista dele vazia.

	
	//Construtor Vazio
	public Worker () {
		
	}

	//Construtor com argumento: Aqui eu não posso marcar Contract, pq ele é uma LISTA (QUALQUER COISA QUE SEJA LISTA NÃO MARCA)
	//Devo instanciar a minha Lista quando declaro as ASSOCIAÇÕES.
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		
		this.name = name;
		Level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	
	//Construtores Get e Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return Level;
	}

	public void setLevel(WorkerLevel level) {
		Level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}
     /* Não pode esse comando ====>>>> Porque ele cria outra lista e em seguida ele adicion a nossa lista criada la em cima no pivate.
	public void setContracts(List<HourContract> contracts) {
		this.contracts = contracts;
	}
	*/
	
	//Criar os Metodos/Funções 
	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract (HourContract contract) {
		contracts.remove(contract);
		
	}
	
	public double income(int year, int month) {
		
			double sum = baseSalary;
			
			Calendar cal = Calendar.getInstance();
			for (HourContract c : contracts) {
				cal.setTime(c.getDate());
				int c_year = cal.get(Calendar.YEAR);
				int c_month = 1 + cal.get(Calendar.MONTH);
				if (year == c_year && month == c_month) {
					sum += c.totalValue();
				}
			}
			return sum;
		}
		
	}
