//SeleccionDirectaAscendente
package problemas;

import java.util.Scanner;

public class SeleccionDirectaAscendente {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tamArreglo, mayorElemento, posicionMayorElemento;

        System.out.print("Ingresa la cantidad de elementos: ");
        tamArreglo = entrada.nextInt();
        int Arreglo[] = new int[tamArreglo]; 
        System.out.println("Ingresar los elementos:");
        for(int i=0;i<tamArreglo;i++){
            System.out.print("Elemento ["+(i+1)+"]: ");
            Arreglo[i]=entrada.nextInt();
        }
        System.out.println("");
        for(int i=0;i<tamArreglo;i++){
            mayorElemento=Arreglo[i]; posicionMayorElemento=i;
            for(int j=i+1;j<tamArreglo;j++){
                if(Arreglo[j]<mayorElemento){
                    mayorElemento=Arreglo[j]; 
                    posicionMayorElemento=j;
                }
            }
            Arreglo[posicionMayorElemento]=Arreglo[i];
            Arreglo[i]=mayorElemento;
        }
        for(int i=0;i<tamArreglo;i++){
            System.out.println(Arreglo[i]);
        }
    }
    
}
