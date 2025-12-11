package org.example.clase4;

public class Alumno extends Persona {
    private int legajo;
    private double promedio;

    public Alumno(String nombre, String apellido, double promedio, int legajo) {
        super(nombre, apellido);
        this.promedio = promedio;
        this.legajo = legajo;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    @Override
    public void saludar(){
        System.out.println("Hola soy un alumno");
    }
}
