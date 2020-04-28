package com.example.movies_fragments.entities;

public class Movie {
    private int fotoFilme;
    private String titulo;
    private int anoLançamento;
    private String genero;
    private Director diretor;
    private Actor protagonista;

    public Movie(int fotoFilme, String titulo, int anoLançamento, String genero, Director diretor, Actor protagonista) {
        this.fotoFilme = fotoFilme;
        this.titulo = titulo;
        this.anoLançamento = anoLançamento;
        this.genero = genero;
        this.diretor = diretor;
        this.protagonista = protagonista;
    }

    public int getFotoFilme() {
        return fotoFilme;
    }

    public void setFotoFilme(int fotoFilme) {
        this.fotoFilme = fotoFilme;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLançamento() {
        return anoLançamento;
    }

    public void setAnoLançamento(int anoLançamento) {
        this.anoLançamento = anoLançamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Director getDiretor() {
        return diretor;
    }

    public void setDiretor(Director diretor) {
        this.diretor = diretor;
    }

    public Actor getProtagonista() {
        return protagonista;
    }

    public void setProtagonista(Actor protagonista) {
        this.protagonista = protagonista;
    }

    @Override
    public String toString() {
        return titulo;
    }
}
