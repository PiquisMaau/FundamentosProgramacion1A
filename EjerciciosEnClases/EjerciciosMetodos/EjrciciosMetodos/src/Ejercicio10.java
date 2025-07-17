import java.util.Scanner;

public class Ejercicio10 {
    // Enunciado: Cree una matriz de A de 2x2 y otra B de 2x2, y obtenga una matriz
    // C = A * B.

    public static void LeerImprimir() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("========= Ingreso de DATOS de MATRIZ =========");
        System.out.print("Ingresa valores para la primera matriz A de (2*2): ");
        int MatrizA[][] = new int[2][2];
        MatrizA[0][0] = teclado.nextInt();
        MatrizA[1][0] = teclado.nextInt();
        MatrizA[0][1] = teclado.nextInt();
        MatrizA[1][1] = teclado.nextInt();
        System.out.print("Ingresa valores para la segunda matriz B de (2*2): ");
        int MatrizB[][] = new int[2][2];
        MatrizB[0][0] = teclado.nextInt();
        MatrizB[1][0] = teclado.nextInt();
        MatrizB[0][1] = teclado.nextInt();
        MatrizB[1][1] = teclado.nextInt();

        for (int[] fila : multiplicarMatrices(MatrizA, MatrizB)) {
            for (int valor : fila) {
                System.out.print("| "+valor + " | ");
            }
            System.out.println();
        }

    }

    public static int[][] multiplicarMatrices(int[][] MatrizA_, int[][] MATRIZb_) {
        int[][] MatrizC = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                MatrizC[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    MatrizC[i][j] += MatrizA_[i][k] * MATRIZb_[k][j];
                }
            }
        }
        return MatrizC;
    }

    public static void main(String[] args) {
        LeerImprimir();
    }

}
