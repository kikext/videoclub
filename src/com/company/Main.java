package com.company;

import com.company.Model.Pelicula;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        int eleccion;
        Scanner sc  = new Scanner(System.in);
        ArrayList<Pelicula> pelis = new ArrayList<>();
        FileReader FrPelis = new FileReader("videoteca.dat");

        System.out.println("1-- Cargar datos de inicio");
        System.out.println("2-- Lista de peliculas por votos");
        System.out.println("3-- Lista de peliculas por genero");
        System.out.println("4-- Salir");
        eleccion = sc.nextInt();
do{

        switch (eleccion){
            case 1:

                break;
            case 2:

                break;
            case 3:
                break;
        }
        }while ();


}
