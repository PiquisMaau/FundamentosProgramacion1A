package EstudioSuples;

import java.util.Random;
import java.util.Scanner;

public class EstudioVector {

    public static void main(String[] args) {

        int[] enteros = new int[10];
        Random randomico = new Random();

        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = randomico.nextInt(1, 20);
        }

        Item1(enteros);
        System.out.println("\n");
        Item2(enteros);

        Scanner teclado = new Scanner(System.in);
      //  Item3V1(enteros, teclado);

        Item3V2(enteros, teclado);

        Item5(enteros);

        Item4(enteros);

    }

    private static void Item4(int[] enteros) {
        int contadorPares = 0, contadorImpares = 0;
        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i] % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
            
        }
        System.out.println("El numero de pares es: " + contadorPares);
        System.out.println("El numero de impares es: " + contadorImpares);
        
    }

    private static void Item5(int[] enteros) {
        int pares = 0, impares = 0;
        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i] % 2 == 0) {
                pares += enteros[i];
            } else if (enteros[i] % 2 != 0) {
                impares += enteros[i];
            }
        }
        System.out.println("La suma de numeros pares es: " + pares);
        System.out.println("La suma de numeros impares es: " + impares);
    }

    private static void Item3V2(int[] enteros, Scanner teclado) {
        int valor = teclado.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < enteros.length; i++) {
            if (valor == enteros[i]) {
                encontrado = true;
                break;
            }
        }
        if (encontrado == true) {
            System.out.println("El numero ingresado si existe en el vector");
        } else {
            System.out.println("El número ingresado, en el vector no existe :c");
        }
    }

    private static void Item3V1(int[] enteros, Scanner teclado) {
        System.out.println("Por favor, ingresa un numero que deseas buscar en el vector: ");
        int Valor = teclado.nextInt();
        for (int i = 0; i < enteros.length; i++) {
            if (Valor == enteros[i]) {
                System.out.println("Si hay el: " + Valor + " en el vector");
            }
            if (Valor != enteros[i]) {
                System.out.println("Tu número no coincide con ninguno del vector");

            }
        }
    }

    private static void Item2(int[] enteros) {
        int sumatoria = 0;
        for (int i = 0; i < enteros.length; i++) {
            sumatoria += enteros[i];
        }
        System.out.println("Las sumatoria del vector es: " + sumatoria);
    }

    private static void Item1(int[] enteros) {
        System.out.println("El vector es: ");
        for (int i = 0; i < enteros.length; i++) {
            System.out.print(enteros[i] + "\t");
        }
    }

}
