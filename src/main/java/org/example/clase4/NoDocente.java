package org.example.clase4;

public class NoDocente extends Persona {

    public NoDocente(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public void saludar(){
        System.out.println("Hola soy un no docente");
    }
}
