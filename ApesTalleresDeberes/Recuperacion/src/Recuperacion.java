import java.util.Scanner;

public class Recuperacion {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa el Tipo de credito que necesitas: ");
        System.out.println("1. Hipotecario de Interés Público(8%) | 2. Hipotecario(9%) | 3. Consumo(14%) | 4. Educación(11%) ");
        int TCredito = teclado.nextInt();

        System.out.println("Ingresa el monto que deseas($): ");
        double Monto = teclado.nextDouble();

        System.out.println("Ingresa el tiempo en el que deseas pagarlo en meses: ");
        int Tiempo = teclado.nextInt();

        System.out.println("Ingresa el tipo de amortización con el que deseas trabajar: ");
        System.out.println("1. Amortización Francesa | 2. Amortización Alemana");
        int Amortizacion = teclado.nextInt();

        double Interes = 0; 

        while (TCredito < 1 || TCredito > 4) {
            System.out.println("Opción no válida. Ingresa un tipo de crédito válido (1 a 4): ");
            TCredito = teclado.nextInt();
        }
//Para sacar la tasa de interes mensual dividimos la tasa de interes anual para 12 que son los meses del año y este resultado luego lo dividimos pa 100.
        switch (TCredito) {
            case 1:
                Interes = 8 / 12.0 / 100; 
                break;
            case 2:
                Interes = 9 / 12.0 / 100;
                break;
            case 3:
                Interes = 14 / 12.0 / 100;
                break;
            case 4:
                Interes = 11 / 12.0 / 100;
                break;
            default:
                System.out.println("Tipo de crédito no válido");
        }


        System.out.println("Tasa de interés mensual: " + (Interes * 100) + "%");


        switch (Amortizacion) {
            case 1: 

                double cuota = Monto * (Interes * Math.pow(1 + Interes, Tiempo)) /(Math.pow(1 + Interes, Tiempo) - 1);

                System.out.printf("\nCuota mensual fija: %.2f\n\n", cuota);
                System.out.println("Mes\tCuota\t\tInterés\t\tAmortización\tSaldo");

                double saldo = Monto;

                for (int mes = 1; mes <= Tiempo; mes++) {
                    double intereses = saldo * Interes;
                    double amortizacion = cuota - intereses;
                    saldo -= amortizacion;

                    System.out.println("Mes: " + mes + " | Cuota: " + String.format("%.2f", cuota) + " | Interés: " + String.format("%.2f", intereses) +
                    " | Amortización: " + String.format("%.2f", amortizacion) + " | Saldo: " + String.format("%.2f", Math.max(saldo, 0)));

                }
                break;

            case 2: 
                double amortizacionConstante = Monto / Tiempo;
                System.out.println("Amortización constante mensual: " + amortizacionConstante);

                saldo = Monto;
                for (int mes = 1; mes <= Tiempo; mes++) {
                    double interesMes = saldo * Interes;
                    double cuotaTotal = amortizacionConstante + interesMes;

                    saldo -= amortizacionConstante;

                    System.out.println("Mes: " + mes + " | Cuota: " + String.format("%.2f", cuotaTotal) + " | Interés: " + String.format("%.2f", interesMes) +
                            " | Amortización: " + String.format("%.2f", amortizacionConstante) + " | Saldo: " + String.format("%.2f", Math.max(saldo, 0)));
                }
                break;

            default:
                System.out.println("Amortización no válida");
        }
    }
}