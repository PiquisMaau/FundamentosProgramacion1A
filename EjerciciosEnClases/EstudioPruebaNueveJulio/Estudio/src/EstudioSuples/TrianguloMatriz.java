package EstudioSuples;

import java.util.Random;

public class TrianguloMatriz {

    public static void main(String[] args) {

        int[][] matriz = new int[5][3];
        Random papitas = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = papitas.nextInt(1, 20);
            }
        }

        ImprimirMatriz(matriz);

        evaluarTriangulo(matriz);

        Perimetro(matriz);

        semiPerimetro(matriz);

    }

    private static void semiPerimetro(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            int Semiperimetro = 0;
            for ( int j = 0; j < matriz[0].length; j++) {
                Semiperimetro += matriz[i][j]; 
            }
            System.out.println("El semipeímetro del triangulo "+(i+1)+ " es: "+ (Semiperimetro/2));
        }
    }

    private static void Perimetro(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            int perimetro = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                perimetro += matriz[i][j];

            }
            System.out.println("El perímetro del triangulo "+(i+1)+ " es: "+ perimetro);
        }
    }

    private static void evaluarTriangulo(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            int a = matriz[i][0];
            int b = matriz[i][1];
            int c = matriz[i][2];

            if (a == b && b == c) {
                System.out.println("Triángulo " + (i + 1) + ": Equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triángulo " + (i + 1) + ": Isósceles");
            } else {
                System.out.println("Triángulo " + (i + 1) + ": Escaleno");
            }
        }
    }

    private static void ImprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
