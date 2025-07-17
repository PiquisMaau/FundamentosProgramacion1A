import java.util.Scanner;

public class Ejercicio6 {
    public void SumaImparPar(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("---------- Leer Datos ----------");
        System.out.print("Ingresa el valor de un número para resolver: ");
        int Numero = teclado.nextInt();

        System.out.println(sumaPares(Numero));
        System.out.println(sumaImpares(Numero));

    }

   public static int sumaPares(int numero) {
        int suma = 0;
        while (numero > 0) {
            int digito = numero % 10;
            if (digito % 2 == 0) {
                suma += digito;
            }
            numero /= 10;
        }
        return suma;
    }

    public static int sumaImpares(int numero) {
        int suma = 0;
        while (numero > 0) {
            int digito = numero % 10;
            if (digito % 2 != 0) {
                suma += digito;
            }
            numero /= 10;
        }
        return suma;
    }public static void main(String[] args) {
    Ejercicio6 obj1 = new Ejercicio6();
    obj1.SumaImparPar();
}

}
