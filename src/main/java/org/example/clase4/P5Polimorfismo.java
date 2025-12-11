package org.example.clase4;

public class P5Polimorfismo {
    public static void main(String[] args) {
       Alumno alumno = new Alumno("Lolo", "Perez", 8.43, 2453 );
        Profesor profesor = new Profesor("Maria", "Gomez", "3A");
        NoDocente nodocente = new NoDocente("Luis", "Suarez");

        printer(alumno);
        printer(profesor);
        printer(nodocente);
    }

    public static void printer (Persona persona){
        persona.saludar();
    }
}
