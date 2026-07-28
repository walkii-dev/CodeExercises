package com.exercising.CodeExercises;

public enum Moeda {
    EURO(5.83),
    REAL(1.00),
    DOLAR(5.13);

    private double taxaConversao;

    Moeda(double taxaConversao) {
        this.taxaConversao = taxaConversao;
    }

    public double converterPara( double valorReais){
        return valorReais * taxaConversao;
    }
}
