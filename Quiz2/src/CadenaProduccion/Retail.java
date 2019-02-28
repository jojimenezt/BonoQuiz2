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
import java.util.ArrayList;
public class Retail extends Eslabon{
    private ArrayList<ProductoVenta> productoVenta;

    public Retail(String nombre, String descripcion, double latitud, double longitud) {
        super(nombre, descripcion, latitud, longitud);
        this.productoVenta = new ArrayList<>();
    }
    
    public boolean registrarProductoVenta(double precio, int codVenta, ProductoDistribuido productoDistribuidora){
        return this.productoVenta.add(new ProductoVenta(precio, codVenta, productoDistribuidora));
    }
    
    
}
