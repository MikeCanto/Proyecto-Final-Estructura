package paqueteCola;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Cola c = new Cola();
        Scanner teclado = new Scanner(System.in);
        int opcionMenu = 0;
        do {
            System.out.println(" ");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|                     MENU COLA:                   |");
            System.out.println("|-------------------------|------------------------|");
            System.out.println("| 1.- Insertar            | 4.- Eliminar           |");
            System.out.println("| 2.- Buscar              | 5.- Desplegar          |");
            System.out.println("| 3.- Modificar           | 6.- Salir              |");
            System.out.println("|-------------------------|------------------------|");
            System.out.println(" ");
            System.out.print("Escoja una opcion: ");
            opcionMenu = teclado.nextInt();
            switch (opcionMenu){
                case 1:
                    System.out.println("INSERTAR NODO: ");
                    c.insertarNodo();
                    break;
                case 2:
                    System.out.println("BUSCAR NODO: ");
                    c.buscarNodo();
                    break;
                case 3:
                    System.out.println("MODIFICAR NODO: ");
                    c.modificarNodo();
                    break;
                case 4:
                    System.out.println("ELIMINAR NODO");
                    c.eliminarNodo();
                    break;
                case 5:
                    System.out.println("DESPLEGAR COLA:");
                    c.desplegarCola();

                    break;
                case 6:
                    System.out.println("SALIR...");
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
                    break;
            }
        }while (opcionMenu != 6);


    }
}
