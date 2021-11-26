package paquetePrincipal;

public class NodoArbol {
    int dato;
    String nombre;
    NodoArbol hijoIsquierdo, hijoDerecho;

    public NodoArbol(int d, String nom)
    {
        this.dato = d;
        this.nombre = nom;
        this.hijoDerecho = null;
        this.hijoIsquierdo = null;
    }
    public String toString()
    {
        return nombre + " su dato es: " + dato;
    }
}
