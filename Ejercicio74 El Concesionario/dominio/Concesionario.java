package dominio;
import java.util.*;
import java.io.*;

public class Concesionario implements serializable{

    // Definendo el ArrayList 
    private ArrayList<VehiculoTurismo> lista;

    public Concesionario(){
        // Inicializando ArrayList
        lista = new ArrayList<VehiculoTurismo>;
    }
    public Concesionario (VehiculoTurismo v){
        lista.add(v);
        return this;
    }
    public String toString(){
        String cadena = "";
        for(VehiculoTurismo v:lista){
            cadena += v +"\n";
        }
        return cadena;
    }
    public String toString(){
        for(VehiculoTurismo.precio, i++){
            sumaPrecios += VehiculoTurismo.precio;
        }
        return "La suma de los precios de los vehiculos turismo es
        " + sumaPrecios;

    }
   
    public String toString(){
        for(Vehiculo.precioFurgoneta, i++){
            sumaPreciosFurgoneta += Vehiculo.precioFurgoneta;
        }
        total = sumaPrecios + sumaPreciosFurgoneta;
        return "el precio total sumando el de las furgonetas con el de los 
        vehiculos turismo es " + total;

    }
    


    }
    

}