package Modelo;
import java.util.ArrayList;
import java.util.Date; // IMPORTANTE
import java.util.List;

public class Venta {
    private Date fecha;
    private int monto;
    private Cliente cliente; 
    private List<Entrada> entradasVendidas; 

    public Venta(Cliente cliente) {
        this.cliente = cliente;
        this.entradasVendidas = new ArrayList<>();
        this.fecha = new Date();
    }

    public boolean anular() {
        return true;
    }
}