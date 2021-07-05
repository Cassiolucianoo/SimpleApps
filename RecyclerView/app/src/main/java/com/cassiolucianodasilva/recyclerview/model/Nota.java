package com.cassiolucianodasilva.recyclerview.model;

public class Nota {

    private final  String titulo;
    private final String descrição;

    public Nota(String titulo, String descrição){
        this.titulo = titulo;
        this.descrição = descrição;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescrição() {
        return descrição;
    }
}
