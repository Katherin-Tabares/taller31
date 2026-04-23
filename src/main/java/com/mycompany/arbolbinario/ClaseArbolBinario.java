
package com.mycompany.arbolbinario;

public class ClaseArbolBinario {
    Nodo raiz;

    public ClaseArbolBinario() {
        raiz = null;
    }

    // Método para insertar un nodo
    public Nodo insertar(Nodo raiz, int dato) {
        if (raiz == null) {
            return new Nodo(dato);
        }

        if (dato < raiz.dato) {
            raiz.izquierdo = insertar(raiz.izquierdo, dato);
        } else {
            raiz.derecho = insertar(raiz.derecho, dato);
        }

        return raiz;
    }

    // Recorrido Inorden (Izq - Raíz - Der)
    public void inorden(Nodo raiz) {
        if (raiz != null) {
            inorden(raiz.izquierdo);
            System.out.print(raiz.dato + " ");
            inorden(raiz.derecho);
        }
    }

    // Recorrido Preorden (Raíz - Izq - Der)
    public void preorden(Nodo raiz) {
        if (raiz != null) {
            System.out.print(raiz.dato + " ");
            preorden(raiz.izquierdo);
            preorden(raiz.derecho);
        }
    }

    // Recorrido Postorden (Izq - Der - Raíz)
    public void postorden(Nodo raiz) {
        if (raiz != null) {
            postorden(raiz.izquierdo);
            postorden(raiz.derecho);
            System.out.print(raiz.dato + " ");
        }
    }
}
