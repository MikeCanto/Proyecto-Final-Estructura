package paqueteArreglos;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        arregloUni u = new arregloUni();

        Scanner teclado = new Scanner(System.in);
        int opcionMenu = 0;
        do {
            System.out.println(" ");
            System.out.println("|-----------------------------------------------------------------|");
            System.out.println("|                          MENU ARREGLOS:                         |");
            System.out.println("|--------------------------------|--------------------------------|");
            System.out.println("| 1.- Arreglo Unidimencional     | 3.- Arreglo Multidimencional   |");
            System.out.println("| 2.- Arreglo Bidimencional      | 4.- Salir                      |");
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

                    Scanner tecladoB = new Scanner(System.in);
                    System.out.println("ARREGLO VIDIMENCIONAL (Lista de alumnos): ");
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

    }
}
