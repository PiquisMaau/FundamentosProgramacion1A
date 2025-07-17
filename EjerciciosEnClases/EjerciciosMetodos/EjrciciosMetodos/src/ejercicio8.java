import java.util.Scanner;

public class ejercicio8 {
    /*
     * Enunciado: Lea un número y devuelva el número en forma inversa; por ejemplo,
     * si ingresa 123, su número
     * inver do 321; si ingresa 12345, número invertido 54321.
     */
    public static void LeerImprimir() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("========== Lesctura de DATOS ==========");
        System.out.print("Ingresa un número para hallar su inverso: ");
        int Numero = teclado.nextInt();

        System.out.println("El numero Invertido es: "+invertirNumero(Numero));

    }

    public static int invertirNumero(int numero) {
        int invertido = 0;
        while (numero > 0) {
            int digito = numero % 10; 
            invertido = invertido * 10 + digito; 
            numero /= 10;
        }
        return invertido;
    }

    public static void main(String[] args) {
        LeerImprimir();
    }
}
