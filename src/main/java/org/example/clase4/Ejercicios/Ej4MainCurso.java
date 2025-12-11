package org.example.clase4.Ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej4MainCurso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Curso> cursos = new ArrayList<>();

        for (int i = 0; i <= 3; i++) {
            System.out.println("Ingresar nombre de curso");
            String nombreCurso = scanner.nextLine();

            System.out.println("Ingresar duracion (minutos): ");
            var duracion = scanner.nextInt();
            scanner.nextLine();//para vaciar el buffer

            Curso curso = new Curso(nombreCurso, duracion);
            cursos.add(curso);
        }

        System.out.println("Informacion de los cursos:" + cursos);
    }
}
