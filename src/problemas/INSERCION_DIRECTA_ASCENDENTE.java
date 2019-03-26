/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;
import java.util.Scanner;
/**
 *  INSERCION DIRECTA ASCENDENTE
 * @author Lean
 */
public class INSERCION_DIRECTA_ASCENDENTE {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int[] a = new int[20];
        int i,aux,n,k;
        System.out.print("Introducir el valor de n: ");
        n = in.nextInt();
        
        for (i = 1; i <= n; i++) {
            a[i] = in.nextInt();            
        }
        
        System.out.println("sdsdsd"); 
        
        for (i = 2; i <= n; i++) {
            aux = a[i];
            k = i - 1;
            while ((k >= 1) && (aux < a[k])) {
                a[k+1] = a[k];
                k = k-1;
                a[k+1] = aux;
            }
        }
        System.out.println("sds");
        for(i = 1;i <= n;i++){
            System.out.print(a[i]+"");
        }
        
        
    }
    
}
