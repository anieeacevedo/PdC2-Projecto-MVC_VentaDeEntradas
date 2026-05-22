package Modelo;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Venta {
    private Date fecha;
    private int monto;
    private List<Entrada> entradas; // Multiplicidad 1,4 (Se controla en la lógica empresarial)

    public Venta() {
        this.entradas = new ArrayList<>();
    }

    public boolean anular() {
        return false;
    }
}