package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
         Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
         
         System.out.println(order);//Como o order não tem o To string...ele vai imprimir um codigo entities.Order@311d617d
         //Para solucionar ir na classe Order e gerar um To string automatico. Com source - generating 
	

	//Converter String --> Enum 
	
	OrderStatus os1 = OrderStatus.DELIVERED;
	OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
	
	System.out.println(os1);
	System.out.println(os2);
	
	
	}
}
