package com.exercising.CodeExercises;

public enum Mes {
    JANEIRO(31),
    FEVEREIRO(28),
    MARCO(31),
    ABRIL(30),
    MAIO(31),
    JUNHO(31),
    JULHO(30),
    AGOSTO(31),
    SETEMBRO(30),
    OUTUBRO(31),
    NOVEMBRO(30),
    DEZEMBRO(31);

    private int numeroDias;

    Mes(int numeroDias) {
        this.numeroDias = numeroDias;
    }

    public int getNumeroDias() {
        return numeroDias;
    }
}
