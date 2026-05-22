package Modelo;

import java.util.List;
import java.util.ArrayList;

public class Usuario extends Persona {
    private boolean estado;
    private List<Concierto> conciertos; // Agregación

    public Usuario() {
        this.conciertos = new ArrayList<>();
    }

    public void registrarZonas() {
        // Implementación
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