import java.util.Random;

public class Ejercicio1 {
    public static void main(String[] args) {

        // Item1 - Crea una tabla bidimensional de longitud 5x5 y nombre "Matriz"
        int[][] Matriz = new int[5][5];

        // Item2 - Carga la tabla con valores numericos enteros.
        // Lo cargue con números aleatorios entre el 1 y el 10
        Random random = new Random();
        for (int i = 0; i < Matriz[0].length; i++) {
            for (int f = 0; f < Matriz.length; f++) {
                Matriz[i][f] = random.nextInt(1, 10 + 1);
                System.out.print(Matriz[i][f] + "\t ");
            }
            System.out.println("\n");
        }

        // Item3 - Suma todos los elementos de cada fila y todos los elementos de
        // cada columna visualizando los resultados en pantalla.
        int[] SumaFilas = new int[Matriz.length];
        int[] SumaColumnas = new int[Matriz[0].length];
        for (int f = 0; f < Matriz.length; f++) {
            for (int c = 0; c < Matriz[0].length; c++) {
                SumaFilas[f] += Matriz[f][c]; 
                SumaColumnas[c] += Matriz[f][c]; 
            }
        }

        System.out.println("Sumatoria por filas:");
        for (int f = 0; f < SumaFilas.length; f++) {
            System.out.println("Fila " + (f+1) + ": " + SumaFilas[f]);
        }

        System.out.println("Sumatoria por columnas:");
        for (int c = 0; c < SumaColumnas.length; c++) {
            System.out.println("Columna " + (c+1) + ": " + SumaColumnas[c]);
        }

    }
}
