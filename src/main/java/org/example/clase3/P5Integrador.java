package org.example.clase3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P5Integrador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero=0;
        List<Integer> listaNumero=new ArrayList<>();

        do{
            System.out.println("Ingrese un numero:");
            numero= scanner.nextInt();
            listaNumero.add(numero);
        }while(numero<=500);

        System.out.println("Datos ingresados: " +listaNumero);

        int cantidad= listaNumero.size();
        System.out.println("Cantidad ingresada: " + cantidad);

        if(cantidad<10){
            System.out.println("Se ingresaron pocos numeros.");
        }else{
            System.out.println("Se excedio la cantidad de ingresos diarios");
        }

        scanner.close();
    }
}
