package com.company.Comparator;

import com.company.Model.Pelicula;

import java.util.Comparator;

public class generoComp implements Comparator<Pelicula>{

    @Override
    public int compare(Pelicula o1, Pelicula o2) {
        if (o1.Genero.equals(o2.Genero)){
        return (o2.Votos-o1.Votos);
            }else{
        return (o1.Genero.compareTo(o2.Genero));
        }
    }
}
