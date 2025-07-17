import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[][] matrizCoeficientes = new double[2][2];
        double[] matrizResultados = new double[2];
        System.out.println("Ingrese los coeficientes de la ecuación 1: ");
        matrizCoeficientes[0][0] = teclado.nextDouble();
        matrizCoeficientes[0][1] = teclado.nextDouble();
        matrizResultados[0] = teclado.nextDouble();

        System.out.println("Ingrese los coeficientes de la ecuación 2: ");
        matrizCoeficientes[1][0] = teclado.nextDouble();
        matrizCoeficientes[1][1] = teclado.nextDouble();
        matrizResultados[1] = teclado.nextDouble();

        double DeterminantePrincipal = determinante(matrizCoeficientes);

        if (DeterminantePrincipal != 0) {
            double[][] matrizDx = {
                    { matrizResultados[0], matrizCoeficientes[0][1] },
                    { matrizResultados[1], matrizCoeficientes[1][1] }
            };
            double DeterminanteX = determinante(matrizDx);

            double[][] matrizDy = {
                    { matrizCoeficientes[0][0], matrizResultados[0] },
                    { matrizCoeficientes[1][0], matrizResultados[1] }
            };
            double DeterminanteY = determinante(matrizDy);

            double x = DeterminanteX / DeterminantePrincipal;
            double y = DeterminanteY / DeterminantePrincipal;

            System.out.printf("Solución del sistema:" + " x = " + x + " y = " + y);
        } else {
            System.out.println("El sistema no tiene solución única.");
        }

    }

    private static double determinante(double[][] matriz) {
        return (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
    }
}
