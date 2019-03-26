/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *Reduce rapido iterativo descendente
 * @author Acer
 */
public class REDUCE_RAPIDO_ITERATIVO_DESCENDENTE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, i;
        int[] a = new int[20];
        System.out.print("Ingrese n: ");
        n = in.nextInt();
        for (i = 0; i <= n-1; i++) {
            a[i] = in.nextInt();
        }
        
        rapidoIterativo(a, n-1);

        for ( i = 0;i<=n-1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
    }

    public static void rapidoIterativo(int a[], int n) {
        int top, ini, fin, pos = 0;
        int[] pilaMenor = new int[20];
        int[] pilaMayor = new int[20];
        top = 1;
        pilaMenor[top] = 0;
        pilaMayor[top] = n;

        while (top > 0) {
            ini = pilaMenor[top];
            fin = pilaMayor[top];
            top = top - 1;
            pos = reduceIterativo(ini, fin, pos, a);

            if (ini < (pos - 1)) {
                top = top + 1;
                pilaMenor[top] = ini;
                pilaMayor[top] = pos - 1;
            }
            if (fin > (pos + 1)) {
                top = top + 1;
                pilaMenor[top] = pos + 1;
                pilaMayor[top] = fin;
            }
        }
    }

    public static int reduceIterativo(int ini, int fin, int pos, int a[]) {
        int izq, der, aux, band;
        izq = ini;
        der = fin;
        pos = ini;
        band = 1;
        while (band == 1) {
            while (a[pos] >= a[der] && (pos != der)) {
                der = der - 1;
            }
            if (pos == der) {
                band = 0;
            } else {
                aux = a[pos];
                a[pos] = a[der];
                a[der] = aux;
                pos = der;
                while ((a[pos] <= a[izq]) && pos != izq) {
                    izq = izq + 1;
                }
                    if (pos == izq) {
                        band = 0;
                    } else {
                        aux = a[pos];
                        a[pos] = a[izq];
                        a[izq] = aux;
                        pos = izq;

                    }
                }
            }
        
        return pos;

    }

}
