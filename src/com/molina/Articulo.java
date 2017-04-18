package com.molina;

/**
 * Created by Fran Molina on 17/04/2017.
 */
public class Articulo {

    //Atributos

    private String nombre;
    private double precio;

    //Constructores

    public Articulo(String nombre, double precio) {
        this.setNombre(nombre);
        this.setPrecio(precio);
    }

    //Accesores

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0){
            this.precio = 1;
        }else {
            this.precio = precio;
        }
    }
}
