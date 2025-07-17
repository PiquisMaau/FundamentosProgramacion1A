import java.util.Random;
import java.util.Scanner;

public class Ejercicio {

    public static void imprimirLEER() {

    }
    /*
     * public static double[] CrearVector(double[] vector){
     * Scanner teclado = new Scanner(System.in);
     * for (int i = 0; i < vector.length; i++) {
     * System.out.print("Ingresa los datos: ");
     * vector[i] = teclado.nextDouble();
     * }
     */

    public static void GenerarValoresAleatorios(int[] vector, int valorI, int valorF) {
        Random Randm = new Random();

        for (int i = 0; i < vector.length; i++) {
            vector[i] = Randm.nextInt(valorI, valorF + 1);
        }
    }

    public static void ImprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
    

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Requerimiento 1 - Crear Vector
        int longitud = 0;
        int[] vector;
        System.out.println("Ingresa la longitud del vector: ");
        longitud = teclado.nextInt();
        vector = new int[longitud];

        // Cargar valores e imprimir
        GenerarValoresAleatorios(vector, 20, 59);
        ImprimirVector(vector);
    }

}
