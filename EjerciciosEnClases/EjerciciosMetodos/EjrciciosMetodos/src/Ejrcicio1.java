import java.util.Scanner;

public class Ejrcicio1 {

    // Enunciado: Hallar el área y el perímetro de un de un cuadrado, cree un procedimiento para realizar dicha tarea.

    public static void LeerImprimir(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("========== Ingreso de DATOS ==========");
        System.out.print("Ingresa un lado del cuadrado: ");
        int lado = teclado.nextInt();

        System.out.println("EL PERIMÉTRO ES: " + PerimetroCuadrado(lado));
        System.out.print("EL ÁREA ES: " + AreaCuadrado(lado));
        


    }

    public static double AreaCuadrado(int lado1){
        
        double Area = Math.pow(lado1, 2);
        return Area;

    }

    public static int PerimetroCuadrado(int lado1){
        int Perimetro = lado1 * 4;
        return Perimetro;

    }
    public static void main(String[] args) {

        LeerImprimir();
        
    }


}
