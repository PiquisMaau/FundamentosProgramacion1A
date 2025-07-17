import java.util.Scanner;

public class Vectores {

    /*
     * public static void ImprimirLongitudVectorEntero(Object[] vector){
     * //Conversion de Object --> al tipo de dato del vector
     * //Investigarlo
     * System.out.println(vector.length);
     * 
     * }
     */

    public static void ImprimirvectoresEnteros(int[] vector) {
        System.out.println("Imprimir Vector");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }

    public static void ImprimirVectoresDoubles(double[] vector) {
        System.out.println("Imprimir Vector");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }

    public static double PromedioVectores(double[] vector) {
        double Sumatoria = 0, Promedio;
        System.out.println("Imprimir Vector");
        for (int i = 0; i < vector.length; i++) {
            Sumatoria += vector[i];
        }
        Promedio = Sumatoria / vector.length;
        return Promedio;

    }

    public static double Temperaturas(double[] vector) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingreso de data");
        System.out.println("Ingresa 5 temperaturas");
        vector[0] = teclado.nextDouble();
        vector[1] = teclado.nextDouble();
        vector[2] = teclado.nextDouble();
        vector[3] = teclado.nextDouble();
        vector[4] = teclado.nextDouble();
        double Sumatoria = 0, Promedio;
        System.out.println("Imprimir Vector");
        for (int i = 0; i < vector.length; i++) {
            Sumatoria += vector[i];
        }
        Promedio = Sumatoria / vector.length;
        return Promedio;

    }

    public static void leerDatosDoubles(double[] vector) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingresa los datos: ");
            vector[i] = teclado.nextDouble();
        }

    }

    public static double PromTemperaturas(double[] vector) {
        double Sumatoria = 0, Promedio;
        System.out.println("Imprimir Vector");
        for (int i = 0; i < vector.length; i++) {
            Sumatoria += vector[i];
        }
        Promedio = Sumatoria / vector.length;
        return Promedio;

    }

    public static void main(String[] args) {
        // Maneras de crear Arrays
        // Metodo 1: Crearlos con una longitud definida
        int[] edades = new int[6];
        edades[0] = 5;
        edades[1] = 5;
        edades[2] = 4;
        edades[3] = 2;
        edades[4] = 8;
        edades[5] = 4;

        String[] prfes = new String[2];
        prfes[0] = "Mijita0";
        prfes[1] = "Pastelito";

        // Metodo 2: Vectores preestablecidos
        double[] calificaciones = new double[] { 5.4, 7.8, 3.2, 9.2, 2.4, 8.7, 7.8 };
        // Omitiendo la instanciación
        int[] estaturas = { 123, 135, 156, 167, 189, 146, 176, 185, 300 };

        // Metodo 3: Bajo demanda, porque el vector puede agarrar datos
        // 1. Declaro un vector
        int[] delitos;
        int longitudVector = 5;
        // Instanciar
        delitos = new int[longitudVector];
        delitos[0] = 123;
        delitos[1] = 1245;
        delitos[2] = 1678;
        delitos[3] = 1545;
        delitos[4] = 1238;

        // Longitud de los vectores
        System.out.println("Vector edades = " + edades.length);
        System.out.println("Vector profesores = " + prfes.length);
        System.out.println("Vector Calificaciones = " + calificaciones.length);
        System.out.println("Vector estaturas = " + estaturas.length);
        System.out.println("Vector delitos = " + delitos.length);

        /*
         * ImprimirLongitudVectorEntero(edades);
         * ImprimirLongitudVectorEntero(estaturas);
         */

        // Imprimir vector edades
        ImprimirvectoresEnteros(edades);
        ImprimirvectoresEnteros(delitos);
        ImprimirvectoresEnteros(estaturas);

        double[] temperaturas = new double[] { 1, 1, 1, 1, 1 };
        ImprimirVectoresDoubles(calificaciones);
        System.out.println("El promedio es: " + PromedioVectores(calificaciones));
        System.out.println("La remperatura promediada es: " + Temperaturas(temperaturas));


    }

}
