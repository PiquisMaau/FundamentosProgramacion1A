import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la matriz (n x n): ");
        int n = teclado.nextInt();

        int[][] matrizA = new int[n][n];
        int[][] matrizB = new int[n][n];
        int[][] suma = new int[n][n];
        int[][] producto = new int[n][n];
        int totalElementos = n * n * 2;
        int sumaTotal = 0;
        int maxElemento = Integer.MIN_VALUE;

        System.out.println("Ingrese los elementos de la matriz A:");
        ingresarMatriz(teclado, matrizA, n);
        System.out.println("Ingrese los elementos de la matriz B:");
        ingresarMatriz(teclado, matrizB, n);

        System.out.println("\nMatriz A:");
        imprimirMatriz(matrizA, n);
        System.out.println("\nMatriz B:");
        imprimirMatriz(matrizB, n);

        // Item 1 - Calcular la suma de las dos matrices
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                suma[i][j] = matrizA[i][j] + matrizB[i][j];
                sumaTotal += suma[i][j];
                if (suma[i][j] > maxElemento) {
                    maxElemento = suma[i][j];
                }
            }
        }
        System.out.print("\nItem 1 - ");
        System.out.println("Calcular la suma de las dos matrices.");
        System.out.println("Matriz suma:");
        imprimirMatriz(suma, n);

        // Item 2 - Calcular el promedio de todos los elementos.
        System.out.print("\nItem 2 - ");
        System.out.println("Calcular el promedio de todos los elementos.");
        double promedio = (double) sumaTotal / totalElementos;
        System.out.printf("Promedio de todos los elementos: %.2f\n", promedio);

        // Item 3 - Calcular el producto de las dos matrices.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                producto[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    producto[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }

        }
        System.out.print("\nItem 3 - ");
        System.out.println("Calcular el producto de las dos matrices.");
        System.out.println("Matriz producto:");
        imprimirMatriz(producto, n);
        System.out.println();
        // Item 4 - Determinar el elemento mayor de la matriz resultante de la suma
        System.out.print("Item 4 - ");
        System.out.println("Determinar el elemento mayor de la matriz resultante de la suma.");
        System.out.println("Elemento mayor de la matriz suma: " + maxElemento);
    }

    private static void ingresarMatriz(Scanner teclado, int[][] matriz, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }
    }

    private static void imprimirMatriz(int[][] matriz, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
