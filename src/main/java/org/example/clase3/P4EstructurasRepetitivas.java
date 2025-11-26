package org.example.clase3;

public class P4EstructurasRepetitivas {
    public static void main(String[] args) {
        //while

        int contador= 0;

        while(contador<5){
            System.out.println("Hola primer mundo " + contador);
            contador ++;
        }

        //Do while

        int contador2= 0;

        do {
            System.out.println("Hola segundo mundo " + contador2);
            contador2 ++;
        }while(contador2<5);

        //For
        for (int i=0; i<5; i++){
            System.out.println("Hola mundo desde for ");
        }
    }
}
