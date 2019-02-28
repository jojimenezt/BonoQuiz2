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
public class Farmer extends Eslabon{
    private ArrayList<MateriaPrima> productosCultivados;

    public Farmer(String nombre, String descripcion, double latitud, double longitud) {
        super(nombre, descripcion, latitud, longitud);
        this.productosCultivados = new ArrayList<MateriaPrima>();
    }
    
    public boolean registrarProducto(String nombreProducto,String destino, Fecha fechaLlegada, Fecha fechaSalida, String granja){
        MateriaPrima producto = new MateriaPrima(granja,nombreProducto, destino, fechaLlegada, fechaSalida);
        return this.productosCultivados.add(producto);
    }
            
}
