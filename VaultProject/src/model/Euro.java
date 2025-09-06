package model;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Euro extends coin {
    private static BigDecimal taxaConversao = BigDecimal.valueOf(6.0); // Conversão para Real

    public Euro(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Euro: €" + valor);
    }

    @Override
    public double converter() {
        return valor.multiply(taxaConversao).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}