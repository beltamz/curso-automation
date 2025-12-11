package org.example.clase5;

import java.util.ArrayList;
import java.util.List;

public class MainFiguras {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado("rojo", 20);
        Triangulo triangulo = new Triangulo("verde", 12, 22);
        Rectangulo rectangulo = new Rectangulo("celeste", 10, 32);

        List<Figura> figuras = new ArrayList<Figura>();
        figuras.add(cuadrado);
        figuras.add(triangulo);
        figuras.add(rectangulo);

        //For each
        for (Figura figura : figuras) {
            System.out.println("Area: " + figura.calcularArea());
        }

        List<Dibujable> dibujables = new ArrayList<Dibujable>();
        dibujables.add(cuadrado);
        dibujables.add(rectangulo);

        for(Dibujable dibujable : dibujables) {
            dibujable.dibujar();
        }
        // Otras formas de usar for each
        dibujables.forEach(Dibujable::dibujar);
        dibujables.forEach(dibujable -> dibujable.dibujar());
    }
}
