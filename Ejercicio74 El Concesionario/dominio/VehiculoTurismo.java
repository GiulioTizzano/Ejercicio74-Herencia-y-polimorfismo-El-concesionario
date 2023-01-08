package dominio;
import java.util.*;
import java.io.*;

public class VehiculoTurismo extends Vehiculo{
    int numPlazas;
    int precio;

    public precioFinal(String marca, String modelo, int numPlazas,int precioBase){
        super(marca, modelo, precioBase);
        this.marca = marca;
        this.modelo = modelo;
        this.numPlazas = numPlazas;

        if(numPlazas <= 5){
            precio = precioBase;
        }
        else(){
            for(i = 1; numPlazas < 7; i++){
                precio = (precioBase) * (0.10);
                System.out.print(precio);
            }

        }

        public void setMarca(String marca){
            this.marca = marca;
        }
        public String getmarca(){
            return marca;
        }
        public void setModelo(String modelo){
            this.modelo = modelo;
        }
        public String getModelo(){
            return modelo;
        }
        public void setNumPlazas(int numPlazas){
            this.numPlazas = numPlazas;
        }
        public int getNumPlazas(){
            return numPlazas;
        }
        public void setPrecio(int precio){
            this.precio = precio;
        }
        public int getPrecio(){
            return precio;
        }
        public void setCapacidad(int capacidad){
            this.capacidad = capacidad;
        }
        public int getCapacidad(){
            return capacidad;
        }
        public void setPrecioBaseFurgoneta(int precioBaseFurgoneta){
            this.precioBaseFurgoneta = precioBaseFurgoneta;
        }
        public int getPrecioBaseFurgoneta(){
            return precioBaseFurgoneta;
        }
        public String toString(){
            return "La marca del vehiclo es " + marca + "de modelo " + modelo + "tiene " + numPlazas 
            + "numero de plazas " + "y su precio final es " + precio + "el precio de la furgoneta que es
            " + precioFurgoneta;
        }
    }




    }



}