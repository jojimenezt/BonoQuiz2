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
public class ProductoDistribuido extends Producto{
    private ProductoProducido productoManufacturer;

    public ProductoDistribuido(ProductoProducido productoManufacturer, String nombreProducto, String destino, Fecha fechaLlegada, Fecha fechaSalida) {
        super(nombreProducto, destino, fechaLlegada, fechaSalida);
        this.productoManufacturer = productoManufacturer;
    }

    public ProductoProducido getProductoManufacturer() {
        return productoManufacturer;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public String getDestino() {
        return destino;
    }

    public Fecha getFechaLlegada() {
        return fechaLlegada;
    }

    public Fecha getFechaSalida() {
        return fechaSalida;
    }
    
    
    
}
