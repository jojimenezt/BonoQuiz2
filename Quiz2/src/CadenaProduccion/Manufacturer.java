package CadenaProduccion;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Manufacturer extends Eslabon{
    private ArrayList<ProductoProducido> productosProducidos;

    public Manufacturer(String nombre, String descripcion, double latitud, double longitud) {
        super(nombre, descripcion, latitud, longitud);
        this.productosProducidos = new ArrayList<ProductoProducido>();
    }
    
    public boolean registrarProductoProducido(String nombreProducto, String destino, Fecha fechaLlegada, Fecha fechaSalida, String lote, ArrayList<MateriaPrima> materiaPrima){
        ProductoProducido producto;
        producto = new ProductoProducido(lote, materiaPrima, nombreProducto, destino, fechaLlegada, fechaSalida);
        return this.productosProducidos.add(producto);
    }
}
