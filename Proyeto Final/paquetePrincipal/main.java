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
            System.out.println("|xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx|");
            System.out.println("|------------------------------------------|");
            System.out.println("|               MENU PRINCIPAL:            |");
            System.out.println("|------------------------------------------|");
            System.out.println("| 1.- Arreglos                             |");
            System.out.println("| 2.- Pila                                 |");
            System.out.println("| 3.- Cola                                 |");
            System.out.println("|------------------------------------------|");
            System.out.println("| 4.- Lista                                |");
            System.out.println("| 5.- Lista Circular                       |");
            System.out.println("| 6.- Metodos de ordenamiento              |");
            System.out.println("|------------------------------------------|");
            System.out.println("| 7.- Arbol                                |");
            System.out.println("| 8.- Grafo                                |");
            System.out.println("|------------------------------------------|");
            System.out.println("| 9.- Salir                                |");
            System.out.println("|------------------------------------------|");
            System.out.println("|xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx|");
            System.out.println("|------------------------------------------|");
            System.out.print("Escoja una opcion: ");
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("//////////////////////////////////////////");
                    System.out.println("               ARREGLOS                   ");
                    System.out.println("//////////////////////////////////////////");
                    System.out.println("\nEstos arreglos estan pensados para un profesor y la administracion de grupo(s)");
                    int opcionMenu = 0;
                    do {
                        System.out.println(" ");
                        System.out.println("|-----------------------------------------------------------------|");
                        System.out.println("|                          MENU ARREGLOS:                         |");
                        System.out.println("|--------------------------------|--------------------------------|");
                        System.out.println("| 1.- Arreglo Unidimencional     | 3.- Arreglo Multidimencional   |");
                        System.out.println("| 2.- Arreglo Bidimencional      | 4.- Regresar menu              |");
                        System.out.println("|--------------------------------|--------------------------------|");
                        System.out.print("Escoja una opcion: ");
                        opcionMenu = teclado.nextInt();
                        switch (opcionMenu){
                            case 1:
                                System.out.println("ARREGLO UNIDIMENCIONAL (Lista de alumnos): ");
                                System.out.print("Numero de alumnos para el salon: ");
                                int nElementos = teclado.nextInt();
                                String [] personas = new String[nElementos];
                                System.out.println("Digite los alumnos del salon... ");
                                for (int i = 0; i < nElementos; i++){
                                    System.out.print("Alumno " + (i+1) + ": ");
                                    personas[i] = teclado.next();
                                }
                                System.out.println("\nMostrando salon:\n");
                                for (int i = 0; i < nElementos; i++){
                                    System.out.println("Persona " + (i+1) + " : " + personas[i]);
                                }
                                break;
                            case 2:
                                ///////////////////////////////////////////////////////////////////////////////////////////
                                ///////////////////////////////////////////////////////////////////////////////////////////

                                System.out.println("ARREGLO BIDIMENCIONAL (Lista de alumnos): ");
                                String arregloBi[][];
                                int nFilas;
                                int nCol;

                                // SE PIDEN LOS DATOS AL MAESTRO
                                System.out.print("\nNumero de alumnos: ");
                                nFilas = teclado.nextInt();
                                System.out.print("Numero de categorias: ");
                                nCol = tecladoB.nextInt();

                                // Se introducen las categorias
                                String categoria[] = new String[nCol];
                                System.out.print("\n");
                                for (int i = 0; i < nCol; i++){
                                    System.out.print("Categoria " + (i+1) + ": ");
                                    categoria[i] = teclado.next();
                                }

                                // Se intorducen los datos al arreglo bidimencional
                                arregloBi = new String[nFilas][nCol];
                                for (int i = 0; i < nFilas; i++){ // n de filas
                                    for (int j = 0; j < nCol; j++){  // n de columnas
                                        System.out.print( categoria[j]+" del alumno " + (i +1) + ": ");
                                        arregloBi[i][j] = teclado.next();
                                    }
                                }

                                // SE IMPRIME EL ARREGLO:

                                System.out.println("\nDATOS GUARDADOS EN EL ARREGLO: \n");
                                System.out.print("CATEGORIAS: ");
                                for (int i = 0; i < nCol; i++){
                                    System.out.print(categoria[i] + ", ");
                                }

                                System.out.println(" ");
                                for (int i = 0; i < nFilas; i++){
                                    System.out.print("Datos alumno " + (i+1) + ": ");
                                    for (int j = 0; j < nCol; j++){
                                        System.out.print(arregloBi[i][j] + ", ");
                                    }
                                    System.out.println(" ");
                                }
                                break;
                            case 3:
                                ///////////////////////////////////////////////////////////////////////////////////////////
                                ///////////////////////////////////////////////////////////////////////////////////////////
                                System.out.println("ARREGLO TRIDIMENCIONAL:  ");

                                String arregloTri[][][];
                                int nI = 0;
                                int nJ = 0;
                                int nK = 0;

                                // Pedimos datos principales

                                System.out.print("\nNumero de alumnos: ");
                                nI = teclado.nextInt();
                                System.out.print("Numero de categorias: ");
                                nJ = teclado.nextInt();
                                System.out.print("Numero de clases: ");
                                nK = teclado.nextInt();

                                // Se piden los datos de las categorias
                                String categoriaTri[] = new String[nJ];
                                System.out.print("\n");
                                for (int j = 0; j < nJ; j++){
                                    System.out.print("Categoria " + (j+1) + ": ");
                                    categoriaTri[j] = teclado.next();
                                }
                                System.out.println(" ");

                                // Iniciamos arreglo
                                arregloTri = new String[nI][nJ][nK];

                                for (int k = 0; k < nK; k++){
                                    for (int i = 0; i < nI; i++){
                                        for (int j = 0; j < nJ; j++){
                                            System.out.print("Clase " + (k+1) + ": "+ categoriaTri[j] + " del alumno " + (i+1) + ": ");
                                            arregloTri[i][j][k] = teclado.next();
                                        }
                                    }
                                    System.out.println(" ");
                                }

                                // se imprimen los datos guardados en el arreglo

                                // Cateogrias
                                System.out.print("\nCATEGORIAS: ");
                                for (int j = 0; j < nJ; j++){
                                    System.out.print(categoriaTri[j] + ", ");
                                }
                                System.out.println("");

                                // Datos
                                for (int k = 0; k < nK; k++){
                                    System.out.println("CLASE:  " + (k+1));
                                    for (int i = 0; i < nI; i++){
                                        System.out.print("Datos alumno " + (i+1) + ": ");
                                        for (int j = 0; j < nJ; j++){
                                            System.out.print(arregloTri[i][j][k] + ", ");
                                        }
                                        System.out.println("");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 4:
                                System.out.println("SALIR...");
                                break;
                            default:
                                System.out.println("OPCION NO VALIDA");
                                break;
                        }
                    }while (opcionMenu != 4);
                    break;
                case 2:
                    System.out.println("//////////////////////////////////////////");
                    System.out.println("                 PILA                     ");
                    System.out.println("//////////////////////////////////////////");
                    Pila p = new Pila();
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
                    Lista l = new Lista();
                    do {
                        System.out.println(" ");
                        System.out.println("|--------------------------------------------------|");
                        System.out.println("|                     MENU LISTA:                  |");
                        System.out.println("|-------------------------|------------------------|");
                        System.out.println("| 1.- Insertar            | 4.- Eliminar           |");
                        System.out.println("| 2.- Buscar              | 5.- Desplegar          |");
                        System.out.println("| 3.- Modificar           | 6.- Regresar Menu      |");
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


                    break;
                case 5:
                    System.out.println("//////////////////////////////////////////");
                    System.out.println("             LISTA CIRCULAR               ");
                    System.out.println("//////////////////////////////////////////");
                    ListaCircular LC = new ListaCircular();
                    do {
                        System.out.println(" ");
                        System.out.println("|--------------------------------------------------|");
                        System.out.println("|               MENU LISTA CIRCULAR:               |");
                        System.out.println("|-------------------------|------------------------|");
                        System.out.println("| 1.- Insertar            | 4.- Eliminar           |");
                        System.out.println("| 2.- Buscar              | 5.- Desplegar          |");
                        System.out.println("| 3.- Modificar           | 6.- Menu principal     |");
                        System.out.println("|-------------------------|------------------------|");
                        System.out.print("Escoja una opcion: ");
                        opcionMenu = teclado.nextInt();
                        switch (opcionMenu){
                            case 1:
                                System.out.println("INSERTAR NODO: ");
                                LC.insertarNodo();
                                break;
                            case 2:
                                System.out.println("BUSCAR NODO: ");
                                LC.buscarNodo();
                                break;
                            case 3:
                                System.out.println("MODIFICAR NODO: ");
                                LC.modificarNodo();
                                break;
                            case 4:
                                System.out.println("ELIMINAR NODO");
                                LC.eliminarNodo();
                                break;
                            case 5:
                                System.out.println("DESPLEGAR LISTA CIRCULAR:");
                                LC.desplegarLista();
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
                case 6:
                    System.out.println("//////////////////////////////////////////");
                    System.out.println("         METODOS DE ORDENAMIENTO          ");
                    System.out.println("//////////////////////////////////////////");
                    AlgoritmosDeOrdenamiento ordenar = new AlgoritmosDeOrdenamiento();
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
                        System.out.println("| 7.- Regresar menu                                |");
                        System.out.println("|--------------------------------------------------|");
                        System.out.print("Escoja una opcion: ");
                        opcionMenu = teclado.nextInt();
                        switch (opcionMenu){
                            case 1:
                                System.out.println("Ordenamiento por burbuja: ");
                                System.out.print("Ingresa el tama??o del arreglo: ");
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
                                System.out.print("Ingresa el tama??o del arreglo: ");
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
                                System.out.print("Ingresa el tama??o del arreglo: ");
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
                                System.out.print("Ingresa el tama??o del arreglo: ");
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
                                System.out.print("Ingresa el tama??o del arreglo: ");
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
                                System.out.print("Ingresa el tama??o del arreglo: ");
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


                    break;
                case 7:
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
                case 8:
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
                case 9:
                    System.out.println("\nSALIENDO................................");
                    break;
                default:
                    System.out.println("!!!!!!!!!!!OPCION NO VALIDA!!!!!!!!!!!!!!!");
                    break;
            }
        } while (opcion != 9);
    }
}
