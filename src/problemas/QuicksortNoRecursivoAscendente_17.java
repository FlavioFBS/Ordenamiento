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

public class QuicksortNoRecursivoAscendente_17 {

    static int NE = 100;
    //  static elemento_pila pila[]=new elemento_pila[NE];

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int lista[] = {10, 3, 7, 5, 12, 1, 27, 3, 8, 13};
        int n_elementos = lista.length;
        int i;
        quicksort(lista, n_elementos);

        System.out.println("Lista ordenada:");
        for (i = 0; i < n_elementos; i++) {
            System.out.print("  " + lista[i]);
        }
        System.out.println("");
    }

    public static void qs(int lista[], int inf, int sup) {

        elemento_pila pila[] = new elemento_pila[100];
        for (int t = 0; t < 100; t++) {
            pila[t] = new elemento_pila();
        }

        int izq, der;
        int mitad, x, p;
        p = 1;
        pila[p].inf = inf;
        pila[p].sup = sup;

        do {
            //tomar los datos inf, sup de la parte superior de la pila
            inf = pila[p].inf;
            sup = pila[p].sup;
            p--;
            do {
                //division de la matriz en dos partes
                izq = inf;
                der = sup;
                mitad = lista[(izq + der) / 2];
                do {
                    while (lista[izq] < mitad && izq < sup) {
                        izq++;
                    }
                    while (mitad < lista[der] && der > inf) {
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
                //inf=inf;
                sup = der;
            } while (inf < der);
        } while (p != 0);

    }

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
