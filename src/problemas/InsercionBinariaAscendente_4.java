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

public class InsercionBinariaAscendente_4 {
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int a[]=new int[20];
        int m,aux,n,j,izq,der;
        System.out.print("Ingresar cantidad de elementos a comparar: ");
        n=entrada.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Elemento: ");
            a[i]=entrada.nextInt();
        }
        
        for(int i=2; i<=n; i++){
            aux=a[i];
            izq=1;
            der=i-1;
            while(izq<=der){
                m=(izq+der)/2;
                if(aux<=a[m]){
                    der=m-1;
                }
                else{
                    izq=m+1;
                }
            }
            j=i-1;
            while(j>=izq){
                a[j+1]=a[j];
                j=j-1;
            }
            a[izq]=aux;
        }
        System.out.println("Ordenado: ");
            for(int q=1;q<=n;q++){
                System.out.print(" "+a[q]);
            }
    }
    
}
