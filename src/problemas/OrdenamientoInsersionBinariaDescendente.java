package problemas;

import java.util.Scanner;

public class OrdenamientoInsersionBinariaDescendente {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int puntoMedio,valor,tamArreglo,posicion,izq,der;
        System.out.print("Ingresar tamaño del arreglo: ");
        tamArreglo = entrada.nextInt();
        int Arreglo[] = new int[tamArreglo];
        System.out.println("Ingresar los elementos:");
        for(int i=0; i<tamArreglo;i++){
            System.out.print("Elemento ["+(i+1)+"]: ");
            Arreglo[i]=entrada.nextInt();
        }
        for(int i=1; i<tamArreglo;i++){
            valor=Arreglo[i];
            izq=0;
            der=tamArreglo-1;
            while(izq<=der){
                puntoMedio=(izq+der)/2;
                if(valor>=Arreglo[puntoMedio])
                    der = puntoMedio-1;
                else
                    izq=puntoMedio+1;
            }
            posicion=i-1;
            while(posicion>=izq){
                Arreglo[posicion+1]=Arreglo[posicion];
                posicion=posicion-1;
            }
            Arreglo[izq]=valor;
        }
        for(int i=0;i<tamArreglo;i++){
            System.out.println(Arreglo[i]);
        }
    }
}
