import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class NotaFISEI {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float Nota1, Nota2, Nota3, Promedio;
        System.out.println("PROMEDIO DE CALIFICACIONES");
        System.out.println("Ingrese la nota 1");
        Nota1 = teclado.nextFloat();
        System.out.println("Ingrese la nota 2");
        Nota2 = teclado.nextFloat();
        System.out.println("Ingrese la nota 3");
        Nota3 = teclado.nextFloat();

    
        Promedio = (Nota1+Nota2+Nota3)/3;
     //   String Resultado = (Promedio>=7)? "Aporobado":(Promedio<7&&Promedio>=5.5)?"Suspenso":"Reprobado";
        if(Promedio>=7&&Promedio<=10){
            System.out.println("Aprobado con: "+ (Promedio));
        }else{
            if(Promedio>=5.5&&Promedio<7){
                System.out.println("Suspenso con: "+ Promedio);
            }
            else{
                System.out.println("Reprobado con: "+ Promedio);
            }
        }

    }

}
