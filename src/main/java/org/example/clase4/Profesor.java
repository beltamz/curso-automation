package org.example.clase4;

public class Profesor extends Persona {
    private String curso;

    public Profesor(String nombre, String apellido, String curso) {
        super(nombre, apellido);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    @Override
    public void saludar(){
        System.out.println("Hola soy un profesor");
    }
}
