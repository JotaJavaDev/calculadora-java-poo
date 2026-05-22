package model;

import interfaces.Calculavel;

public abstract class Operacao implements Calculavel {

    private String nome;

    public Operacao(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double calcular(double a, double b);

    public void mostrarOperacao() {
        System.out.println("Operação: " + nome);
    }
}