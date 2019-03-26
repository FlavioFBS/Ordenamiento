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

public class QuicksortRecursivoAscendente_16 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int i,n;
        int a[]=new int[18];
        System.out.print("Ingresa valor de n: ");
        n=entrada.nextInt();
        
        for(i=1;i<=n;i++){
            System.out.print("Elemento: ");
            a[i]=entrada.nextInt();
        }
        
        arreglo(a,0,n-1);

        System.out.println("Ordenado:");
        for(i=1;i<=n;i++){
            System.out.print(" "+a[i]);
        }
    }
    
    public static int arreglo(int b[], int ini, int fin){
        int izq, der,band, aux,pos;
        izq=ini;
        der=fin;
        pos=ini;
        band=1;
        while(band==1){
            band=0;
            while(b[pos]<=b[der] && pos!=der){
                der=der-1;
            }
            if(pos!=der){
                aux=b[pos];
                b[pos]=b[der];
                b[der]=aux;
                pos=der;
                while(b[pos]>=b[izq] && pos!=izq){
                    izq=izq+1;
                }
                if(pos!=izq){
                    band=1;
                    aux=b[pos];
                    b[pos]=b[izq];
                    b[izq]=aux;
                    pos=izq;
                }
            }
        }
        if( (pos-1)>ini){
            arreglo(b, ini, pos-1);
        }
        if(fin>(pos+1)){
            arreglo(b, pos+1, fin);
        }
        return 0;
    }
}
