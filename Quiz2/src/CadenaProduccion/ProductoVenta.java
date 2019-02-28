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
public class ProductoVenta {
    private double valorProducto;
    private int codVenta;
    private ProductoDistribuido ProductoDistribucion; 

    public ProductoVenta(double valorProducto, int codVenta, ProductoDistribuido ProductoDistribucion) {
        this.valorProducto = valorProducto;
        this.codVenta= codVenta;
        this.ProductoDistribucion = ProductoDistribucion;
    }

    public double getValorProducto() {
        return valorProducto;
    }

    public int getCodVenta() {
        return codVenta;
    }

    public ProductoDistribuido getProductoDistribucion() {
        return ProductoDistribucion;
    }
    
    
}
