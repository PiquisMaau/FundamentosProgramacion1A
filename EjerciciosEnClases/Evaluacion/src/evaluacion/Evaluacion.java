package evaluacion;

import java.util.Random;
import java.util.Scanner;

public class Evaluacion {

    public static void main(String[] args) {
        Scanner pc = new Scanner(System.in);

        Random ale = new Random();
        int multiplos13 = 0;
        int noMultiplos = 0;
        int contadorMult = 0;
        int acumMultiplo = 0;
        int contador = 0;
        String respuesta;

        do {
           
            int numero = ale.nextInt(100) + 1; 
            System.out.println("Número generado: " + numero);
            
            
            if (numero % 13 == 0) {
                acumMultiplo++;
                contadorMult += numero;
            } else {
                noMultiplos++;
            }
            contador++;

          
            System.out.print("¿Desea generar otro número? (si/no): ");
            respuesta = pc.next();
            
        } while (respuesta.equalsIgnoreCase("si"));

        double promedio = (acumMultiplo > 0) ? (double) contadorMult / acumMultiplo : 0;
        double promedio2 = (noMultiplos > 0) ? (double) noMultiplos / contador * 100 : 0;

        // Mostrar resultados
        System.out.println("La cantidad de números múltiplos de 13 es: " + acumMultiplo);
        System.out.println("El promedio de números múltiplos de 13 es: " + promedio);
        System.out.println("La cantidad de números que no son múltiplos de 13 es: " + noMultiplos);
        System.out.println("Promedio de números que no son múltiplos de 13: " + promedio2);
        System.out.println("Total de números generados: " + contador);
    }
}

