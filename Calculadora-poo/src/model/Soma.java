package model;

public class Soma extends Operacao {

    public Soma() {
        super("Soma");
    }

    @Override
    public double calcular(double a, double b) {
        return a + b;
    }
}