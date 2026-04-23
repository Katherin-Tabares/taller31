//Katherin Samantha Tabares Castillo 
package com.mycompany.arbolbinario;

public class ArbolBinario {

    public static void main(String[] args) {
        ClaseArbolBinario arbol = new ClaseArbolBinario();

        arbol.raiz = arbol.insertar(arbol.raiz, 50);
        arbol.insertar(arbol.raiz, 30);
        arbol.insertar(arbol.raiz, 70);
        arbol.insertar(arbol.raiz, 20);
        arbol.insertar(arbol.raiz, 40);
        arbol.insertar(arbol.raiz, 60);
        arbol.insertar(arbol.raiz, 80);

        System.out.print("Inorden: ");
        arbol.inorden(arbol.raiz);

        System.out.print("\nPreorden: ");
        arbol.preorden(arbol.raiz);

        System.out.print("\nPostorden: ");
        arbol.postorden(arbol.raiz);
    }
}
