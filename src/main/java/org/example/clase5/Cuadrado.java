package org.example.clase5;

public class Cuadrado extends Figura implements Dibujable {
    private int lado;

    public Cuadrado(String color, int lado) {
        super(color);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public int calcularArea() {
        return lado * lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Se dibuja un cuadrado " + getColor());
    }
}
