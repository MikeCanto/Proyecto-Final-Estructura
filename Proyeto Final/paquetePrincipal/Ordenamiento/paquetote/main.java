package paquetote;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        AlgoritmosDeOrdenamiento ordenar = new AlgoritmosDeOrdenamiento();

        Scanner teclado = new Scanner(System.in);
        int opcionMenu = 0;
        do {
            System.out.println(" ");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|            MENU: ORDENAMIENTO - BUSQUEDA:        |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("| 1.- Ordenamientopo por burbuja                   |");
            System.out.println("| 2.- Ordenamiento por QuickSort                   |");
            System.out.println("| 3.- Ordenamiento por Insercion                   |");
            System.out.println("| 4.- Ordenamiento por Shell                       |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("| 5.- Busqueda Secuencial                          |");
            System.out.println("| 6.- Busqueda Binaria                             |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("| 7.- Salir                                        |");
            System.out.println("|--------------------------------------------------|");
            System.out.print("Escoja una opcion: ");
            opcionMenu = teclado.nextInt();
            switch (opcionMenu){
                case 1:
                    System.out.println("Ordenamiento por burbuja: ");
                    System.out.print("Ingresa el tamaño del arreglo: ");
                    int tam1 = teclado.nextInt();
                    int vector1[] = new int [tam1];
                    for (int i = 0; i < tam1; i++){
                        System.out.print("Dato indice " + (i+1) + ": ");
                        vector1[i] = teclado.nextInt();
                    }
                    System.out.println("Arreglo original: ");
                    ordenar.mostrarArreglo(vector1);
                    ordenar.burbuja(vector1);
                    System.out.println("Arrego ordenado: ");
                    ordenar.mostrarArreglo(vector1);

                    break;
                case 2:
                    System.out.println("Ordenamiento por QuickSort: ");
                    System.out.print("Ingresa el tamaño del arreglo: ");
                    int tam2 = teclado.nextInt();
                    int vector2[] = new int [tam2];
                    for (int i = 0; i < tam2; i++){
                        System.out.print("Dato indice " + (i+1) + ": ");
                        vector2[i] = teclado.nextInt();
                    }
                    System.out.println("Arreglo original: ");
                    ordenar.mostrarArreglo(vector2);
                    System.out.println("Arreglo ordenado por QuickSort");
                    ordenar.quick(vector2, 0, vector2.length-1);

                    break;
                case 3:
                    System.out.println("Ordenamiento por Insercion: ");
                    System.out.print("Ingresa el tamaño del arreglo: ");
                    int tam3 = teclado.nextInt();
                    int vector3[] = new int [tam3];

                    for (int i = 0; i < tam3; i++){
                        System.out.print("Ingresa el elemento del indice " + (i+1) + ": ");
                        vector3[i] = teclado.nextInt();
                        ordenar.insercion(vector3, i+1);
                    }

                    break;
                case 4:
                    System.out.println("Ordenamiento por Shell");
                    System.out.print("Ingresa el tamaño del arreglo: ");
                    int tam4 = teclado.nextInt();
                    int vector4[] = new int [tam4];
                    for (int i = 0; i < tam4; i++){
                        System.out.print("Dato indice " + (i+1) + ": ");
                        vector4[i] = teclado.nextInt();
                    }
                    System.out.println("Arreglo original");
                    ordenar.mostrarArreglo(vector4);
                    ordenar.shell(vector4);

                    break;
                case 5:
                    System.out.println("Busqueda Secuencial:");
                    System.out.print("Ingresa el tamaño del arreglo: ");
                    int tam5 = teclado.nextInt();
                    int vector5[] = new int [tam5];
                    for (int i = 0; i < tam5; i++){
                        System.out.print("Dato indice " + (i+1) + ": ");
                        vector5[i] = teclado.nextInt();
                    }
                    System.out.print("\nDato a encontrar: ");
                    int encontrar = teclado.nextInt();
                    ordenar.mostrarArreglo(vector5);
                    int indice = ordenar.busquedaSecuencial(vector5, encontrar);
                    if (indice != -1){
                        System.out.println("Elemento encontrado en la posicion: " + (indice+1));
                    }
                    else {
                        System.out.println("Elemento no encontrado");
                    }

                    break;
                case 6:
                    System.out.println("Busqueda Binaria:");
                    System.out.print("Ingresa el tamaño del arreglo: ");
                    int tam6 = teclado.nextInt();
                    int vector6[] = new int [tam6];
                    for (int i = 0; i < tam6; i++){
                        System.out.print("Dato indice " + (i+1) + ": ");
                        vector6[i] = teclado.nextInt();
                    }
                    ordenar.mostrarArreglo(vector6);
                    ordenar.shell(vector6);
                    ordenar.mostrarArreglo(vector6);
                    System.out.print("\nDato a encontrar: ");
                    int encontrarB = teclado.nextInt();
                    int indiceA = ordenar.busquedaBinaria(vector6, encontrarB);
                    if (indiceA != -1){
                        System.out.println("Elemento encontrado en la posicion: " + (indiceA+1));
                    }
                    else {
                        System.out.println("Elemento no encontrado");
                    }

                    break;
                case 7:
                    System.out.println("SALIR...");
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
                    break;
            }
        }while (opcionMenu != 7);

        // Burbuja
        /*

        int vector1[] = {8,9,3,1,2};
        System.out.println("Arreglo original: ");
        ordenar.mostrarArreglo(vector1);
        ordenar.burbuja(vector1);
        System.out.println("Arrego ordenado: ");
        ordenar.mostrarArreglo(vector1);

         */


        //QuickSort
        /*
        int vector3[] = {5,2,1,8,3,9,7};
        System.out.println("Arreglo original: ");
        ordenar.mostrarArreglo(vector3);
        System.out.println("Arreglo ordenado por QuickSort");
        ordenar.quick(vector3, 0, vector3.length-1);
         */

        // Insercion
        /*
        int tam;
        System.out.print("Ingresa el tamaño del arreglo: ");
        Scanner teclado = new Scanner(System.in);
        tam = teclado.nextInt();
        int vectorsito[] = new int [tam];
        for (int i = 0; i < tam; i++){
            System.out.print("Ingresa el elemento del indice " + i + ": ");
            vectorsito[i] = teclado.nextInt();
            ordenar.insercion(vectorsito, i+1);
        }
         */

        //Shell
        /*
        int vector3[] = {5,2,1,8,3,9,7};
        System.out.println("Arreglo original");
        ordenar.mostrarArreglo(vector3);
        ordenar.shell(vector3);
         */

        // ____________________________________________________________________________________________
        // BUSQUEDAS
        // ____________________________________________________________________________________________

        // Busqueda secuencial
        /*
        int vector2[] = {55,4,43,44,2,10,4567,638,3,0,-5,-9};
        int encontrar = -9;
        ordenar.mostrarArreglo(vector2);
        int indice = ordenar.busquedaSecuencial(vector2, encontrar);
        if (indice != -1){
            System.out.println("Elemento encontrado en el indice " + indice);
        }
        else {
            System.out.println("Elemento no encontrado");
        }

         */

        // Busqueda binaria
        /*
        int vector2[] = {55,4,43,44,2,10,4567,638,3,0,-5,-9};
        ordenar.mostrarArreglo(vector2);
        ordenar.shell(vector2);
        ordenar.mostrarArreglo(vector2);
        int encontrar = 10;
        int indice = ordenar.busquedaBinaria(vector2, encontrar);
        if (indice != -1){
            System.out.println("Elemento encontrado en el indice " + indice);
        }
        else {
            System.out.println("Elemento no encontrado");
        }

         */















    }
}
