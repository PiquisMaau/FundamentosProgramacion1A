package EstudioSuples;

import java.util.Random;

public class MatrizEstudio {

    public static void main(String[] args) {

        Random elpepe = new Random();

        int[] vector = new int[5];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = elpepe.nextInt(1, 10);
        }

        int[][] matriz = new int[6][5];
        for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[0].length; j++) {
            matriz[i][j] = elpepe.nextInt(1, 20);
        }
    }


        ImprimirMatriz(matriz);

        MultiplicadorVectorFila(vector, matriz);

        SumatoriaFilas(matriz);
        SumatoriaColumnas(matriz);

        // Sumar vector por cada fila de matriz y mostrar
        SumaVectorMatrizFila(vector, matriz);

        //Promedio de COLUMNAS
        PromedioColumnas(matriz);

        //PromedioFilas
        PromedioFilas(matriz);

        //Hallar el mayor valor
        MayorValor(matriz);

        //Sumar los pares de la FILA
        SumaParesFilas(matriz);

    }

    private static void SumaParesFilas(int[][] matriz) {
        System.out.println("Las suma de Numeros pares FILAS");
        int[] SumaPares = new int[matriz.length];
        for (int j = 0; j < matriz[0].length; j++) {
            
        for (int i = 0; i < matriz.length; i++) {
            if(matriz[i][j] % 2 == 0){
                SumaPares[i] += matriz[i][j];
            }   
            }
        }
        for (int i = 0; i < SumaPares.length; i++) {
            System.out.println("La suma de la fila: "+(i+1)+" es: "+SumaPares[i] + "\t");
        }
    }

    private static void MayorValor(int[][] matriz) {
        System.out.println();
        int MayorValor = 0;
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz[0].length; j++) {
                if (MayorValor < matriz[i][j]) {
                    MayorValor = matriz[i][j];
                }
            }
            
        }
        System.out.println("Ela Mayor Valor es: " + MayorValor);
    }

    private static void PromedioFilas(int[][] matriz) {
        System.out.println();
        System.out.println("Promedio de FILAS");
        double[] promedioFilas = new double[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            int sumatrriaFilas = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                sumatrriaFilas += matriz[i][j];
            }
            promedioFilas[i] = sumatrriaFilas / matriz[0].length;
        }
        for (int i = 0; i < promedioFilas.length; i++) {
            System.out.print(promedioFilas[i] + "\t");
        }
    }

    private static void PromedioColumnas(int[][] matriz) {
        System.out.println("El PROMEDIO de columnas es: ");
        double[] promedioColumnas = new double[matriz[0].length];
        for (int j = 0; j < matriz[0].length; j++) {

            int Sumatoria = 0;
            for (int i = 0; i < matriz.length; i++) {
                Sumatoria += matriz[i][j];

            }
            promedioColumnas[j] = Sumatoria / matriz.length;

        }
        for (int i = 0; i < promedioColumnas.length; i++) {
            System.out.print(promedioColumnas[i] + "\t");
        }
    }

    private static void SumaVectorMatrizFila(int[] vector, int[][] matriz) {
        System.out.println("\n");
        System.out.println("La MATRIZ sumada es: ");
        int[][] SumaVctorMatriz = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                SumaVctorMatriz[i][j] = matriz[i][j] + vector[j];
                System.out.print(SumaVctorMatriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void ImprimirMatriz(int[][] matriz) {
        System.out.println("La MATRIZ nos queda así: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void SumatoriaColumnas(int[][] matriz) {
        System.out.println("\n");
        int[] SumatoriaFilas = new int[matriz[0].length];
        System.out.println("Sumatoria de cada COLUMNA: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                SumatoriaFilas[j] += matriz[i][j];
            }
        }
        for (int i = 0; i < SumatoriaFilas.length; i++) {
            System.out.print(SumatoriaFilas[i] + "\t");
        }
    }

    private static void SumatoriaFilas(int[][] matriz) {
        int[] sumatoriaColumna = new int[matriz.length];
        System.out.println("Sumatoria de cada FILA: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumatoriaColumna[i] += matriz[i][j];
            }
            System.out.print(sumatoriaColumna[i] + "\t");
        }
    }

    private static void MultiplicadorVectorFila(int[] vector, int[][] matriz) {
        int[][] resultador = new int[matriz.length][matriz[0].length];
        System.out.println("La Matriz resultante es: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                resultador[i][j] = matriz[i][j] * vector[j];
                System.out.print(resultador[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
