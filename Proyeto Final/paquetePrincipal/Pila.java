package paquetePrincipal;
import java.util.Scanner;

public class Pila {
    Scanner teclado = new Scanner(System.in);

    NodoPila primero;

    public Pila(){
        primero = null;

    }

    public void ingresarNodo(){
        NodoPila nuevo = new NodoPila();
        System.out.print("Ingrese el dato que contendra el nuevo nodo: ");
        nuevo.dato = teclado.nextInt(); // se ingresa el primer nodo
        nuevo.siguiente = primero;
        primero = nuevo;
        System.out.println("Nodo ingresado correctamente");

    }

    public void buscarNodo(){
        NodoPila actual = new NodoPila();
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
        NodoPila actual = new NodoPila();
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
        NodoPila actual = new NodoPila();
        actual = primero;
        NodoPila anterior = new NodoPila();
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
        NodoPila actual = new NodoPila();
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
