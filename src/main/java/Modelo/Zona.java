import java.util.ArrayList; // IMPORTANTE
import java.util.List;      // IMPORTANTE

public class Zona {
    private String nombre;
    private int capacidad;
    private int precio;
    private List<Entrada> entradas; 

    public Zona(String nombre) {
        this.nombre = nombre;
        this.entradas = new ArrayList<>();
    }

    public boolean generarEntradas() {
        return true;
    }

    public Entrada[] mostrarEntradas() {
        return entradas.toArray(new Entrada[0]);
    }
}