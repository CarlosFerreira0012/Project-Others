package model;

class Real extends coin {
    public Real(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Real: R$" + valor);
    }

    @Override
    public double converter() {
        return valor.doubleValue(); // O Real já está na moeda base
    }
}