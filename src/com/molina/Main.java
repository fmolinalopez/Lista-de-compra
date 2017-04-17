package com.molina;
import java.util.Scanner;

/**
 * Created by Fran Molina on 17/04/2017.
 */

public class Main {

    public static void main(String[] args) {
        int option;

        while ((option = showMenu()) != 5){
            switch (option){
                case 1:
                    ListaCompra.añadirArticulo();
                    System.out.println();
                    break;
                case 2:
                    ListaCompra.eliminarArticulo();
                    System.out.println();
                    break;
                case 3:
                    ListaCompra.mostrarLista();
                    System.out.println();
                    break;
                case 4:
                    ListaCompra.importeTotal();
                    break;
                default:
            }
        }
        ListaCompra.pagar();
    }


    public static int showMenu(){
        Scanner input = new Scanner(System.in);
        int option;

        System.out.println("**********************************");
        System.out.println("* 1 - Añadir producto            *");
        System.out.println("* 2 - Eliminar producto          *");
        System.out.println("* 3 - Mostrar lista árticulos    *");
        System.out.println("* 4 - Consultar importe total    *");
        System.out.println("* 5 - Pagar                      *");
        System.out.println("**********************************");

        do {
            System.out.println("Opción: ");

            option = input.nextInt();
        }while (option < 0 || option > 5);

        System.out.println();
        return option;
    }
}
