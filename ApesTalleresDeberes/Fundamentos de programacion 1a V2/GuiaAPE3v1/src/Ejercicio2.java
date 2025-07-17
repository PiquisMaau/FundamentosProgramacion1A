import java.util.Scanner;

public class Ejercicio2 {

    public void LeerImprimir() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("---------- Ingresa los Datos ----------");
        System.out.println("Ingresa el valor de 5 Números: ");
        int Numero1 = teclado.nextInt();
        int Numero2 = teclado.nextInt();
        int Numero3 = teclado.nextInt();
        int Numero4 = teclado.nextInt();
        int Numero5 = teclado.nextInt();
        
        System.out.println("La sumatoria de tus números es: "+SumaNumeros(Numero1, Numero2, Numero3, Numero4, Numero5));

    }

    public int SumaNumeros(int n1, int n2, int n3, int n4, int n5) {
        int Sumatoria = n1+n2+n3+n4+n5;
        return Sumatoria;

    }

    public static void main(String[] args) {

        Ejercicio2 metodos1 = new Ejercicio2();
        metodos1.LeerImprimir();


    }

}
