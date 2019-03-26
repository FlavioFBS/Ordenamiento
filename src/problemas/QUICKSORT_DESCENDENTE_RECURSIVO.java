
package problemas;
import java.util.Scanner;
/**
 *QUICKSORT DESCENDENTE RECURSIVO
 * @author Acer
 */
public class QUICKSORT_DESCENDENTE_RECURSIVO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, i;
        int[] A = new int[100];
        System.out.print("Ingrese n: ");
        n = in.nextInt();
        for (i = 0; i <= n-1; i++) {
            A[i] = in.nextInt();
        }
        
        Reducerecursivo(A, 0,n-1);

        for ( i = 0;i<=n-1; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println(" ");
    }
    public static void Reducerecursivo(int A[],int ini,int fin){
        int izq=ini,der=fin,pos=ini,aux,band=1;
        while(band==1){
            band=0;
            while((A[pos]>=A[der])&&(pos!=der)){
                    der=der-1;
            }
            if(pos!=der){
            aux=A[pos];
            A[pos]=A[der];
            A[der]=aux;
            pos=der;
        
            while((A[pos]<=A[izq])&&(pos!=izq)){
                izq=izq+1;
            }
            
            if(pos!=izq){
            band=1;
            aux=A[pos];
            A[pos]=A[izq];
            A[izq]=aux;
            pos=izq;
            }
            }
            }
            if((pos-1)>ini){
            Reducerecursivo(A,ini,pos-1);
            }
            if(fin>(pos+1)) {
       
            Reducerecursivo(A,pos+1,fin);
            }
    }
}
