package entities;

public class Product {

	public String name;
	public Double price;
	public int quantity;// ***

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity; // This faz referencia ao quantity do atributo *** (Recebe o que ja tinha nele +
									// NOVO argumento de quantidade

	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity; // Pega o Quantity do atributo e Subtrai o novo argumento de quantity digitado
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
