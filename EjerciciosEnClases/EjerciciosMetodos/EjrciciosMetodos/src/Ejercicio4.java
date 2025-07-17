import java.util.Scanner;

public class Ejercicio4 {
    // Enunciado: Dado un número obtener la suma de sus dígitos pares e impares.

    public static void LeerImprimir() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("=========== Ingreso de un Número ==========");
        System.out.print("Ingresa un numero para sumar sus digitos pares e impartes: ");
        int Numero = teclado.nextInt();

        System.out.println("La sema entre los digitos pares de tu numero es: " + SumaPar(Numero));
        System.out.println("La sema entre los digitos impares de tu numero es: " + SumaImpar(Numero));

    }

    public static int SumaImpar(int numero) {
        int suma = 0;
        while (numero > 0) {
            int digito = numero % 10;
            if (digito % 2 != 0) {
                suma += digito;
            }
            numero /= 10;
        }
        return suma;

    }

    public static int SumaPar(int numero) {
        int suma = 0;
        while (numero > 0) {
            int digito = numero % 10;
            if (digito % 2 == 0) {
                suma += digito;
            }
            numero /= 10;
        }
        return suma;
    }

    public static void main(String[] args) {
        LeerImprimir();

    }

}
