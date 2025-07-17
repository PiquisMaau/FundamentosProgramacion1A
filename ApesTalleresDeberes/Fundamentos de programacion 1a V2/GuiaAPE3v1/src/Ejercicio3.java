import java.util.Scanner;

public class Ejercicio3 {

    public void LeerImprimir() {
        Scanner teclado = new Scanner(System.in);
        int RangoInicial, RangoFinal;
        String Repeticion = "N";
        do{
        System.out.println("---------- Ingreso de Datos -------------");
        System.out.print("Ingresa un rango inicial: ");
         RangoInicial = teclado.nextInt();
        System.out.print("Ingresa un rango final: ");
         RangoFinal = teclado.nextInt();

        System.out.println("El Promedio de numeros es: " + PromedioNumeros(RangoInicial, RangoFinal));
        System.out.println("El Promedio de numeros pares es: " + PromedioPares(RangoInicial, RangoFinal));
        System.out.println("El Promedio de numeros impares es: " + PromedioImpares(RangoInicial, RangoFinal));
        System.out.println("El Promedio de numeros primos es: " + PromedioPrimos(RangoInicial, RangoFinal));
        System.out.println("Deseas realizarlo otra vez? S/N");
        Repeticion = teclado.next();
        } while (Repeticion != "S"|| Repeticion != "s");

    }

    public double PromedioNumeros(int RangoInicial, int RangoFinal) {
        int Sumatoria = 1;
        for (int i = RangoInicial; i <= RangoFinal; i++) {
            Sumatoria += i;
        }
        double Promedio = Sumatoria / RangoFinal;
        return Promedio;

    }

    public double PromedioPares(int RangoInicial, int RangoFinal) {
        int Sumatoria = 0;
        for (int i = RangoInicial; i <= RangoFinal; i++) {
            if (i % 2 == 0) {
                Sumatoria += i;
            }
        }
        double Promedio = Sumatoria / RangoFinal;
        return Promedio;

    }

    public double PromedioImpares(int RangoInicial, int RangoFinal) {
        int Sumatoria = 0;
        if (RangoInicial % 2 == 0) {
            for (int i = RangoInicial; i <= RangoFinal; i += 1) {
                Sumatoria += i;
            }
        } else {
            for (int i = RangoInicial; i <= RangoFinal; i += 2) {
                Sumatoria += i;
            }
        }

        double Promedio = Sumatoria / RangoFinal;
        return Promedio;

    }

    public double PromedioPrimos(int RangoInicial, int RangoFinal) {
        int Sumatoria = 0;
        int divisores = 0;
        for (int i = RangoInicial; i <= RangoFinal; i++) {
            if (esPrimo(i)) {
                Sumatoria += i;

            }
        }

        double Promedio = Sumatoria/RangoFinal;
        return Promedio;
    }
    public static boolean esPrimo(int numero) {
        if (numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Ejercicio3 ejercicio3 = new Ejercicio3();
        ejercicio3.LeerImprimir();

    }

}
