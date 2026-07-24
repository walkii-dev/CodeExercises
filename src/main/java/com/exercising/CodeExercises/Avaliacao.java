package com.exercising.CodeExercises;

import java.util.List;

public class Avaliacao<T> {
    private T item;
    private double nota;
    private String comentario;

    public Avaliacao(T item, double nota, String comentario) {
        this.item = item;
        this.nota = nota;
        this.comentario = comentario;
    }

    public Avaliacao() {
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public double calcularMedia(List<Avaliacao<T>> lista){
        double somaTotal= 0.0;

        for( Avaliacao<T> item : lista){
            somaTotal+=item.getNota();
        }
        return somaTotal / lista.size();
    }
}
