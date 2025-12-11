package org.example.clase4;

public class P2MainEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante= new  Estudiante();
        System.out.println("Nombre del estudiante (vacio): " + estudiante.getNombreCompleto() + ", id: " + estudiante.getId() + ", Promedio: " + estudiante.getPromedio());

        Estudiante estudiante2= new Estudiante(3,"Pedro Lozano",8.0f);
        System.out.println("Nombre del estudiante (completo): " + estudiante2.getNombreCompleto() + ", id: " + estudiante2.getId() + ", Promedio: " + estudiante2.getPromedio());

        estudiante2.setPromedio(10.0f);
        System.out.println("Nuevo promedio de estudiante 2: "+ estudiante2.getPromedio());
    }
}
