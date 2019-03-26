/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;
import java.util.Scanner;

/**
 *  BURBURJA ASCENDENTE
 * @author Lean
 */
public class BURBUJA_ASCENDENTE {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int i,j,aux,n;
        int[] a= new int[20];
        System.out.print("Ingresar el valor de n: ");
        n = in.nextInt();
        for(i = 1;i<=n;i++){
            a[i] = in.nextInt();
        }
        
        for(i = 2;i <= n;i++){
            for(j = n;j>=i;j--){
                if(a[j-1]>=a[j]){
                    aux = a[j-1];
                    a[j-1] = a[j];
                    a[j] = aux;
                }
            }
        }
        System.out.println("FINAL------");
        for(i=1;i<=n;i++){
            System.out.println(a[i]);
        }
        
    }
}
