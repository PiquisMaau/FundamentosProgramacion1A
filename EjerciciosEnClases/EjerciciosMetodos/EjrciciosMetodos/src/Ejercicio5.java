import java.util.Scanner;

public class Ejercicio5 {
    // Enunciado: Dado un carácter, determinar si es vocal, letra mayúscula, letra
    // minúscula, número o símbolo.
    public static void LeeImprimeCaracter() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("========== Lectura de Caractér ==========");
        System.out.print("Ingresa un digito para determinar que tipo de carácter es: ");
        String Digito = teclado.next();
        char caracter = Digito.charAt(0);

        DeterminaciondeDigito(caracter);

    }

    public static void DeterminaciondeDigito(char CARACTER) {
        switch (Character.getType(CARACTER)) {
            case Character.UPPERCASE_LETTER:
                System.out.println(CARACTER + " es una letra mayúscula.");
                break;
            case Character.LOWERCASE_LETTER:
                System.out.println(CARACTER + " es una letra minúscula.");
                break;
            case Character.DECIMAL_DIGIT_NUMBER:
                System.out.println(CARACTER + " es un número.");
                break;
            default:
            
            if ("AEIOUaeiou".indexOf(CARACTER) != -1) {
                    System.out.println(CARACTER + " es una vocal.");
                } else {
                    System.out.println(CARACTER + " es un símbolo.");
                }
                break;
        }

    }

    public static void main(String[] args) {
        LeeImprimeCaracter();
    }

}
