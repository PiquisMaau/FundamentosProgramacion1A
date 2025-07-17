
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, denominador=2, numerador=1, acumulador= 0;
        System.out.println("Ingresa un numero entero");
        numero = teclado.nextInt();
        for (int i = numerador; i < numero; i++) {

            System.out.println(i+"/"+denominador++);
            acumulador = (i/denominador);
            
        }
        System.out.println(acumulador);

    

    //--------------------------------------------Hecho por el Inge

    int numero2 = 0;
    Double acumulador2 = 0d, valor = 0d;
    System.out.println("Ingresa el numero");
    numero = teclado.nextInt();
    for (int i = 1; i < numero; i++) {
        System.out.println(i+"/"+(i+1));
       acumulador2 = acumulador2+(double)i/(i+1);

    }
    System.out.println(acumulador2);
    }


}
