package model;

public class Subtracao extends Operacao {

    public Subtracao() {
        super("Subtração");
    }

    @Override
    public double calcular(double a, double b) {
        return a - b;
    }
}