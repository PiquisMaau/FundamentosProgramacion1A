
package evaluacion_cves;

import java.util.Random;
import java.util.Scanner;

public class EVALUACION_CVES {

    /**
   Debe generar un numero aleatorio del 1 al 100 y verificar si es múltiplo de 21, dependiendo de eso encuentrantra cuantos números son y no son múltiplos y al final dar promedio de sumatoria de ambos
     */
    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        int aleatorio, multiplo=0, no_multiplo=0;
        int contador=0;
        String op;
        int total_numeros;
        int suma = 0;
        double promedio_multiplo;
        int promedio_no_mult;
        Random random = new Random ();
        
        
        
        do {
            aleatorio = random.nextInt(1,101);
        System.out.println(aleatorio);
       
            if (aleatorio%21==0) {
                System.out.println(" Es multiplo de 21 ");
                multiplo+=aleatorio;
                contador++;
                
            } else {
                System.out.println(" El numero no es multiplo de 21");
                suma+=aleatorio;
                no_multiplo++;
            }
         System.out.println("¿ desea generar otro numero aleatorio ?");
        op = Sc.nextLine();
        
        
        } while (op.equalsIgnoreCase("si"));
      
        total_numeros=contador+no_multiplo;
        promedio_multiplo = contador/total_numeros;
         promedio_no_mult = suma / total_numeros;
        
        System.out.println(" Cantidad de numeros multiplos de 21: "+contador);
        System.out.println(" Promedio de la sumatoria multiplos de 21: "+promedio_multiplo);
        System.out.println(" Cantidad de numeros qe no son multiplos de 21: "+no_multiplo);
        System.out.println(" Promdio de la sumatoria de numeros que no son multiplo de 21: "+promedio_no_mult);
        System.out.println(" Total de numeros generados: "+total_numeros);
        
        
    }
    
}
