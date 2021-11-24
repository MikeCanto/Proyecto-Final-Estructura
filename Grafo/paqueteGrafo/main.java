package paqueteGrafo;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner tecladoB = new Scanner(System.in);
        int opcionB = 0;
        long matriz[][];
        System.out.print("Tamaño de la matriz: ");
        int tamaño = 0;
        tamaño = teclado.nextInt();
        matriz = new long[tamaño][tamaño];

        for (int i = 0; i<tamaño; i++){
            for (int j = 0; j<tamaño; j++){
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
            System.out.println("| 2.- Salir                                                          |");
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
    }

}



