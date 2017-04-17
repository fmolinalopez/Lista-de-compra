package com.molina;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Fran Molina on 17/04/2017.
 */
public abstract class ListaCompra {

    private static ArrayList<Articulo> listaDeCompra = new ArrayList<Articulo>();

    public static void añadirArticulo(){
        Scanner input = new Scanner(System.in);
        String producto;
        double precio;
        Articulo articulo;

        System.out.println("Introduce el producto:");
        producto = input.nextLine();
        System.out.println("Introduce el precio del producto:");
        precio = input.nextDouble();

        articulo = new Articulo(producto,precio);
        listaDeCompra.add(articulo);

        input.nextLine();
    }

    public static void mostrarLista(){
        int index = 0;

        System.out.println("# - Articulo, Precio");

        for (Articulo articulo: listaDeCompra){
            System.out.println((index+1) + " - " + articulo.getNombre() + ", " + articulo.getPrecio() + "€");
            index++;
        }
    }

    public static void eliminarArticulo(){
        Scanner input = new Scanner(System.in);
        int indice;

        mostrarLista();

        System.out.println("Introduzca el indice del articulo a borrar:");
        indice = input.nextInt();

        if (correctIndex(indice)){
            listaDeCompra.remove(indice-1);
        }else {
            System.out.println("El inidice no es correcto");
        }
    }

    public static boolean correctIndex(int index){
        if (index > 0 && index <= listaDeCompra.size()){
            return true;
        }else {
            return false;
        }
    }

    public static void importeTotal(){
        double total = 0;

        for (Articulo articulo: listaDeCompra){
            total += articulo.getPrecio();
        }

        System.out.println("Importe total: " + total + "€");
    }

    public static void pagar(){
        mostrarLista();
        importeTotal();
    }

}
