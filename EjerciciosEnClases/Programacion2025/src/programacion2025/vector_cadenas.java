package programacion2025;

import java.util.Scanner;
//Ariel Jacho
public class vector_cadenas {

    public static void main(String[] args) {
        String vector[] = new String[5];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese una cadena:");
            vector[i] = teclado.next();
        }

        String[] vector2 = new String[5];
        int j =4;

        for (int i = 0; i < 5; i++) {
            vector2[j] = vector[i];
            j--;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(vector[i] + "\t" + vector2[i]);
        }
    }
}
