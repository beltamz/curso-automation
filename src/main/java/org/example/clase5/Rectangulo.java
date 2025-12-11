package org.example.clase5;

public class Rectangulo extends Figura implements Dibujable {
    private int base;
    private int altura;

    public Rectangulo(String color, int base, int altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public int calcularArea() {
        return base * altura;
    }

    @Override
    public void dibujar() {
        System.out.println("Se dibuja un rectangulo " + getColor());
    }
}
