package com.prueba;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("             Aplicación arboles        ");
        Scanner entrada = new Scanner(System.in);
        //Variables
        ArbolBinario arbolBinario = new ArbolBinario();
        int totalNodos;

        //Ingreso número total de nodos
        System.out.print("Ingrese el número total de nodos: ");
        totalNodos = entrada.nextInt();
        arbolBinario.ingresoDatos(totalNodos,arbolBinario);

        //Impresión nodos ingresados
        System.out.println("Elementos ingresados y ordenados:");
        arbolBinario.mostrarNodosIngresados(arbolBinario.getRaiz());
        System.out.println();

        //Impresión métodos de recorrido
        System.out.println("            Métodos de recorrido          ");
        System.out.println("Preorden: ");
        arbolBinario.preOrden(arbolBinario.getRaiz());
        System.out.println();

        System.out.println("Inorden:");
        arbolBinario.inOrden(arbolBinario.getRaiz());
        System.out.println();

        System.out.println("Postorden:");
        arbolBinario.postOrden(arbolBinario.getRaiz());
        System.out.println();


        System.out.println("        Invertir arbol      ");
        arbolBinario.invertirArbol(arbolBinario.getRaiz());
        System.out.println("            Métodos de recorrido          ");
        System.out.println("Preorden: ");
        arbolBinario.preOrden(arbolBinario.getRaiz());
        System.out.println();

        System.out.println("Inorden:");
        arbolBinario.inOrden(arbolBinario.getRaiz());
        System.out.println();

        System.out.println("Postorden:");
        arbolBinario.postOrden(arbolBinario.getRaiz());
        System.out.println();
    }
}
