import java.util.Scanner;

public class Ejercicio12 {

    public void LecturaImprimir(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------- Ingreso de Datos ------------");

        System.out.print("Ingrese el perímetro de la base del prisma: ");
        double perimetro = scanner.nextDouble();
        System.out.print("Ingrese la apotema de la base del prisma: ");
        double apotema = scanner.nextDouble();
        System.out.print("Ingrese la altura del prisma: ");
        double altura = scanner.nextDouble();

        System.out.println("Área de la base: " + calcularAreaBase(perimetro, apotema));
        System.out.println("Área lateral: " + calcularAreaLateral(perimetro, altura));
        System.out.println("Área total: " + calcularAreaTotal(perimetro, apotema, altura));
    }

    public static double calcularAreaBase(double perimetro, double apotema) {
        return (perimetro * apotema) / 2;
    }

    public static double calcularAreaLateral(double perimetro, double altura) {
        return perimetro * altura;
    }

    public static double calcularAreaTotal(double perimetro, double apotema, double altura) {
        double areaBase = calcularAreaBase(perimetro, apotema);
        double areaLateral = calcularAreaLateral(perimetro, altura);
        return (2 * areaBase) + areaLateral;
    }

    public static void main(String[] args) {
        Ejercicio12 prisma = new Ejercicio12();
        prisma.LecturaImprimir();
        
    }
}

