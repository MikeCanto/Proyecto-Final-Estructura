package paqueteLista;

import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Listas l = new Listas();

        Scanner teclado = new Scanner(System.in);
        int opcionMenu = 0;
        do {
            System.out.println(" ");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|                     MENU LISTA:                  |");
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
                    l.ingresarNodo();
                    break;
                case 2:
                    System.out.println("BUSCAR NODO: ");
                    l.buscarNodo();
                    break;
                case 3:
                    System.out.println("MODIFICAR NODO: ");
                    l.modificarNodo();
                    break;
                case 4:
                    System.out.println("ELIMINAR NODO");
                    l.eliminarNodo();
                    break;
                case 5:
                    System.out.println("DESPLEGAR LISTA");
                    l.desplegarLista();
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
