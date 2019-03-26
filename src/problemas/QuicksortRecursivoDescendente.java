
package problemas;

import java.util.Scanner;

public class QuicksortRecursivoDescendente {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;

        System.out.print("Ingresa la cantidad de elementos: ");
        n = entrada.nextInt();
        int Arreglo[] = new int[n]; 
        System.out.println("Ingresar los elementos:");
        for(int i=0;i<n;i++){
            System.out.print("Elemento ["+(i+1)+"]: ");
            Arreglo[i]=entrada.nextInt();
        }
        OrdenamientoDescendente(Arreglo,0,n-1);
        for(int i=0;i<n;i++){
            System.out.println(Arreglo[i]);
        }
    }

    private static void OrdenamientoDescendente(int[] b,int ini, int fin) {
        int izq,der,band,aux,pos;
        izq = ini;
        der = fin;
        pos = ini;
        band = 1;
        while(band ==1){
            band =0;
            while(b[pos]>=b[der] && pos!=der)
                der = der-1;
            if( pos!= der){
                aux=b[pos];
                b[pos]=b[der];
                b[der]=aux;
                pos=der;
                while(b[pos]<=b[izq] && pos!=izq)
                    izq = izq+1;
                if(pos!=izq){
                    band=1;
                    aux=b[pos];
                    b[pos]=b[izq];
                    b[izq]=aux;
                    pos=izq;
                }
            }
        }
        if((pos-1)>ini)
            OrdenamientoDescendente(b,ini,pos-1);
        if(fin>(pos+1))
            OrdenamientoDescendente(b,pos+1,fin);
    }
    
}
