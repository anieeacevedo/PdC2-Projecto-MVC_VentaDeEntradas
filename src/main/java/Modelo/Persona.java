package Modelo;

public class Persona {
    protected String nombres;
    protected String apellidos;
    protected String dni;
    protected String contrasena;

    public abstract boolean registrarTarjeta();
    public abstract boolean eliminarTarjeta();
    public abstract boolean anularVenta();
}
