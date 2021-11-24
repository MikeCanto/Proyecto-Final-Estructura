package paquetote;
import java.lang.constant.DynamicCallSiteDesc;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner tecladoB = new Scanner(System.in);

        int opcion = 0, elemento;
        String nombre;
        ArbolBinario arbolito = new ArbolBinario();
        do{
            System.out.println(" ");
            System.out.println("|--------------------------------------------------------------------|");
            System.out.println("|                        MENU ARBOL BINARIO:                         |");
            System.out.println("|---------------------------------|----------------------------------|");
            System.out.println("| 1.- Insertar nodo               |  5.- Buscar un nodo en el arbol  |");
            System.out.println("| 2.- Recorrer el arbol InOrden   |  6.- Eliminar un nodo del arbol  |");
            System.out.println("| 3.- Recorrer el arbol PreOrden  |  7.- Terminar programa           |");
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
    }
}
