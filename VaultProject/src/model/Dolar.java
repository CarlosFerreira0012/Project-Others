package model;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Dolar extends coin {
    private static BigDecimal taxaConversao = BigDecimal.valueOf(5.0); // Conversão para Real

    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Dólar: $" + valor);
    }

    @Override
    public double converter() {
        return valor.multiply(taxaConversao).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}