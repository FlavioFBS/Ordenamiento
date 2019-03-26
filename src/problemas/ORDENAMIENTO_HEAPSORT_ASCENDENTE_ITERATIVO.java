/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *ORDENAMIENTO HEAPSORT ASCENDENTE ITERATIVO
 * @author Lean
 */
public class ORDENAMIENTO_HEAPSORT_ASCENDENTE_ITERATIVO {


    public static void insertaMonticulo(int a[], int n) {

        int k, aux, band, i;
        for (i = 1; i <= n-1; i++) {
            k = i;
            band = 1;
            while ((k > 0) && (band == 1)) {
                band = 0;
                if (a[k] > a[k/2]) {
                    aux = a[k/2];
                    a[k/2] = a[k];
                    a[k]=aux;               
                    k = k/2;
                    band = 1;
                }
            }
        }
    }

    public static void eliminarMonticulo(int a[], int n) {

        int aux, izq, der, k, ap, bool, mayor, i;
        for (i = n-1; i >= 1; i--) {
            aux = a[i];
            a[i] = a[0];
            izq = 1;
            der = 2;
            k = 0;
            bool = 1;
            while ((izq < i) && (bool == 1)) {
                mayor = a[izq];
                ap = izq;
                if ((mayor < a[der]) && (der != i)) {
                    mayor = a[der];
                    ap = der;
                }
                if (aux < mayor) {
                    a[k] = a[ap];
                    k = ap;
                } else {
                    bool = 0;
                }
                izq=k*2;
                der=izq+1;
            }
            a[k] = aux;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i, n;
        int[] a = new int[100];
        System.out.print("Ingrese el valor de n: ");
        n = in.nextInt();

        for (i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        insertaMonticulo(a, n);
        eliminarMonticulo(a,n);
        for (i =0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
    }

}
