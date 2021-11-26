package Paquetote;
import java.util.Scanner;

public class Pila {
    Scanner teclado = new Scanner(System.in);

    Nodo primero;

    public Pila(){
        primero = null;

    }

    public void ingresarNodo(){
        Nodo nuevo = new Nodo();
        System.out.print("Ingrese el dato que contendra el nuevo nodo: ");
        nuevo.dato = teclado.nextInt(); // se ingresa el primer nodo
        nuevo.siguiente = primero;
        primero = nuevo;
        System.out.println("Nodo ingresado correctamente");

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
                    else
                    {
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

    public void desplegarPila(){
        Nodo actual = new Nodo();
        actual = primero;
        if (primero != null) {
            while (actual != null) {
                System.out.println("" + actual.dato);
                actual = actual.siguiente;
            }
        } else {
            System.out.println("\nLa pila se encuentra vacia...\n");
        }
    }



}
