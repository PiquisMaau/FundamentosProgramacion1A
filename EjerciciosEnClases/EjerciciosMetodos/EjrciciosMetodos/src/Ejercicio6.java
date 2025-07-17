import java.util.Scanner;

public class Ejercicio6 {
    // Enunciado: Hallar el área de un rectángulo, cree una función para realizar
    // dicha tarea.
    public static void ImprimirEscribir() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("=========== Ingreso de datos ===========");
        System.out.print("Ingresa la base de tu trángulo: ");
        int base = teclado.nextInt();
        System.out.print("Ingrese la altura de su triángulo: ");
        int altura = teclado.nextInt();
        System.out.println("El Área de tu triángulo es: " + SreaRectangulo(base, altura));

    }

    public static double SreaRectangulo(int Base, int Altura) {

        double Area = (Base * Altura) / 2;
        return Area;

    }

    public static void main(String[] args) {
        ImprimirEscribir();


    }

}
