/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionArchivos;

import CadenaProduccion.ProductoVenta;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Gestion {
    private String ruta;

    public Gestion(String ruta) {
        this.ruta = ruta;
    }

    public boolean guardar(ArrayList<ProductoVenta> productos) throws IOException{
        File archivo = new File(this.ruta);
        if(!archivo.exists())
            archivo.createNewFile();
        PrintStream salida = new PrintStream(archivo);
        for(ProductoVenta producto: productos){
            salida.print(producto);
            salida.print("\n");
        }
        salida.flush();
        salida.close();
        return true;
    }
}
