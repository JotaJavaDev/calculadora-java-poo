package services;

import model.Historico;
import model.Operacao;

public class Calculadora {

    private Historico historico;

    public Calculadora() {
        this.historico = new Historico();
    }

    public double executar(Operacao operacao, double a, double b) {

        double resultado = operacao.calcular(a, b);

        String registro = operacao.getNome() +
                " -> " + a + " e " + b +
                " = " + resultado;

        historico.adicionar(registro);

        return resultado;
    }

    // Sobrecarga de método
    public double executar(Operacao operacao, int a, int b) {
        return executar(operacao, (double) a, (double) b);
    }

    public void mostrarHistorico() {
        historico.mostrarHistorico();
    }
}