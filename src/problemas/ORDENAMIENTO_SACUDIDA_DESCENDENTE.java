
package problemas;
import java.util.Scanner;
/**
 *Ordenamiento sacudida descendente
 * @author Acer
 */
public class ORDENAMIENTO_SACUDIDA_DESCENDENTE {
    public static void main(String[] args){ 
    Scanner in = new Scanner(System.in);
    int i,izq,der,k,aux;
    int n,e;
    int[] A= new int[18];
    izq=2;
    System.out.print("Ingresar el numero de elementos   ");
    n=in.nextInt();
    der=n;
    k=n;
    
    for(e=1;e<=n;e++)
        A[e]=in.nextInt();
    
    while(der>izq){
        for(i=der;i>=izq;i--){
            if(A[i-1]<A[i]){
                aux=A[i-1];
                A[i-1]=A[i];
                A[i]=aux;
                k=i;
            }
        }
    izq=k+1;
        for(i=izq;i<=der;i++){
            if(A[i-1]<A[i]){
                aux=A[i-1];
                A[i-1]=A[i];
                A[i]=aux;
                k=i;
            }
        }
           der=k-1;
    }
    System.out.println();
    for(e=1;e<=n;e++)
        System.out.print(A[e]+"\n");
    
            
    }
}
