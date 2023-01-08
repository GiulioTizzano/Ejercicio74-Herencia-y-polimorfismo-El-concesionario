package aplicacion;
import dominio.*;
import java.io.*;
import java.util.*;

public class Principal{
    public static void main(String[] args){
        ObjectInputStream fi;
        ObjectOutputStream fo;
        Concesionario c;
        try {
            fi = new ObjectInputStream(new FileInputStream("Concesionario.txt"));
            c = (Concesionario) fi.readObject();
            fi.close();
        } catch(Exception e) {
            c = new Concesionario();
        }
        try {
            fo = new ObjectOutputStream(new FileOutputStream("Concesionario.txt"));
            fo.writeObject(c);
            fo.close();
        } catch(Exception e) {
            System.out.print("Error al crear el fichero");
        }
    }

}