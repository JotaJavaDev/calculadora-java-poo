package model;

public class Multiplicacao extends Operacao {

    public Multiplicacao() {
        super("Multiplicação");
    }

    @Override
    public double calcular(double a, double b) {
        return a * b;
    }
}