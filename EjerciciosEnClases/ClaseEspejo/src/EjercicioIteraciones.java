import java.util.Scanner;

public class EjercicioIteraciones {
    public static void main(String[] args) {
        //Ejercicio propuesto por el Inge. Hernán en la clase espejo
        //Dado un rango de números enteros, obtener la cantidad de números
        int NumeroInicial, NumeroFinal, Espar= 0, i;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa un Rango Inicial: ");
        NumeroInicial = teclado.nextInt();
        System.out.print("Ingresa un rango Final: ");
        NumeroFinal = teclado.nextInt();


        i=NumeroInicial;
        while(i<=NumeroFinal){
            if(i%2==0){
                Espar += 1;
                System.out.println(i);
            }
            i++;
        }
        System.out.println("");
        System.out.println("Cantidad de números pares es: "+Espar);
            
        


    }

}
