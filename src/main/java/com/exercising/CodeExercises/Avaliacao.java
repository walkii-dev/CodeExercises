package com.exercising.CodeExercises;

public class Avaliacao< T > {
    private T nota;

    public T getNota() {
        return nota;
    }

    public void setNota(T nota) {
        this.nota = nota;
    }

    public Avaliacao(T nota) {
        this.nota = nota;
    }
}
