/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pdc2.ventadeentradas_proyectomvc.laboratorio;

/**
 *
 * @author USER
 */
public class PdC2VentaDeEntradas_ProyectoMVCLaboratorio {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

public abstract class Persona {
    protected String nombres;
    protected String apellidos;
    protected String dni;
    protected String contrasena;

    public abstract boolean registrarTarjeta();
    public abstract boolean eliminarTarjeta();
    public abstract boolean anularVenta();
}



