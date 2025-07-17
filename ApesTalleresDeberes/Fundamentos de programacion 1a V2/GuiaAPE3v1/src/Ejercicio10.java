import java.util.Scanner;

public class Ejercicio10 {
    public void LeerImprimirHexaedro(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------- Dimensiones de un Hexaedro ----------");
        System.out.print("Ingresa el lado del hexaedro: ");
        double lado = scanner.nextDouble();

        System.out.println("El Área de la base es: " + calcularAreaBase(lado));
        System.out.println("El Área lateral es: " + calcularAreaLateral(lado));
        System.out.println("El Área total es: " + calcularAreaTotal(lado));
        System.out.println("El Volumen es: " + calcularVolumen(lado));

    }

    public double calcularAreaBase(double lado) {
        return Math.pow(lado, 2); 
    }

    public double calcularAreaLateral(double lado) {
        return 4 * Math.pow(lado, 2); 
    }

    public double calcularAreaTotal(double lado) {
        return 6 * Math.pow(lado, 2); 
    }

    public double calcularVolumen(double lado) {
        return Math.pow(lado, 3);
    }

    public static void main(String[] args) {
        Ejercicio10 hexaedro1 = new Ejercicio10();
        hexaedro1.LeerImprimirHexaedro();
        
    }
}