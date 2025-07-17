import java.util.Scanner;

public class Ejercicio9 {
    /*Enunciado: Dada una palabra, determinar si es palíndromo (una palabra es palíndromo si se lee igual de 
izquierda a derecha o de derecha a izquierda), por ejemplo ANA.  */

public static void LecturaImpresion(){
    Scanner teclado = new Scanner(System.in);
        System.out.println("========== Lesctura de PALABRA ==========");
        System.out.print("Ingresa una posible palabra palíndroma: ");
        String palabra_ = teclado.next();
        System.out.println(ProcesoPalindromo(palabra_));
       
}
    public static String ProcesoPalindromo(String palabra) {
        int inicio = 0, fin = palabra.length() - 1;

        while (inicio < fin) {
            if (palabra.charAt(inicio) != palabra.charAt(fin)) {
                return palabra + " no es un palíndromo.";
            }
            inicio++;
            fin--;
        }
        return palabra + " es un palíndromo.";
    }

    public static void main(String[] args) {
        LecturaImpresion();
        
    }
}



