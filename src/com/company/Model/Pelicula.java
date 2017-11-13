package com.company.Model;

public class Pelicula{
    public String Titulo;
    public String Genero;
    public int Votos;

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public int getVotos() {
        return Votos;
    }

    public void setVotos(int votos) {
        Votos = votos;
    }

    public Pelicula(String titulo, String genero, int votos) {
        Titulo = titulo;
        Genero = genero;
        Votos = votos;
    }
}
