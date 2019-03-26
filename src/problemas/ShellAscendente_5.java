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
public class ShellAscendente_5 {
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int i,n,num,aux,band;
        int a[]=new int[20];
        System.out.print("Ingreser numero de elementos: ");
        n=entrada.nextInt();
        num=n+1;
        for(i=1;i<=n;i++){
            System.out.print("Elemento: ");
            a[i]=entrada.nextInt();
        }
        
        while(num>1){
            num=num/2;
            band=1;
            while(band==1){
                band=0;
                i=1;
                while((i+num)<=n ){
                    if(a[i]>a[i+num]){
                        aux=a[i];
                        a[i]=a[i+num];
                        a[i+num]=aux;
                        band=1;
                    }
                    i=i+1;
                }
            }
        }
        
        //mostrar:
        System.out.println("Ordenado");
        for(i=1;i<=n;i++){
            System.out.print("  "+a[i]);
        }
        
    }
}
