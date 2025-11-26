package org.example.clase3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P1ArraysYListas {
    public static void main(String[] args) {
        //Arrays
        int[] arrayConNumeros= new int[3];
        arrayConNumeros[0]=10;
        arrayConNumeros[1]=20;
        arrayConNumeros[2]=30;

        System.out.println("Valores del array " + Arrays.toString(arrayConNumeros));

        //Listas
        List<String> listadeNombres= new ArrayList<>();
        //Agrego elementos
        listadeNombres.add("Juan");
        listadeNombres.add("Pedro");
        listadeNombres.add("Julia");

        System.out.println("Elementos de la lista: "+ listadeNombres);
        System.out.println("Elemento en la posicion 1: "+ listadeNombres.get(1));

        //Elimino elementos
        listadeNombres.remove("Pedro");
        listadeNombres.remove(0 );

        System.out.println("Elementos de la lista: "+ listadeNombres);


    }
}
