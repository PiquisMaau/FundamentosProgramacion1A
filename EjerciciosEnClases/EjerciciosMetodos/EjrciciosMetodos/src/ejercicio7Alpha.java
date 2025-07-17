import java.util.Scanner;

public class ejercicio7Alpha {
    /*
     * Enunciado: Un negocio tiene dos tipos de cliente: público en general (G) y
     * cliente afiliado (A). Acepta dos formas de pago: al contado (C) y en plazos
     * (P). Nos piden crear un programa que, al ingresar el monto de la compra,
     * obtenga el monto del descuento o el monto del recargo y el total a pagar
     */
    public static void LeerImprimi() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("=========== Recolección de DATOS =========");
        System.out.print("Ingresa el monto de compra: ");
        double Compra = teclado.nextDouble();
        System.out.println("Ingresa el tipo de cliente: ");
        System.out.print("Publico General(1) ----- Cliente Afiliado(2): ");
        int tipo = teclado.nextInt();
        System.out.println("Ingresa la forma de pago del cliente:");
        System.out.print("Contado(1) ----- Plazos(2): ");
        int Pago = teclado.nextInt();

        switch (tipo) {
            case 1:
                switch (Pago) {
                    case 1:
                        System.out.println("El descuento es: "+DescuentoPublicoGeneral(tipo, Pago, Compra));
                        break;
                    case 2:
                    System.out.println("El recargo es: "+
                        RecargoPublicoGeneral(tipo, Pago, Compra));

                        break;
                }

                break;
            case 2:
                switch (Pago) {
                    case 1:
                    System.out.println("El descuento es: "+
                        DescuentoAfiliado(tipo, Pago, Compra));
                        break;
                    case 2:
                    System.out.println("El recargo es: "+
                        RecargoAfiliado(tipo, Pago, Compra));
                        break;
                }

                break;
        }

    }

    public static double DescuentoPublicoGeneral(int tipo_, int Pago_, double compra_) {
        double descuento = 0;
        if (tipo_ == 1 && Pago_ == 1) {
            descuento = .15;
        }
        compra_ -= descuento * compra_;
        return compra_;

    }

    public static double RecargoPublicoGeneral(int tipo_, int Pago_, double compra_) {
        double recargo = 0;
        if (tipo_ == 1 && Pago_ == 2) {
            recargo = .10;
        }
        compra_ += recargo * compra_;
        return compra_;

    }

    public static double DescuentoAfiliado(int tipo_, int Pago_, double compra_) {
        double descuento = 0;
        if (tipo_ == 2 && Pago_ == 1) {
            descuento = .20;
        }
        compra_ -= descuento * compra_;
        return compra_;

    }

    public static double RecargoAfiliado(int tipo_, int Pago_, double compra_) {
        double recargo = 0;
        if (tipo_ == 2 && Pago_ == 2) {
            recargo = .05;
        }
        compra_ += recargo * compra_;
        return compra_;

    }
    public static void main(String[] args) {
        LeerImprimi();
    }

}
