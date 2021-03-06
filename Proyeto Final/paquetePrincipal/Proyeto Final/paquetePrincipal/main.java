package paquetePrincipal;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Scanner tecladoB = new Scanner(System.in);
        int opcion = 0;
        do{
            System.out.println(" ");
            System.out.println("|------------------------------------------|");
            System.out.println("|//////////////////////////////////////////|");
            System.out.println("|------------------------------------------|");
            System.out.println("|               MENU PRINCIPAL:            |");
            System.out.println("|------------------------------------------|");
            System.out.println("| 1.- Arreglos                             |");
            System.out.println("| 2.- Pila                                 |");
            System.out.println("| 3.- Cola                                 |");
            System.out.println("|------------------------------------------|");
            System.out.println("| 4.- Lista                                |");
            System.out.println("| 5.- Lista Circular                       |");
            System.out.println("|------------------------------------------|");
            System.out.println("| 6.- Arbol                                |");
            System.out.println("| 7.- Grafo                                |");
            System.out.println("|------------------------------------------|");
            System.out.println("| 8.- Salir                                |");
            System.out.println("|------------------------------------------|");
            System.out.println("|//////////////////////////////////////////|");
            System.out.println("|------------------------------------------|");
            System.out.print("Escoja una opcion: ");
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("//////////////////////////////////////////");
                    System.out.println("               ARREGLOS                   ");
                    System.out.println("//////////////////////////////////////////");
                    break;
                case 2:
                    System.out.println("//////////////////////////////////////////");
                    System.out.println("                 PILA                     ");
                    System.out.println("//////////////////////////////////////////");
                    Pila p = new Pila();
                    int opcionMenu = 0;
                    do {
                        System.out.println(" ");
                        System.out.println("|--------------------------------------------------|");
                        System.out.println("|                     MENU PILA:                   |");
                        System.out.println("|-------------------------|------------------------|");
                        System.out.println("| 1.- Insertar            | 4.- Eliminar           |");
                        System.out.println("| 2.- Buscar              | 5.- Desplegar          |");
                        System.out.println("| 3.- Modificar           | 6.- Regresar el menu   |");
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
                    break;
                case 3:
                    System.out.println("//////////////////////////////////////////");
                    System.out.println("                 COLA                     ");
                    System.out.println("//////////////////////////////////////////");
                    Cola c = new Cola();
                    int opcionMenuC = 0;
                    do {
                        System.out.println(" ");
                        System.out.println("|--------------------------------------------------|");
                        System.out.println("|                     MENU COLA:                   |");
                        System.out.println("|-------------------------|------------------------|");
                        System.out.println("| 1.- Insertar            | 4.- Eliminar           |");
                        System.out.println("| 2.- Buscar              | 5.- Desplegar          |");
                        System.out.println("| 3.- Modificar           | 6.- Regresar menu      |");
                        System.out.println("|-------------------------|------------------------|");
                        System.out.println(" ");
                        System.out.print("Escoja una opcion: ");
                        opcionMenuC = teclado.nextInt();
                        switch (opcionMenuC){
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
                    }while (opcionMenuC != 6);


                    break;
                case 4:
                    System.out.println("//////////////////////////////////////////");
                    System.out.println("                 LISTA                    ");
                    System.out.println("//////////////////////////////////////////");
                    break;
                case 5:
                    System.out.println("//////////////////////////////////////////");
                    System.out.println("             LISTA CIRCULAR               ");
                    System.out.println("//////////////////////////////////////////");
                    break;
                case 6:
                    System.out.println("//////////////////////////////////////////");
                    System.out.println("                 ARBOL                    ");
                    System.out.println("//////////////////////////////////////////");
                    int elemento;
                    String nombre;
                    ArbolBinario arbolito = new ArbolBinario();
                    do{
                        System.out.println(" ");
                        System.out.println("|--------------------------------------------------------------------|");
                        System.out.println("|                        MENU ARBOL BINARIO:                         |");
                        System.out.println("|---------------------------------|----------------------------------|");
                        System.out.println("| 1.- Insertar nodo               |  5.- Buscar un nodo en el arbol  |");
                        System.out.println("| 2.- Recorrer el arbol InOrden   |  6.- Eliminar un nodo del arbol  |");
                        System.out.println("| 3.- Recorrer el arbol PreOrden  |  7.- Regresar menu principal     |");
                        System.out.println("| 4.- Recorrer el arbol PostOrden |                                  |");
                        System.out.println("|---------------------------------|----------------------------------|");
                        System.out.print("Escoja una opcion: ");
                        opcion = teclado.nextInt();
                        switch (opcion){
                            case 1:
                                System.out.println("INSERTAR NODO: ");
                                System.out.print("Ingresar el numero del nodo: ");
                                elemento = teclado.nextInt();
                                System.out.print("Ingrese el nombre del nodo: ");
                                nombre = tecladoB.nextLine();
                                arbolito.agregarNodo(elemento,nombre);
                                break;
                            case 2:
                                if (!arbolito.estaVacio()){
                                    System.out.println("\nRecorriendo arbol InOrder:");
                                    arbolito.inOrden(arbolito.raiz);
                                }else {
                                    System.out.println("El arbol esta vacio...");
                                }
                                break;
                            case 3:
                                if (!arbolito.estaVacio()){
                                    System.out.println("\nRecorriendo arbol PreOrder:");
                                    arbolito.preOrden(arbolito.raiz);
                                }else {
                                    System.out.println("El arbol esta vacio...");
                                }
                                break;
                            case 4:
                                if (!arbolito.estaVacio()){
                                    System.out.println("\nRecorriendo arbol PostOrder:");
                                    arbolito.postOrden(arbolito.raiz);
                                }else {
                                    System.out.println("El arbol esta vacio...");
                                }
                                break;
                            case 5:
                                if (!arbolito.estaVacio()){
                                    System.out.println("Buscar un nodo en el arbol");
                                    System.out.print("Nodo a encontrar: ");
                                    elemento = teclado.nextInt();
                                    if (arbolito.buscarNodo(elemento) == null){
                                        System.out.println("Nodo no encontrado...");
                                    }else {
                                        System.out.println("Nodo encontrado, los datos son: " + arbolito.buscarNodo(elemento));
                                    }
                                }else {
                                    System.out.println("El arbol esta vacio...");
                                }
                                break;
                            case 6:
                                if (!arbolito.estaVacio()){
                                    System.out.println("Eliminar un nodo del arbol");
                                    System.out.print("Nodo a eliminar: ");
                                    elemento = teclado.nextInt();
                                    if (arbolito.eliminar(elemento) == false){
                                        System.out.println("Nodo no encontrado...");
                                    }else {
                                        System.out.println("Nodo eliminado");
                                    }
                                }else {
                                    System.out.println("El arbol esta vacio...");
                                }
                                break;
                        }
                    } while (opcion != 7);

                    break;
                case 7:
                    System.out.println("//////////////////////////////////////////");
                    System.out.println("                 GRAFO                    ");
                    System.out.println("//////////////////////////////////////////");
                    int opcionB = 0;
                    long matriz[][];
                    System.out.print("Tama??o de la matriz: ");
                    int tama??o = 0;
                    tama??o = teclado.nextInt();
                    matriz = new long[tama??o][tama??o];

                    System.out.println("Introduzca la matriz de pesos \n[NOTA: Infinito = 999999999]");
                    for (int i = 0; i<tama??o; i++){
                        for (int j = 0; j<tama??o; j++){
                            System.out.println("Dato para [" + (i+1) + "] [" + (j+1) + "]: ");
                            matriz[i][j] = tecladoB.nextLong();

                        }
                    }

                    do {
                        System.out.println(" ");
                        System.out.println("|--------------------------------------------------------------------|");
                        System.out.println("|                            MENU GRAFO:                             |");
                        System.out.println("|--------------------------------------------------------------------|");
                        System.out.println("| 1.- Encontrar caminos mas cortos (Floyd-Warshall)                  |");
                        System.out.println("| 2.- Regresar menu principal                                        |");
                        System.out.println("|--------------------------------------------------------------------|");
                        System.out.print("Escoja una opcion: ");
                        opcionB = tecladoB.nextInt();
                        switch (opcionB){
                            case 1:
                                CaminosMinimos ruta = new CaminosMinimos();
                                System.out.println(ruta.algoritmoFloyd(matriz));
                                break;
                        }

                    } while (opcionB != 2);
                    break;
                case 8:
                    System.out.println("\nSALIENDO................................");
                    break;
                default:
                    System.out.println("!!!!!!!!!!!OPCION NO VALIDA!!!!!!!!!!!!!!!");
                    break;
            }
        } while (opcion != 8);
    }
}
