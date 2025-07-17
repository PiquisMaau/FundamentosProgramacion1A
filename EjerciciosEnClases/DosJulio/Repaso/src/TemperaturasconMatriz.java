public class TemperaturasconMatriz {

    public static void main(String[] args) {
        double[][] matriz = {
                { 20, 8, 0 }, // Día 1: Tmax, Tmin
                { 18, 5, 0 }, // Día 2
                { 22, 6, 0 }, // Día 3
                { 24, 7, 0 }, // Día 4
                { 16, 5, 0 } // Día 5
        }; // 5 días, 2 temperaturas (Tmax y Tmin)
CalcularTemperaturaMedia(matriz);
        ImprimirMatriz(matriz);
    }

    private static void CalcularTemperaturaMedia(double[][] matriz) {
        // Pregunta 1: Calcular la temperatura media
        System.out.println("Pregunta 1");
        for (int f = 0; f < matriz.length; f++) {
            matriz[f][2] = DefinirDosDecimales((matriz[f][0] + matriz[f][1]) / 2);
        }
    }

    public static double DefinirDosDecimales(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    private static void ImprimirMatriz(double[][] matriz) {
        System.out.println("Día\tT. Máxima\tT. Mínima\tT. Media");
        for (int f = 0; f < matriz.length; f++) {
            System.out.print((f + 1) + "\t");
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.print(matriz[f][c] + "\t\t");
            }
            System.out.println();
        }
    }

}
