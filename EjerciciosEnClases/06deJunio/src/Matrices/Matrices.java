package Matrices;

import java.util.Random;
import java.util.Scanner;

public class Matrices {
    // fILAS hORIZONTALEZ
    // Columnas Vericales
    // Posición (Fila, Columna)

    // 1. Longitud FIJA

    public static void CargarMatricesEntreas(int[][] matriz_) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Cargar Matrices");
        for (int f = 0; f < matriz_.length; f++) {
            for (int c = 0; c < matriz_[0].length; c++) {
                System.out.print("Ingresa el valor: ");
                matriz_[f][c] = teclado.nextInt();

            }
        }
    }

    public static void ImprimirMatrizEnteros(int[][] matriz_) {
        System.out.println("Cargar Matrices");
        for (int f = 0; f < matriz_.length; f++) {
            for (int c = 0; c < matriz_[0].length; c++) {
                System.out.print("En V(" + f + "," + c + "), ");
                System.out.print("Su valor es: " + matriz_[f][c]);
                System.out.print("\t");

            }
            System.out.print("\n");
        }
    }

    public static void CargarMatricesEnterasAleatorias(int[][] matriz_, int RangoInicial, int RANGOfINAL) {
        Random random = new Random();

        System.out.println("Cargar Matrices ALEATORIAS");
        for (int f = 0; f < matriz_.length; f++) {
            for (int c = 0; c < matriz_[0].length; c++) {
                matriz_[f][c] = random.nextInt(RangoInicial, RANGOfINAL + 1);

            }
        }

    }

    public static void main(String[] args) {

        int[][] matriz1 = new int[3][4];
        int[][] matriz4 = new int[2][2];

        // 2. Matrices con valores definidos
        int[][] matriz2 = new int[][] {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };

        // Matrices con valores por demanda
        int[][] matriz3;
        int filas = 3, columnas = 4;
        matriz3 = new int[filas][columnas];
        System.out.println("El numero de filas es: " + matriz2.length);
        System.out.println("El numero de columnas es: " + matriz2[0].length);
        // SI LOS DESPLAZAMIENTOS SON hORIZONTALES PRIMERO ORGANIZO COMO FILAS Y
        // COLUMNAS, Y SI ES AL REVÉS VA PRIMERO COLUMNAS.
        // Carga MANUAL

        /*
         * CargarMatricesEntreas(matriz1);
         * CargarMatricesEntreas(matriz3);
         * CargarMatricesEntreas(matriz4);
         * ImprimirMatrizEnteros(matriz4);
         */
        // ImprimirMatrizEnteros(matriz2);
        //CargarMatricesEnterasAleatorias(matriz1, 10, 30);
        //CargarMatricesEnterasAleatorias(matriz3, 1, 10);
        //ImprimirMatrizEnteros(matriz1);
        //ImprimirMatrizEnteros(matriz3);
        // Carga ALEATORIA

    }
}
