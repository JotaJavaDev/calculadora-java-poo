package model;

import java.util.ArrayList;
import java.util.List;

public class Historico {

    private List<String> operacoes = new ArrayList<>();

    public void adicionar(String operacao) {
        operacoes.add(operacao);
    }

    public void mostrarHistorico() {

        System.out.println("\n===== HISTÓRICO =====");

        for (String op : operacoes) {
            System.out.println(op);
        }
    }
}