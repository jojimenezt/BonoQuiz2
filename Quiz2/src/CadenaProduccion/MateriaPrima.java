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
public class MateriaPrima extends Producto{
    private String granja;

    public MateriaPrima(String granja, String nombreProducto, String destino, Fecha fechaLlegada, Fecha fechaSalida) {
        super(nombreProducto, destino, fechaLlegada, fechaSalida);
        this.granja = granja;
    }
    
}
