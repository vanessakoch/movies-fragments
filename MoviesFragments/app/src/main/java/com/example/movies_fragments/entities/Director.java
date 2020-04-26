package com.example.movies_fragments.entities;

public class Director {
    private int fotoDiretor;
    private String nomeDiretor;
    private String dataNascimentoDiretor;

    public Director(){}

    public Director(int fotoDiretor, String nomeDiretor, String dataNascimentoDiretor) {
        this.fotoDiretor = fotoDiretor;
        this.nomeDiretor = nomeDiretor;
        this.dataNascimentoDiretor = dataNascimentoDiretor;
    }

    public int getFotoDiretor() {
        return fotoDiretor;
    }

    public void setFotoDiretor(int fotoDiretor) {
        this.fotoDiretor = fotoDiretor;
    }

    public String getNomeDiretor() {
        return nomeDiretor;
    }

    public void setNomeDiretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }

    public String getDataNascimentoDiretor() {
        return dataNascimentoDiretor;
    }

    public void setDataNascimentoDiretor(String dataNascimentoDiretor) {
        this.dataNascimentoDiretor = dataNascimentoDiretor;
    }

    @Override
    public String toString() {
        return "Director{" +
                "fotoDiretor=" + fotoDiretor +
                ", nomeDiretor='" + nomeDiretor + '\'' +
                ", dataNascimentoDiretor='" + dataNascimentoDiretor + '\'' +
                '}';
    }
}
