import java.util.Scanner;

public class Ejercicio11{
    public void ImprimiryLeer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------- Ingreso de Datos ------------");
        System.out.print("Ingrese coordenadas de P1 (x1,y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.print("Ingrese coordenadas de P2 (x2,y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        System.out.print("Ingrese coordenadas de P3 (x3,y3): ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        double area = calcularSuperficie(x1, y1, x2, y2, x3, y3);
        System.out.println("La superficie del triángulo es: " + area);
    }
    

    public double calcularSuperficie(double x1, double y1, double x2, double y2, double x3, double y3) {
        return 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
    }

    public static void main(String[] args) {
        
        Ejercicio11 superficieTriangulo = new Ejercicio11();
        superficieTriangulo.ImprimiryLeer();
}
}