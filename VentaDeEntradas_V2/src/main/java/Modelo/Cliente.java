package Modelo;

import java.util.List;
import java.util.ArrayList;

public class Cliente extends Persona {
    private int puntos;
    private Tarjeta tarjeta; // Composición (1 a 1)
    private List<Venta> ventas; // Asociación (1 a muchos)

    public Cliente() {
        this.tarjeta = new Tarjeta(); // La tarjeta nace con el cliente
        this.ventas = new ArrayList<>();
    }

    private void ingresar(String usuario, String clave) {
        // Implementación del método privado
    }

    // Implementación obligatoria de los métodos abstractos de Persona
    @Override
    public boolean registrarTarjeta() {
        return false;
    }

    @Override
    public boolean eliminarTarjeta() {
        return false;
    }

    @Override
    public boolean anularVenta() {
        return false;
    }

    @Override
    public boolean comprar() {
        return false;
    }
}