/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *  INSERCION DIRECTA DESCENDENTE
 * @author Lean
 */
public class INSERCION_DIRECTA_DESCENDENTE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int[] a = new int[20];
        int i, aux, n, k;
        System.out.print("Introducir el valor de n: ");
        n = in.nextInt();
        
        for (i = 1; i <= n; i++) {
            a[i] = in.nextInt();
            
        }

        for (i = 2; i <= n; i++) {
            aux = a[i];
            k = i - 1;
            while ((k >= 1) && (aux > a[k])) {
                a[k+1] = a[k];
                k = k-1;
                a[k+1] = aux;
            }
        }

        for(i = 1;i <= n;i++){
            System.out.print(a[i]+"");
        }
    }

}
