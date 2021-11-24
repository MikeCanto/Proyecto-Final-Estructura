package paquetote;

// Aqui implementamos los metodos

public class ArbolBinario
{
    NodoArbol raiz;
    public ArbolBinario()
    {
        raiz = null;
    }

    // Metodo para INSERTAR UN NODO EN EL ARBOL
    public  void agregarNodo(int d, String nom) {
        NodoArbol nuevo = new NodoArbol(d, nom);
        // CASO 1: NO HAY NODOS EN EL ARBOL TODAVIA
        if (raiz == null) {
            raiz = nuevo;
        }
        else {
            NodoArbol auxiliar = raiz;
            NodoArbol padre;
            while (true) {
                padre = auxiliar;

                // SI ES MENOR QUE AUXLIAR, ENTONCES VA A LA ISQUIERDA
                if (d < auxiliar.dato) {
                    auxiliar = auxiliar.hijoIsquierdo;
                    if (auxiliar == null) { // SI LLEGA A NULL SIGNIFICA QUE LLEGO AL FINAL DEL CAMINO{
                        padre.hijoIsquierdo = nuevo;
                        return;
                    }
                }else{
                    auxiliar = auxiliar.hijoDerecho;
                    if (auxiliar==null) {
                        padre.hijoDerecho = nuevo;
                        return;
                    }
                }
            }
        }
    }

    // Metodo para SABER SI EL EARBOL ESTA VACIO
    public boolean estaVacio()
    {
        return raiz == null;
    }

    // Metodo para RECORRER EL ARBOL IN_ORDER
    public void inOrden(NodoArbol r){
        if (r != null){
            inOrden(r.hijoIsquierdo);
            System.out.print(r.dato + ", ");
            inOrden(r.hijoDerecho);
        }
    }

    // Metodo para RECORRER EL ARBOL PreOrden
    public void preOrden(NodoArbol r){
        if (r != null){
            System.out.print(r.dato + ", ");
            preOrden(r.hijoIsquierdo);
            preOrden(r.hijoDerecho);
        }
    }

    // Metodo para RECORDER EL ARBOL PostOrden
    public void postOrden(NodoArbol r){
        if (r != null){
            postOrden(r.hijoIsquierdo);
            postOrden(r.hijoDerecho);
            System.out.print(r.dato + ", ");
        }
    }

    // Metodo para BUSCAR UN NODO EN EL ARBOL
    public NodoArbol buscarNodo(int d){
        NodoArbol aux = raiz;
        while (aux.dato != d){
            if (d < aux.dato){
                aux = aux.hijoIsquierdo;
            }else {
                aux = aux.hijoDerecho;
            }
            if (aux == null){
                return null;
            }
        }
        return aux;
    }

    // Metodo para ELIMINAR UN NODO del arbol
    public boolean eliminar(int d){
        NodoArbol auxiliar = raiz;
        NodoArbol padre = raiz;
        boolean esHijoIzq = true;
        while (auxiliar.dato != d){
            padre = auxiliar;
            if (d < auxiliar.dato){ // busca por la izquerda
                esHijoIzq = true;
                auxiliar = auxiliar.hijoIsquierdo;
            }else{ // busca por la derecha
                esHijoIzq = false;
                auxiliar = auxiliar.hijoDerecho;
            }
            if (auxiliar == null){ // llego hasta el final
                return false;
            }
        } // Fin del while
        if (auxiliar.hijoIsquierdo == null && auxiliar.hijoDerecho == null){ // si es true: es hoja
            if (auxiliar == raiz){ // si es la raiz
                raiz = null;
            }else if (esHijoIzq){ // si es hijo isquierdo
                padre.hijoIsquierdo = null;
            }else { // si es hijo derecho
                padre.hijoDerecho = null;
            }
        } else if (auxiliar.hijoDerecho == null){
            if (auxiliar == raiz){ // si es la raiz
                raiz = auxiliar.hijoIsquierdo;
            }else if (esHijoIzq){ // si es hijo isquierdo
                padre.hijoIsquierdo = auxiliar.hijoIsquierdo;
            }else { // si es hijo derecho
                padre.hijoDerecho = auxiliar.hijoIsquierdo;
            }
        } else if (auxiliar.hijoIsquierdo == null){
            if (auxiliar == raiz){ // si es la raiz
                raiz = auxiliar.hijoDerecho;
            }else if (esHijoIzq){ // si es hijo isquierdo
                padre.hijoIsquierdo = auxiliar.hijoDerecho;
            }else { // si es hijo derecho
                padre.hijoDerecho = auxiliar.hijoDerecho;
            }
        } else {
            NodoArbol reemplazo = obtenerNodoReemplazo(auxiliar);
            if (auxiliar == raiz){
                raiz = reemplazo;
            }else if (esHijoIzq){
                padre.hijoIsquierdo = reemplazo;
            } else {
                padre.hijoDerecho = reemplazo;
            }
            reemplazo.hijoIsquierdo = auxiliar.hijoIsquierdo;
        }
        return true; // encotro al nodo a elemininar
    }

    // metodo encargado DEVOLVERNOS EL NODO REMPLAZO (REMPLAZA EL NODO)
    public NodoArbol obtenerNodoReemplazo(NodoArbol nodoReemp){
        NodoArbol reemplazarPadre = nodoReemp;
        NodoArbol reemplazo = nodoReemp;
        NodoArbol auxiliar = nodoReemp.hijoDerecho;
        while (auxiliar != null){
            reemplazarPadre = reemplazo;
            reemplazo = auxiliar;
            auxiliar = auxiliar.hijoIsquierdo;
        }
        if (reemplazo != nodoReemp.hijoDerecho){
            reemplazarPadre.hijoIsquierdo = reemplazo.hijoDerecho;
            reemplazo.hijoDerecho = nodoReemp.hijoDerecho;
        }
        System.out.println("El nodo reemplazo es " + reemplazo);
        return reemplazo;
    }





}



