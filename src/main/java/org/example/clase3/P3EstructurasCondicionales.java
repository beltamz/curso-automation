package org.example.clase3;

public class P3EstructurasCondicionales {
    public static void main(String[] args) {
        int variable1= 100;
        int variable2= 200;

        if (variable1<variable2) {
            System.out.println("Se cumple la condicion, variable 1 es menor a variable 2");
        }

        if (variable1>variable2) {
            System.out.println("Variable 1 es mayor a variable 2");
        }else{
            System.out.println("Var 1 no es mayor a var2");
        }

        String diaDeLaSemana= "Martes";

        switch (diaDeLaSemana) {
            case "Lunes":
                System.out.println("Es lunes");
                break;
            case "Martes":
                System.out.println("Es martes");
                break;
            case "Miercoles":
                System.out.println("Es miercoles");
                break;
            default:
                System.out.println("No es lunes, martes ni miercoles");
        }
    }
}
