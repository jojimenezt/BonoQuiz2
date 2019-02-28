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
public class DistributionCenter extends Eslabon{
    private ArrayList<ProductoDistribuido> productosDistribuidora;

    public DistributionCenter(String nombre, String descripcion, double latitud, double longitud) {
        super(nombre, descripcion, latitud, longitud);
        this.productosDistribuidora= new ArrayList<ProductoDistribuido>();
    }
    
    public boolean registrarProductoDistribucion(String nombreProducto, String destino, Fecha fechaLlegada, Fecha fechaSalida, ProductoProducido productoManufacturer){
        ProductoDistribuido producto;
        producto = new ProductoDistribuido(productoManufacturer, nombreProducto, destino, fechaLlegada, fechaSalida);
        return this.productosDistribuidora.add(producto);
    }
}
