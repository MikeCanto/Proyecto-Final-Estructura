package paquetePrincipal;

import java.util.Scanner;

public class ListaCircular {
    Scanner teclado = new Scanner(System.in);
    NodoListaCircular primero;
    NodoListaCircular ultimo;

    public ListaCircular(){
        primero = null;
        ultimo = null;
    }

    public void insertarNodo(){
        NodoListaCircular nuevo = new NodoListaCircular();
        System.out.print("Ingrese el dato que contendra el nodo: ");
        nuevo.dato = teclado.nextInt();

        if (primero == null){
            primero = nuevo;
            ultimo = nuevo;
            primero.siguiente = primero;
        } else {
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            ultimo = nuevo;
        }
        System.out.println("Nodo ingresado");
    }

    public void buscarNodo(){
        NodoListaCircular actual = new NodoListaCircular();
        actual = primero;
        boolean encontrado = false;

        System.out.print("Ingrese el nodo a buscar: ");
        int nodoBuscado = teclado.nextInt();

        if (primero != null){
            do {
                if (actual.dato == nodoBuscado){
                    System.out.println("Nodo con el dato (" + nodoBuscado + ") encontrado");
                    encontrado = true;
                }
                actual = actual.siguiente;
            } while (actual != primero && encontrado != true);

            if (!encontrado){
                System.out.println("Nodo no encontrado...");
            }
        } else {
            System.out.println("La lista se encuentra vacia");
        }
    }

    public void modificarNodo(){
        NodoListaCircular actual = new NodoListaCircular();
        actual = primero;
        boolean encontrado = false;

        System.out.print("Ingrese el nodo a modificar:");
        int nodoBuscado = teclado.nextInt();

        if (primero != null){
            do {
                if (actual.dato == nodoBuscado){
                    System.out.println("Nodo con el dato (" + nodoBuscado + ") encontrado");
                    System.out.print("Ingrese el nuevo dato para este nodo: ");
                    actual.dato = teclado.nextInt();
                    System.out.println(" Nodo modificado...");
                    encontrado = true;
                }
                actual = actual.siguiente;
            } while (actual != primero && encontrado != true);
            if (!encontrado){
                System.out.println("Nodo no encontrado");
            }
        } else {
            System.out.println("La lista se encuentra vacia...");
        }
    }

    public void eliminarNodo(){
        NodoListaCircular actual = new NodoListaCircular();
        actual = primero;
        NodoListaCircular anterior = new NodoListaCircular();
        anterior = null;
        boolean encontrado = false;

        System.out.print("Ingrese el dato del nodo a eliminar: ");
        int nodoBuscado = teclado.nextInt();

        if (primero != null){
            do {
                if (actual.dato == nodoBuscado){
                    System.out.println("Nodo con el dato (" + nodoBuscado + ") encontrado");

                    if (actual == primero){
                        primero = primero.siguiente;
                        ultimo.siguiente = primero;
                    } else if (actual == ultimo){
                        anterior.siguiente = primero;
                        ultimo = anterior;
                    } else {
                        anterior.siguiente = actual.siguiente;
                    }
                    System.out.println("Nodo eliminado...");
                    encontrado = true;
                }
                anterior = actual;
                actual = actual.siguiente;
            }while (actual != primero && encontrado != true);
            if (!encontrado){
                System.out.println("Nodo no encontrado");
            }
        } else {
            System.out.println("La lista se encuentra vacia");
        }
    }

    public void desplegarLista(){
        NodoListaCircular actual = new NodoListaCircular();
        actual = primero;
        if (primero != null){
            do {
                System.out.println(actual.dato);
                actual = actual.siguiente;
            } while (actual != primero);


        } else {
            System.out.println("La lista se encuentra vacia ");
        }
    }

}
