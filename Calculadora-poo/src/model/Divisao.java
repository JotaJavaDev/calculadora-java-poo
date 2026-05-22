package model;

public class Divisao extends Operacao {

    public Divisao() {
        super("Divisão");
    }

    @Override
    public double calcular(double a, double b) {

        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não permitida!");
        }

        return a / b;
    }
}