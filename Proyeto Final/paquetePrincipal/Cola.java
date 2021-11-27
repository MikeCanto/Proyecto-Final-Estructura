package paquetePrincipal;

import java.util.Scanner;

public class Cola {
    NodoCola primero;
    NodoCola ultimo;
    Scanner teclado = new Scanner(System.in);

    public Cola(){
        primero = null;
        ultimo = null;
    }
    public void insertarNodo(){
        NodoCola nuevo = new NodoCola();
        System.out.print("Ingrese el dato que contendra el nodo: ");
        nuevo.dato = teclado.nextInt();
        if (primero == null){
            primero = nuevo;
            primero.siguiente = null;
            ultimo = nuevo;

        } else {
            ultimo.siguiente = nuevo;
            nuevo.siguiente = null;
            ultimo = nuevo;
        }
        System.out.println("Nodo ingresado");
    }

    public void buscarNodo(){
        NodoCola actual = new NodoCola();
        actual = primero;
        boolean encontrado = false;

        System.out.print("Ingrese el dato del nodo a buscar:");
        int nodoBuscado = teclado.nextInt();

        if (primero != null) {
            while (actual != null && encontrado != true) {
                if (actual.dato == nodoBuscado){
                    System.out.println("Nodo " + nodoBuscado + " encontrado");
                    encontrado = true;
                }
                actual = actual.siguiente;
            }
            if (!encontrado ){
                System.out.println("Nodo no encontrado\n ");
            }
        } else {
            System.out.println("\nLa pila se encuentra vacia...\n");

        }
    }

    public void modificarNodo(){
        NodoCola actual = new NodoCola();
        actual = primero;
        boolean encontrado = false;

        System.out.print("Ingrese el dato del nodo a modificar: ");
        int nodoBuscado = teclado.nextInt();

        if (primero != null) {
            while (actual != null && encontrado != true) {
                if (actual.dato == nodoBuscado){
                    System.out.println("Nodo " + nodoBuscado + " encontrado");
                    System.out.print("Ingrese el nuevo dato para este nodo: ");
                    actual.dato = teclado.nextInt();
                    System.out.println("Nodo modificado ");

                    encontrado = true;
                }
                actual = actual.siguiente;
            }
            if (!encontrado ){
                System.out.println("Nodo no encontrado\n ");
            }
        } else {
            System.out.println("\nLa pila se encuentra vacia...\n");
        }

    }

    public void eliminarNodo(){
        NodoCola actual = new NodoCola();
        actual = primero;
        NodoCola anterior = new NodoCola();
        anterior = null;
        boolean encontrado = false;

        System.out.print("Ingrese el dato del nodo a eliminar:");
        int nodoBuscado = teclado.nextInt();

        if (primero != null)
        {
            while (actual != null && encontrado != true)
            {
                if (actual.dato == nodoBuscado)
                {
                    if (actual == primero)
                    { // Si el numero que estoy buscando es el primero
                        primero = primero.siguiente;
                    }
                    else if (actual == ultimo)
                    {
                        anterior.siguiente = null;
                        ultimo = anterior;
                    } else {
                        anterior.siguiente = actual.siguiente;
                    }
                    System.out.println("Nodo " + nodoBuscado + " eliminado");
                    encontrado = true;
                }
                anterior = actual;
                actual = actual.siguiente;
            }
            if (!encontrado ){
                System.out.println("Nodo no encontrado\n ");
            }
        } else {
            System.out.println("\nLa pila se encuentra vacia...\n");
        }

    }

    public void desplegarCola(){
        NodoCola actual = new NodoCola();
        actual = primero;
        if (primero != null){
            while (actual != null){
                System.out.println(" " +  actual.dato);
                actual = actual.siguiente;
            }

        }else {
            System.out.println("La cola se encuentra vacia");
        }


    }
}
