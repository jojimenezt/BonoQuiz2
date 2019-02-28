package CadenaProduccion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Producto {
    protected String nombreProducto;
    protected String destino;
    protected Fecha fechaLlegada;
    protected Fecha fechaSalida;

    public Producto(String nombreProducto, String destino, Fecha fechaLlegada, Fecha fechaSalida) {
        this.nombreProducto = nombreProducto;
        this.destino = destino;
        this.fechaLlegada = fechaLlegada;
        this.fechaSalida = fechaSalida;
    }
    
}
