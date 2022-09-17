package com.prueba;

public class Nodo {
    //Variales
    private int dato;
    private Nodo derecha;
    private Nodo izquierda;

    //Constructores
    public Nodo(int dato) {
        this.dato = dato;
        this.derecha = null;
        this.izquierda = null;
    }
    public Nodo(int dato, Nodo derecha, Nodo izquierda) {
        this.dato = dato;
        this.derecha = derecha;
        this.izquierda = izquierda;
    }

    //Getters & Setters
    public void setDato(int dato) {
        this.dato = dato;
    }
    public int getDato() {
        return dato;
    }
    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
    public Nodo getDerecha() {
        return derecha;
    }
    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }
    public Nodo getIzquierda() {
        return izquierda;
    }
}
