package entities;

public class OrderItem {//Classe que tem uma composição com o Produto

	private Integer quantity;
	private Double price;
	
	private Product product; //Instanciando um Pedido --> comntém N produtos

	
	public OrderItem() {};
	
	//1-Construtor com argumento
	public OrderItem(Integer quantity, Double price, Product product) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	//2- Construtor Sem argumento
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double subTotal() {
		return price * quantity;
	}
	
	@Override
	public String toString() {
		return getProduct().getName()
				+ ", $"
				+ String.format("%.2f", price)
				+ ", Quantity: "
				+ quantity
				+", Subtotal: $"
				+ String.format("%.2f", subTotal());

	}
	
}
