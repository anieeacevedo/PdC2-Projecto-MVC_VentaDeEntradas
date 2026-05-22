package Modelo;

import java.util.List;
import java.util.ArrayList;

public class Zona {
    private String nombre;
    private int capacidad;
    private int precio;
    private List<Entrada> entradas; // Composición

    public Zona() {
        this.entradas = new ArrayList<>();
    }

    private boolean generarEntradas() {
        return false;
    }

    public Entrada[] mostrarEntrada() {
        return new Entrada[0];
    }

    public Entrada[] venderEntrada(int numero) {
        return new Entrada[0];
    }
}