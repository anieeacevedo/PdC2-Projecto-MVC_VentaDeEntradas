package Modelo;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Concierto {
    private String nombre;
    private Date fecha;
    private List<Zona> zonas; // Composición

    public Concierto() {
        this.zonas = new ArrayList<>();
    }

    public boolean agregarZona(String nombre) {
        return false;
    }

    public boolean eliminarZona(String nombre) {
        return false;
    }
}