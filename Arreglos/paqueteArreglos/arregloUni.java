package paqueteArreglos;

import java.net.PortUnreachableException;
import java.util.Scanner;

public class arregloUni {
    Scanner teclado = new Scanner(System.in);
    int nElementos;
    String [] arreglo = new String[nElementos];


    public arregloUni(){
        this.nElementos = 0;
        this.arreglo = new String[nElementos];
    }

    public void llenarArreglo(){
        System.out.print("Numero de elementos para el arrelgo: ");
        nElementos = teclado.nextInt();
        System.out.println("Digite los elementos del arreglo... ");
        for (int i = 0; i < arreglo.length; i++){
            System.out.print("Persona " + (i+1) + ": ");
            arreglo[i] = teclado.next();
        }


    }
























    /*
    public int numeroElementos(){
        System.out.print("Numero de elementos para el arrelgo: ");
        int nElementos = teclado.nextInt();
        String [] personas = new String[nElementos];
        return nElementos;
    }

     */































    /*
    public void llenarArregloUni(String [] arreglo){
        String [] personas = new String[nElementos];
        Scanner teclado = new Scanner(System.in);
        Scanner tecladoB = new Scanner(System.in);
        nElementos = numeroElementos();
        System.out.println("Digite los elementos del arreglo... ");
        for (int i = 0; i < nElementos; i++){
            System.out.print("Persona " + (i+1) + ": ");
            personas[i] = tecladoB.next();
        }

    }

    public void imprimirArregloUni(){
        String [] personas = new String[nElementos];
        for (int i = 0; i < nElementos; i++){
            System.out.println("Persona " + (i+1) + " : " + personas[i]);
        }
    }
    }
     */
}
