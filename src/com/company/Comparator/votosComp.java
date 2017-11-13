package com.company.Comparator;

import com.company.Model.Pelicula;

import java.util.Comparator;

public class votosComp  implements Comparator<Pelicula>{

    @Override
    public int compare(Pelicula o1, Pelicula o2) {
        return o1.Votos-o2.Votos;
    }
}
