package paqueteCola;
import java.net.PortUnreachableException;
import java.util.Scanner;

public class Cola {
    Nodo primero;
    Nodo ultimo;
    Scanner teclado = new Scanner(System.in);

    public Cola(){
        primero = null;
        ultimo = null;
    }
    public void insertarNodo(){
        Nodo nuevo = new Nodo();
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
        Nodo actual = new Nodo();
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
        Nodo actual = new Nodo();
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
        Nodo actual = new Nodo();
        actual = primero;
        Nodo anterior = new Nodo();
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
        Nodo actual = new Nodo();
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
