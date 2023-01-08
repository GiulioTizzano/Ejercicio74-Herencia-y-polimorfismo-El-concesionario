package dominio;
import java.util.*;
import java.io.*;


public class Vehiculo{
    String marca;
    String modelo;
    String precioBase;
}
public Vehiculo(){
    this.marca = marca;
    this.modelo = modelo;
    this.preciobase = preciobase
}
public class Furgoneta{
    int capacidad;
    int precioBaseFurgoneta;
    int precioFurgoneta;
    public precioFinalFurgoneta(int capacidad, int precioBaseFurgoneta){
        if(precioBaseFurgoneta){
            precioFurgoneta = (1/2)*(Math.cbrt(precioBase));

        }

    }
}

public abstract class PrecioFinal(){
    public abstract void PrecioFinal(String marca, String modelo, int numPlazas, int precioBase);
}

