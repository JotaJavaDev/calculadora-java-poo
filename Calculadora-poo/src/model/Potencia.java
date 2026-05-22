package model;

public class Potencia extends Operacao {

    public Potencia() {
        super("Potência");
    }

    @Override
    public double calcular(double a, double b) {
        return Math.pow(a, b);
    }
}