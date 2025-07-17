package programacion2025;

import java.util.Random;

public class Vectore4 {

    public static void main(String[] args) {
        Random ale = new Random();
        int contador = 0;
        int total = 0;
        while (contador < 3) {
            int num1 = ale.nextInt(6) + 1;
            int num2 = ale.nextInt(6) + 1;
            total++;
            if (num1 == num2) {
                System.out.println(num1+"-"+num2);
                contador++;

            }
        }
        System.out.println(contador);
        System.out.println(total);
    }
   
}
