/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;

/**
 *
 * @author flavio
 */
import java.util.Scanner;

public class QuicksortNoRecursivoDescendente_18 {

    static final int NE = 100;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int lista[] = {10, 3, 7, 5, 12, 1, 27, 3, 8, 13};
        int n_elementos = lista.length;
        int i;
        System.out.println("Sin ordenar:");
        for (i = 0; i < n_elementos; i++) {
            System.out.print(" " + lista[i]);
        }
        System.out.println("");
        quicksort(lista, n_elementos);

        System.out.println("\nLista ordenada:");
        for (i = 0; i < n_elementos; i++) {
            System.out.print(" " + lista[i]);
        }
        System.out.println("");
    }

    public static void qs(int lista[], int inf, int sup) {

        elemento_pila pila[] = new elemento_pila[NE];

        for (int t = 0; t < 100; t++) {
            pila[t] = new elemento_pila();
        }
        int izq, der, mitad, x, p;
        //inicializar la pila con los valores: inf, sup
        p = 1;
        pila[p].inf = inf;
        pila[p].sup = sup;

        do {
            //tomar los datos inf, sup de la parte superior de la pila
            inf = pila[p].inf;
            sup = pila[p].sup;
            p--;
            do {
                //división de la matriz en dos partes
                izq = inf;
                der = sup;
                mitad = lista[(izq + der) / 2];
                do {
                    while (lista[izq] > mitad && izq < sup) {
                        izq++;
                    }
                    while (mitad > lista[der] && der > inf) {
                        der--;
                    }
                    if (izq <= der) {
                        x = lista[izq];
                        lista[izq] = lista[der];
                        lista[der] = x;
                        izq++;
                        der--;
                    }
                } while (izq <= der);

                if (izq < sup) {
                    //meter en la pila los valores: izq, sup
                    p++;
                    pila[p].inf = izq;
                    pila[p].sup = sup;
                }
                sup = der;

            } while (inf < der);

        } while (p != 0);

    }

    //funcion quicksor:
    public static void quicksort(int lista[], int n_elementos) {
        qs(lista, 0, n_elementos - 1);
    }

    private static class elemento_pila {

        public elemento_pila() {
        }

        int inf = 0, sup = 0;

        public int getInf() {
            return inf;
        }

        public void setInf(int inf) {
            this.inf = inf;
        }

        public int getSup() {
            return sup;
        }

        public void setSup(int sup) {
            this.sup = sup;
        }

    }
}
