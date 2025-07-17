import java.util.Scanner;

public class EJERCICIO2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int RangoI=0, RangoF=0, contadorPrimo = 0,  sumaPrimo = 0;
        System.out.println("Ingresa un rango inicial: ");
        RangoI = teclado.nextInt();
        System.out.println("Ingresa un rango final: ");
        RangoF = teclado.nextInt();
        for (int i = RangoI; i <= RangoF; i++) {
            boolean primo = true;
            for (int j = 2; j < i; j++){
                
            
            if(i%j ==0){
                primo = false;
            }
        }
            
        if(primo== true){
            System.out.println(i+ " Es primo");
            //Contamos la cantidad de primos
            contadorPrimo++;
            //Acumulador de primos
            sumaPrimo = sumaPrimo+i;
        }
    }
    //Calcular el promedio de los numeros primos 
    double promedio = sumaPrimo/contadorPrimo;
    System.out.println("El promedio es: "+ promedio);


        
    }
}
