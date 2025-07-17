import java.util.Scanner;

public class Ejercicio7beta {

    public void leerImprimir() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("----------- Lectura de Datos ----------");
        System.out.print("Ingresa una palabra posiblemente palíndroma: ");
        String palabra = teclado.nextLine();

        if (esPalindromo(palabra)) {
            System.out.println(palabra + " es un palíndromo.");
        } else {
            System.out.println(palabra + " no es un palíndromo.");
        }
    }

    public boolean esPalindromo(String palabra) {
        palabra = palabra.toLowerCase();
        String palabraInvertida = new StringBuilder(palabra).reverse().toString();
        return palabra.equals(palabraInvertida);
    }

    public static void main(String[] args) {
        Ejercicio7beta palabra1 = new Ejercicio7beta();
        palabra1.leerImprimir();
    }
}




