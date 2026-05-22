import model.*;
import services.Calculadora;

public class App {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        Operacao soma = new Soma();
        Operacao subtracao = new Subtracao();
        Operacao multiplicacao = new Multiplicacao();
        Operacao divisao = new Divisao();
        Operacao potencia = new Potencia();

        System.out.println("Resultado Soma: " +
                calculadora.executar(soma, 10, 5));

        System.out.println("Resultado Subtração: " +
                calculadora.executar(subtracao, 20, 7));

        System.out.println("Resultado Multiplicação: " +
                calculadora.executar(multiplicacao, 4, 6));

        System.out.println("Resultado Divisão: " +
                calculadora.executar(divisao, 30, 2));

        System.out.println("Resultado Potência: " +
                calculadora.executar(potencia, 2, 8));

        calculadora.mostrarHistorico();
    }
}