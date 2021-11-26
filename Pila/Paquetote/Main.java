package Paquetote;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pila p = new Pila();
        Scanner teclado = new Scanner(System.in);
        int opcionMenu = 0;
        do {
            System.out.println(" ");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|                     MENU PILA:                   |");
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
                    p.ingresarNodo();
                    break;
                case 2:
                    System.out.println("BUSCAR NODO: ");
                    p.buscarNodo();
                    break;
                case 3:
                    System.out.println("MODIFICAR NODO: ");
                    p.modificarNodo();
                    break;
                case 4:
                    System.out.println("ELIMINAR NODO");
                    p.eliminarNodo();
                    break;
                case 5:
                    System.out.println("DESPLEGAR PILA");
                    p.desplegarPila();
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
