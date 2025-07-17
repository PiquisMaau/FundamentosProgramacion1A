public class TemperaturasconMatrizalRevez {

    public static void main(String[] args) {
        // Matriz transpuesta: 3 filas (Tmax, Tmin, Tmedia) x 5 columnas (días)
        double[][] matriz = {
            { 20, 18, 22, 24, 16 }, 
            { 8, 5, 6, 7, 5 },      
            { 0, 0, 0, 0, 0 }       
        };

        CalcularTemperaturaMedia(matriz);
        Imprimir(matriz);
    }

    private static void CalcularTemperaturaMedia(double[][] matriz) {
        for (int i = 0; i < matriz[0].length; i++) {
            matriz[2][i] = DefinirDosDecimales((matriz[0][i] + matriz[1][i]) / 2);
        }
    }

    public static double DefinirDosDecimales(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    private static void Imprimir(double[][] matriz) {
        String[] etiquetas = { "Temp. Máxima", "Temp. Mínima", "Temp. Media" };
        System.out.println("Tipo/Día\tDía 1\tDía 2\tDía 3\tDía 4\tDía 5");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(etiquetas[i] + "\t");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void TemperaturaMaximaMedia(double[][] matriz){

    }
}
