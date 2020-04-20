package com.example.movies_fragments.entities;

public class Actor {
    private int fotoAtor;
    private String nomeAtor;
    private String dataNascimentoAtor;

    public Actor(int fotoAtor, String nomeAtor, String dataNascimentoAtor) {
        this.fotoAtor = fotoAtor;
        this.nomeAtor = nomeAtor;
        this.dataNascimentoAtor = dataNascimentoAtor;
    }

    public int getFotoAtor() {
        return fotoAtor;
    }

    public void setFotoAtor(int fotoAtor) {
        this.fotoAtor = fotoAtor;
    }

    public String getNomeAtor() {
        return nomeAtor;
    }

    public void setNomeAtor(String nomeAtor) {
        this.nomeAtor = nomeAtor;
    }

    public String getDataNascimentoAtor() {
        return dataNascimentoAtor;
    }

    public void setDataNascimentoAtor(String dataNascimentoAtor) {
        this.dataNascimentoAtor = dataNascimentoAtor;
    }
}
