public class Estudio {

    public static void main(String[] args) {

        int[][] MatrizA = {
                { 20, 70, 35, 22, 40, 11 },
                { 50, 80, 80, 23, 50, 12 },
                { 10, 60, 1, 50, 30, 30 },
                { 30, 50, 2, 40, 20, 50 },
                { 20, 90, 20, 35, 10, 3 }
        };

        // Hallar la sumatoria de columnas pares (índices 0, 2, 4)
        for (int j = 0; j < MatrizA[0].length; j++) {
            if (j % 2 != 0) { // columna par
                int sumatoria = 0;
                for (int i = 0; i < MatrizA.length; i++) {
                    sumatoria += MatrizA[i][j];
                }
                System.out.println("Sumatoria de la columna " + (j + 1) + " es: " + sumatoria);
            }
        }

        // Hallar la sumatoria de cada fila
        for (int index = 0; index < MatrizA.length; index++) {
            int sumatoria = 0;
            for (int i = 0; i < MatrizA[0].length; i++) {
                sumatoria += MatrizA[index][i];
            }
            System.out.println("La sumatoria de la fila " + (index + 1) + " es: " + sumatoria);

        }

        // Hallar el mayor valor
        int NumroMayor = 0;

        for (int i = 0; i < MatrizA.length; i++) {
            for (int index = 0; index < MatrizA[0].length; index++) {

                if (NumroMayor < MatrizA[i][index]) {
                    NumroMayor = MatrizA[i][index];
                }

            }

        }
        System.out.println("El numero mayor encontrado es: "+NumroMayor);

        // Mostrar el promedio de cada fila en una columna nueva
        for (int i = 0; i < MatrizA.length; i++) {
            int sumatoria = 0;
            double promedio = 0;
            for (int index = 0; index < MatrizA[0].length; index++) {
                sumatoria += MatrizA[i][index];
                promedio = sumatoria / (MatrizA[0].length );
            }
            System.out.println(promedio);
        }

        // Mostrar el promedio de cada fila
        for (int i = 0; i < MatrizA.length; i++) {
            int sumatoria = 0;
            for (int j = 0; j < MatrizA[0].length; j++) {
                sumatoria += MatrizA[i][j];
            }
            double promedio = (double) sumatoria / MatrizA[0].length;
            System.out.println("Promedio de la fila " + i + " es: " + promedio);
        }

    }
}
