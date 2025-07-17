public class Ejercicio2 {
    public static void main(String[] args) {
        // Item1 - Crea una tabla bidimensional de longitud 5x5 y de nombre "Diagonal"
        int[][] Diagonal = new int[5][5];

        // Item2: Carga la tabla de forma que los componentes pertenecientes a la
        // diagonal de la matriz tomen el valor 1 y el resto el valor 0.

        for (int f = 0; f < Diagonal.length; f++) {
            for (int c = 0; c < Diagonal[0].length; c++) {
                if (f == c) {
                    Diagonal[f][c] = 1;
                }
                System.out.print(Diagonal[f][c] + "\t");
            }
            System.out.println("\n");
        }
        {
        }

    }
}
