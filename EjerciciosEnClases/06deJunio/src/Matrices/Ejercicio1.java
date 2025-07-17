package Matrices;

import java.util.Random;

public class Ejercicio1 {
    public static void LeerImprimir() {
        int[][] dado1 = new int[20][2];
        int[][] dado2 = new int[20][2];
        System.out.println();

    }

    public static void CargarValoresDados(int[][] matriz_, int RangoInicial, int RANGOfINAL) {
        Random random = new Random();

        System.out.println("Cargar Matrices ALEATORIAS");
        for (int f = 0; f < matriz_.length; f++) {
            for (int c = 0; c < matriz_[0].length; c++) {
                matriz_[f][c] = random.nextInt(RangoInicial, RANGOfINAL + 1);

            }
        }
    }

    public static int DevolverVictorias(int[][] matriz_) {
        int contador = 0;
        for (int f = 0; f < matriz_.length; f++) {
            if (matriz_[f][0] == matriz_[f][1]) {
                contador++;
            }
        }
        return contador;

    }

    public static void main(String[] args) {

    }

}
