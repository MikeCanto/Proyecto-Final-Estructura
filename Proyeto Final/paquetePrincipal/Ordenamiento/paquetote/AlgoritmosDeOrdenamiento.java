package paquetote;

public class AlgoritmosDeOrdenamiento {
    int i, j, temporal;
    public AlgoritmosDeOrdenamiento(){
        this.i = 0;
        this.j = 0;
        this.temporal = 0;
    }

    // Ordenamiento por Burbuja
    public void burbuja(int [] arreglo){
        for (i = 0; i < arreglo.length; i++){
            for (j = i+1; j < arreglo.length; j++){
                if (arreglo[i] > arreglo[j]) {
                    temporal = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temporal;
                    System.out.println("Cambio:");
                    mostrarArreglo(arreglo);
                }

            }
        }

    }

    // Ordenamiento por QuickSort
    public void quick(int [] arreglo, int primero, int ultimo){
        int i, j, pivote, auxiliar;
        i = primero;
        j = ultimo;
        pivote = arreglo[(primero + ultimo)/2];
        do{
            while (arreglo[i] < pivote){
                i++;
            }
            while (arreglo[j] > pivote){
                j--;
            }
            // Aqui se hace el intercambio
            if (i <= j) {
                auxiliar = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = auxiliar;
                i++;
                j--;
            }
        }while (i <= j);
        if (primero < j){
            quick(arreglo, primero, j);
        }
        if (i < ultimo){
            quick(arreglo, i, ultimo);
        }
        mostrarArreglo(arreglo);
    }

    // Ordenamiento por Insercion
    public void insercion(int [] arreglo, int n){
        int i, j, auxiliar;
        for ( i = 1; i< n; i++){
            auxiliar = arreglo[i];
            j = i-1;
            while (j >= 0 && arreglo[j] > auxiliar){
                arreglo[j+1] = arreglo[j];
                j--;
            }
            arreglo[j +1] = auxiliar;
        }
        System.out.println(" Arreglo ordenado por insercion");
        mostrarArreglo(arreglo);
    }

    //Ordenamiento por Shell
    public void shell(int [] arreglo){
        int salto, i, j, k, auxiliar;
        salto = arreglo.length/2;
        while (salto > 0){
            for (i =salto; i < arreglo.length; i++){
                j = i - salto;
                while (j >= 0){
                    k = j+salto;
                    if (arreglo[j] <= arreglo[k]){
                        j = -1;
                    } else {
                        auxiliar = arreglo[j];
                        arreglo[j] = arreglo[k];
                        arreglo[k] = auxiliar;
                        j -= salto;
                    }
                }

            }
            salto = salto/2;
        }
        System.out.println("Arreglo ordenado por Shell: ");
        mostrarArreglo(arreglo);


    }

    // ____________________________________________________________________________________________
    // BUSQUEDAS
    // ____________________________________________________________________________________________

    // Metotodo de busqueda secuencial
    public int busquedaSecuencial(int arreglo[],int elemento){
        int i;
        boolean encontrado = false;
        for (i = 0; i< arreglo.length && encontrado == false; i++){
            if (elemento == arreglo[i]){
                encontrado = true;
                return i;
            }
        }
        return -1;
    }

    // Metodo de busqueda binaria
    public  int busquedaBinaria(int arreglo[], int elemento){
        int centro, primero, ultimo, valorCentro;
        primero = 0;
        ultimo = arreglo.length-1;
        while (primero <= ultimo){
            centro = (primero +  ultimo) / 2;
            valorCentro = arreglo[centro];
            System.out.println("Comparando a " + elemento +" con " + arreglo[centro]);
            if (elemento == valorCentro){
                return centro;
            } else if (elemento < valorCentro){
                ultimo = centro -1; // Nos deplazamos a la isquierda
            } else {
                primero = centro + 1; // Desplazamos haciea la derecha
            }
        }
        return -1;
    }

    // Mostrar arreglo
    public void mostrarArreglo(int [] arreglo){
        int k;
        for (k = 0; k < arreglo.length; k++){
            System.out.print("[" +  arreglo[k] + "]");
        }
        System.out.println();
    }

}
