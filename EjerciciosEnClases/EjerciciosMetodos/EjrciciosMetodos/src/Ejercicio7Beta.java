    
import java.util.Scanner;
public class Ejercicio7Beta {



    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el monto de compra: ");
        double compra = teclado.nextDouble();

        System.out.print("Tipo de cliente (1: Público General, 2: Afiliado): ");
        int tipoCliente = teclado.nextInt();

        System.out.print("Forma de pago (1: Contado, 2: Plazos): ");
        int formaPago = teclado.nextInt();

        double total = calcularMontoFinal(tipoCliente, formaPago, compra);
        System.out.println("Total a pagar: " + total);
    }

    public static double calcularMontoFinal(int tipoCliente, int formaPago, double compra) {
        double ajuste = 0;

        if (tipoCliente == 1) { // Público General
            ajuste = (formaPago == 1) ? -0.15 : 0.10;
        } else if (tipoCliente == 2) { // Afiliado
            ajuste = (formaPago == 1) ? -0.20 : 0.05;
        }

        return compra + (ajuste * compra);
    }
}


