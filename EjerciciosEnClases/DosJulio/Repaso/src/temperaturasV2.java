import java.util.Random;
import java.util.Scanner;

public class temperaturasV2 {

    public static void main(String[] args) {

        double[] Tmax = { 20, 18, 22, 24, 16 };
        double[] Tmin = { 8, 5, 6, 7, 5 };
        
        double[] Tmedia = new double[Tmax.length];

        //cargarManuelmenteVector(Tmax);
        //cargarManuelmenteVector(Tmin);
        CargarAleatoriamente(Tmax, 15, 26);
        CargarAleatoriamente(Tmin, 2, 14);

        //Ítem 1: Calcular la temperatura media.
        TemperaturaMedia(Tmax, Tmin, Tmedia);

        // Imprimir Datos
        ImprimirTemperaturas(Tmax, Tmin, Tmedia);

        //Ítem 2: Dia con la temperatura promedio más alta
        TemperaturaMyor(Tmedia);

        //Ítem 3: Dia con la temperatura promedio más baja
        TemperaturaMediaMenor(Tmedia);

    }

    public static double DefinirDosDecimales(double value){
        return Math.round(value * 100.0)/100.0;
    }

    private static void CargarAleatoriamente(double [] pastelito, double minimo, double maximo){
        Random random = new Random();
        System.out.println("Calgado randomicamente");
        for (int i = 0; i < pastelito.length; i++) {
            pastelito[i] = DefinirDosDecimales(random.nextDouble(minimo, maximo+1));
        }

    }

    private static void cargarManuelmenteVector(double [] pastelito){
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Calgando Vector");
        for (int i = 0; i < pastelito.length; i++) {
            System.out.println("Ingrese el valor: ");
            pastelito[i] = Teclado.nextDouble();
        }
    }

    private static void TemperaturaMediaMenor(double[] Tmedia) {
        int posicion;
        int dia;
        double TemperaturaMInima;
        TemperaturaMInima = Tmedia[0]; 
        posicion = 0;
        for (int i = 0; i < Tmedia.length; i++) {
            if (TemperaturaMInima > Tmedia[i]) {
                DefinirDosDecimales(TemperaturaMInima=Tmedia[i]);
                posicion = i;
            }
        }
        dia = posicion+1;
        System.out.println("El día com mayor temperatura es: "+dia);
    }

    private static void TemperaturaMyor(double[] Tmedia) {
        double TemperaturaMaxima;
        int posicion;
        int dia;
        TemperaturaMaxima = Tmedia[0]; 
        posicion = 0;
        for (int i = 0; i < Tmedia.length; i++) {
            if (TemperaturaMaxima < Tmedia[i]) {
                TemperaturaMaxima=Tmedia[i];
                posicion = i;
            }
        }
        dia = posicion+1;
        System.out.println("El día com mayor temperatura es: "+dia);
    }

    private static void TemperaturaMedia(double[] Tmax, double[] Tmin, double[] Tmedia) {
        for (int i = 0; i < Tmedia.length; i++) {
            DefinirDosDecimales(Tmedia[i] = (Tmax[i] + Tmin[i]) / 2);
        }
    }

    private static void ImprimirTemperaturas(double[] Tmax, double[] Tmin, double[] Tmedia) {
        System.out.println("La temperatura máxima " + "\t" + "Temperatura minima " + "\t" + "Temperatura Media");

        for (int i = 0; i < Tmedia.length; i++) {
            System.out.println(Tmax[i] + "\t" + Tmin[i] + "\t" + DefinirDosDecimales(Tmedia[i]));
        }
    }

}
