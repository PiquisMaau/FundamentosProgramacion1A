
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el número de la tabla de multiplicar");
        int number = teclado.nextInt();
        System.out.println();
        
        for (int i = 0; i <= 12; i++) {
            System.out.println(number + "x"+i+"=");
            
        }
    }

}
