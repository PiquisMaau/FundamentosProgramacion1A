import java.util.Scanner;

public class Ejercicio4 {

    public void LeerDatosImprimir() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("---------- Leer Datos ----------");
        System.out.print("Ingresa una frase: ");
        String frase = teclado.nextLine();
   System.out.println("LA CANTIDAD DE VOCALES EN TU FRASE ES: "+CantidadVocales(frase));
System.out.println("LA CANTIDAD DE PALABRAS EN TU FRASE ES: "+CantidadPalabras(frase));
        System.out.println("LA CANTIDAD DE LETRAS EN TU FRASE ES: "+CantidadLetras(frase));
     
        
    }

    public int CantidadPalabras(String frase) {
        if (frase == null || frase.trim().isEmpty()) {
            return 0;
        }

        int contador = 1;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contador++;
            }
        }
        return contador;
    }

    public int CantidadLetras(String frase) {
        int longitud = frase.length();
        int contador = 0;
        for (int i = 0; i <= longitud; i++) {
            contador++;

        }
        return contador - CantidadPalabras(frase) - 1;

    }

    public int CantidadVocales(String frase) {
        int contador = 0; 
        int longitud = frase.length();
        
        for (int i = 0; i < longitud; i++) { 
            char caracter = Character.toLowerCase(frase.charAt(i)); 
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }
        return contador;
    }



    public static void main(String[] args) {
        Ejercicio4 ejecucion = new Ejercicio4();
        ejecucion.LeerDatosImprimir();
    }

}
