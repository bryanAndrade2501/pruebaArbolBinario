package com.prueba;

import java.util.Scanner;

public class ArbolBinario {
    private Nodo raiz; //Nodo raiz

    //Constructores
    public ArbolBinario() {
        this.raiz = null;
    }
    public ArbolBinario(Nodo raiz) {
        this.raiz = raiz;
    }

    //Getter
    public Nodo getRaiz() {
        return raiz;
    }

    //Método Ingresar
    public void ingresar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (this.raiz == null) {
            this.raiz = nuevo;
        } else {
            Nodo recorre = this.raiz;
            Nodo aux;
            while (true) {
                aux = recorre;
                if (dato < recorre.getDato()) {
                    recorre = recorre.getIzquierda();
                    if (recorre == null) {
                        aux.setIzquierda(nuevo);
                        return;
                    }
                } else {
                    recorre = recorre.getDerecha();
                    if (recorre == null) {
                        aux.setDerecha(nuevo);
                        return;
                    }
                }
            }
        }
    }

    public void invertirArbol(Nodo raiz){
        //comprueba que la raiz no tenga el valor de null
        if(raiz == null){
            return;
        }
        //el nodo derecho se añade a un auxiliar aux
        Nodo aux = raiz.getDerecha();
        //el nodo izquierdo se añade a un auxiliar aux1
        Nodo aux1 = raiz.getIzquierda();
        //se intercambia el nodo derecha por el izquierda
        raiz.setDerecha(aux1);
        //se intercambia el nodo izquierdo por el derecho
        raiz.setIzquierda(aux);

        //se realizo lo mismo para los nodos hijos
        invertirArbol(raiz.getIzquierda());
        invertirArbol(raiz.getDerecha());
    }
    //Métodos de recorrido
    public void preOrden(Nodo raiz) {
        //Raiz -- Izquierda -- Derecha
        if (raiz != null) {
            System.out.printf("%2d  \t", raiz.getDato());
            preOrden(raiz.getIzquierda());
            preOrden(raiz.getDerecha());
        }
    }
    public void inOrden(Nodo raiz) {
        //Izquierda -- Raiz -- Derecha
        if (raiz != null) {
            inOrden(raiz.getIzquierda());
            System.out.printf("%2d  \t", raiz.getDato());
            inOrden(raiz.getDerecha());
        }
    }
    public void postOrden(Nodo raiz) {
        //Izquierda -- Derecha -- Raiz
        if (raiz != null) {
            postOrden(raiz.getIzquierda());
            postOrden(raiz.getDerecha());
            System.out.printf("%2d  \t", raiz.getDato());
        }
    }

    //Ingreso de datos
    public void ingresoDatos(int totalNodos, ArbolBinario arbolBinario) {
        Scanner entrada = new Scanner(System.in);
        int i = 0;

        while (i < totalNodos) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            arbolBinario.ingresar((int) entrada.nextInt());
            i++;
        }
    }

    //Mostrar nodos ingresados
    public void mostrarNodosIngresados(Nodo nodo) {
        if (nodo == null) {
            return;
        }
        mostrarNodosIngresados(nodo.getIzquierda());
        System.out.printf("%s ", nodo.getDato());
        mostrarNodosIngresados(nodo.getDerecha());
    }
}
