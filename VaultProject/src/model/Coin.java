package model;

import java.math.BigDecimal;

abstract class coin {
	protected BigDecimal valor;
	
	public coin (Double valor) {
		
		this.valor = BigDecimal.valueOf(valor);
	}
	
	 public abstract void info();
	    public abstract double converter();//Para conversão 
}
