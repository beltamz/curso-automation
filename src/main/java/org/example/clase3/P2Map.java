package org.example.clase3;

import java.util.HashMap;
import java.util.Map;

public class P2Map {
    public static void main(String[] args) {
        //Map usa clases, no datos primitivos, por eso uso Integer en vez de int
        Map<String, Integer> mapaDeNombresYEdades= new HashMap<>();
        //Agrego valores
        mapaDeNombresYEdades.put("Pedro", 18);
        mapaDeNombresYEdades.put("Juan", 33);

        System.out.println("Valores del mapa: " + mapaDeNombresYEdades);

        //Accedo a una posicion especifica desde la clave (en este caso el nombre)
        System.out.println("Edad de la clave Pedro: " + mapaDeNombresYEdades.get("Pedro"));
    }
}
